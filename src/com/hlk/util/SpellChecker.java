package com.hlk.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class SpellChecker {
	
	private static final char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	public String start(String input) throws IOException {
		//1.构建语言模型
		String path = "E:\\big.txt";
		Map<String, Double> languModel = buildLanguageModel(path);
		Set<String> dictionary = languModel.keySet();
		List<String> guessWords = null;
		
		//2.获取读者输入的单词
		while(input != null) {
			input = input.trim().toLowerCase();
			if("bye".equals(input))
				break;
			if(dictionary.contains(input))
				continue;
			long startTime = System.currentTimeMillis();
			
			//3.在编辑距离内设置一个单词集，并删除字典中不存在的单词
			
//			Set<String> wordsInEditDistance2 = buildEditDistance2Set(languModel, input);
//            wordsInEditDistance2.retainAll(dictionary);
			Set<String> wordsInEditDistance = buildEditDistance1Set(languModel, input);
            wordsInEditDistance.retainAll(dictionary);
            if(wordsInEditDistance.isEmpty()) {
                  wordsInEditDistance = buildEditDistance2Set(languModel, input);
                  wordsInEditDistance.retainAll(dictionary);
                  if (wordsInEditDistance.isEmpty()) {
                         return "false";
                  }
            }
			// 4.计算所以可能的概率
            // c - correct word we guess, w - wrong word user input in reality
            // argmax P(c|w) = argmax P(w|c) * P(c) / P(w)
            // we ignore P(w) here, because it's the same for all words
            guessWords = guessRightWord(languModel, wordsInEditDistance);
            System.out.printf("Do you want to input %s and Cost time: %.10f second(s)\n",
                         guessWords.toString(), (System.currentTimeMillis() - startTime) / 1000D);
            return guessWords.toString();
		}
		return guessWords.toString();
	}

	/**
	 * 读取语料库big.txt，构建模型
	 * @param path
	 * @return
	 * @throws IOException
	 */
	private Map<String, Double> buildLanguageModel(String path) throws IOException {
		Map<String, Double> languModel = new HashMap<String, Double>();
		BufferedReader reader = new BufferedReader(new FileReader(path));
		//去掉文档中除字母外的所有符号
		Pattern pattern = Pattern.compile("[a-zA-Z]+");
		String line;
		int totalCount = 0;
		while ((line = reader.readLine()) != null) {
			String[] words = line.split(" ");
			for(String word : words) {
				if(pattern.matcher(word).matches()) {
					word = word.toLowerCase();
					Double wordCount = languModel.get(word);
					if(wordCount == null) {
						languModel.put(word, 1D);
					} else {
						languModel.put(word, wordCount+1D);
					}
					totalCount++;
				}
			}
		}
		reader.close();
		
		for(Entry<String, Double> entry : languModel.entrySet())
			entry.setValue(entry.getValue() / totalCount);
		
		return languModel;
	}
	
	/**
	 * 编辑距离为1的单词集合
	 * @param languModel
	 * @param input
	 * @return
	 */
	private Set<String> buildEditDistance1Set(Map<String, Double> languModel,String input) {
		Set<String> wordsInEditDistance = new HashSet<String>();
		char[] characters = input.toCharArray();
		
		// 删除：删除一个字母的情况，delete letter[i]
		for(int i=0;i<input.length();i++) {
			wordsInEditDistance.add(input.substring(0,i) + input.substring(i+1));
		}
		// 换位: 交换letter[i] and letter[i+1]
		for(int i=0;i<input.length()-1;i++) {
			wordsInEditDistance.add(input.substring(0,i) + characters[i+1] 
					+ characters[i] + input.substring(i+2));
		}
		// 替换: 将 letter[i]替换为a-z
		for(int i=0;i<input.length();i++) {
			for(char c : alphabets) {
				wordsInEditDistance.add(input.substring(0,i) + c + input.substring(i+1));
			}
		}
		// 插入: 插入一个新的字母 a-z
		for(int i=0;i<input.length()+1;i++){
			for(char c : alphabets) {
				wordsInEditDistance.add(input.substring(0,i) + c + input.substring(i));
			}
		}
		return wordsInEditDistance;
	}
	
	/**
	 * 编辑距离为2的集合.通过editDistance1函数得到编辑距离为1的集合,
	 * 该集合单词再通过editDistance1函数,就可以得到编辑距离为2的集合 
	 * @param languModel
	 * @param input
	 * @return
	 */
	private Set<String> buildEditDistance2Set(Map<String, Double> languModel,String input) {
		Set<String> wordsInEditDistance1 = buildEditDistance1Set(languModel, input);
		Set<String> wordsInEditDistance2 = new HashSet<String>();
		for(String editDistance1 : wordsInEditDistance1) {
			wordsInEditDistance2.addAll(buildEditDistance1Set(languModel, input));
		}
		wordsInEditDistance2.addAll(wordsInEditDistance1);
		return wordsInEditDistance2;
	}
	
	/**
	 * 从语料库中获取正确单词
	 * @param languModel
	 * @param wordsInEditDistance
	 * @return
	 */
	private List<String> guessRightWord(final Map<String, Double> languModel,Set<String> wordsInEditDistance){
		List<String> words = new LinkedList<String>(wordsInEditDistance);
		//按照单词在字库中出现的频率大小排序，频率越大出现的可能性越大  
		Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                  return languModel.get(word2).compareTo(languModel.get(word1));
            }
		});	
		return words.size() > 5 ? words.subList(0, 5) : words;
	}
}