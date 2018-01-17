package com.hlk.start;

import java.awt.EventQueue;

import com.hlk.ui.DicGUI;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DicGUI frame = new DicGUI();
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}