package com.hlk.ui;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.hlk.util.MyButton;
import com.hlk.util.SpellChecker;
import com.hlk.util.Sql;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.URL;
import java.awt.event.MouseAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.sql.*;
public class DicGUI extends JFrame {
	private JPanel contentPane;
	private JTextField textField;	//搜索
	private JTextArea showChinese;		//显示汉语意思
	private JLabel showEnglish;	//显示英文单词
	private JLabel pclabel;
	private JLabel downlabel;
	private String path;
	private JPanel droppanel;	//模糊查询下拉框下拉
	String searchWord = new String();
	public JLabel getShowEnglish() {
		return showEnglish;
	}

	public void setShowEnglish(JLabel showEnglish) {
		this.showEnglish = showEnglish;
	}
	public JTextArea getTextArea() {
		return showChinese;
	}

	public void setTextArea(JTextArea textArea) {
		this.showChinese = textArea;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public DicGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setLocationRelativeTo(null);	//居中显示
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		path=System.getProperty("user.dir");
		this.make_panel();
		this.make_panel_1();
		this.make_panel_2();
		this.make_panel_3();
	}
	
	public void make_panel()
	{//按钮栏
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 160, 561);
		contentPane.add(panel);
		//button_1
		MyButton button_1 = new MyButton();
		button_1.setBounds(10, 138, 139, 47);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component[] com = new JPanel[4];
				for(int i=0;i<=3;i++)
					com[i] = contentPane.getComponent(i);
				com[1].setVisible(true);
				com[2].setVisible(false);
				com[3].setVisible(false);
			}
		});
		panel.setLayout(null);
		button_1.setIcon(new ImageIcon(path + "\\img\\Button_1.png"));
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		panel.add(button_1);
		
		//button_2
		JButton button_2 = new MyButton();
		button_2.setBounds(10, 208, 139, 47);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel_2 jp_2=(JPanel_2) contentPane.getComponent(2);
				JPanel jp = jp_2.getPanel();
				
				Sql database_notepad=new Sql();
				String sql="select *from notepad";
				try {
					jp.removeAll();
					
					ResultSet rs=database_notepad.rsexecuteQuery(sql);
					while(rs.next())
						
				     {  
						int count = jp.getComponentCount();
					    int y_panel = 32+ 148*count;
						 AddWordPanel addwordpanel = new AddWordPanel(20, y_panel, 545, 140);
							addwordpanel.setFpanel(jp_2.getPanel());
							addwordpanel.getLblNewLabel().setText(rs.getString(1));
							addwordpanel.getLblNewLabel_1().setText(rs.getString(2));
							jp.add(addwordpanel);
							
					}
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Component[] com = new JPanel[4];
				for(int i=0;i<=3;i++)
					com[i] = contentPane.getComponent(i);
				com[1].setVisible(false);
				com[2].setVisible(true);
				com[3].setVisible(false);
			}
		});
		button_2.setIcon(new ImageIcon(path+"\\img\\Button_2.png"));
		button_2.setBorderPainted(false);
		button_2.setContentAreaFilled(false);
		panel.add(button_2);
		
		
		
		
		//button_3
		JButton button_3 = new MyButton();
		button_3.setBounds(10, 277, 139, 47);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component[] com = new JPanel[4];
				for(int i=0;i<=3;i++)
					com[i] = contentPane.getComponent(i);
				com[1].setVisible(false);
				com[2].setVisible(false);
				com[3].setVisible(true);
			}
		});
		button_3.setIcon(new ImageIcon(path+"\\img\\Button_3.png"));
		button_3.setBorderPainted(false);
		button_3.setContentAreaFilled(false);
		panel.add(button_3);
		
		JLabel bclable = new JLabel("");
		bclable.setBounds(0, 0, 160, 561);
		bclable.setIcon(new ImageIcon(path+"\\img\\panel_1.jpg"));
		panel.add(bclable);
	}
	
	public void make_panel_1()
	{//词典页
		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(157, 0, 627, 561);
		contentPane.add(panel_1);
		showChinese = new JTextArea();
		showEnglish = new JLabel("");
		
		final MyButton addButton = new MyButton();
		addButton.setIcon(new ImageIcon(path+"\\img\\add.png"));
		addButton.setBounds(530, 130, 19, 20);
		addButton.setToolTipText("加入生词本");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null,"   确定要添加到单词本吗","提示",JOptionPane.YES_NO_OPTION);
				if(i==0)
				{
					Component com = contentPane.getComponent(2);
					addWord((JPanel_2)com);
				}
			}
		});
		panel_1.add(addButton);
		addButton.setVisible(false);
		
		textField = new JTextField();
		textField.setBackground(new java.awt.Color(232, 232, 232));
		textField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 232, 232)));
		textField.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO 自动生成的方法存根
				searchWord = textField.getText();
				DropText dropword;
			    String Sql="select English,Chinese from dic where English like'"+(searchWord)+"%'";
				Sql sql=new Sql();
				showChinese.setVisible(false);
				showEnglish.setVisible(false);
				addButton.setVisible(false);
				for(int i=0;i<=4;i++)
				{
					dropword = (DropText)droppanel.getComponent(i);
					dropword.setText("");
				}
				try {
					ResultSet rs=sql.rsexecuteQuery(Sql);
					
					for(int i=0;i<=4 && rs.next();i++)
					{
						dropword = (DropText)droppanel.getComponent(i);
						dropword.setText(rs.getString(1)+"  "+rs.getString(2));
						
					}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				droppanel.updateUI();
			}
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO 自动生成的方法存根
				pclabel.setVisible(false);
				downlabel.setVisible(true);
				droppanel.setVisible(true);
				showChinese.setVisible(false);
				showEnglish.setVisible(false);
				addButton.setVisible(false);
				searchWord = textField.getText();
				DropText dropword;
			    String Sql="select English,Chinese from dic where English like'"+(searchWord)+"%'";
				Sql sql=new Sql();
				for(int i=0;i<=4;i++)
				{
					dropword = (DropText)droppanel.getComponent(i);
					dropword.setText("");
				}
				try {
					ResultSet rs=sql.rsexecuteQuery(Sql);
					
					for(int i=0;i<=4 && rs.next();i++)
					{
						dropword = (DropText)droppanel.getComponent(i);
						dropword.setText(rs.getString(1)+"  "+rs.getString(2));	
					}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				droppanel.updateUI();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO 自动生成的方法存根
				showChinese.setVisible(false);
				showEnglish.setVisible(false);
				addButton.setVisible(false);
				searchWord = textField.getText();
				DropText dropword;
			    String Sql="select English,Chinese from dic where English like'"+(searchWord)+"%'";
				Sql sql=new Sql();
				for(int i=0;i<=4;i++)
				{
					dropword = (DropText)droppanel.getComponent(i);
					dropword.setText("");
				}
				try {
					ResultSet rs=sql.rsexecuteQuery(Sql);
					
					for(int i=0;i<=4 && rs.next();i++)
					{
						dropword = (DropText)droppanel.getComponent(i);
						dropword.setText(rs.getString(1)+" "+rs.getString(2));
						
					}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				droppanel.updateUI();
			}

		});
		textField.setBounds(96, 27, 439, 40);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			//键盘查找输入时的触发
			public void keyTyped(KeyEvent e) {
				pclabel.setVisible(false);
				downlabel.setVisible(true);
				droppanel.setVisible(true);
				if(e.getKeyChar() == KeyEvent.VK_ENTER)
				{
					droppanel.setVisible(false);
					try {//查询单词
					    String Sql="select English,Chinese from dic where English ='"+(searchWord)+"'";
						Sql sql=new Sql();
						ResultSet rs=sql.rsexecuteQuery(Sql);
						if(!rs.next())
						{
							SpellChecker check = new SpellChecker();
							String res = check.start(searchWord);
							if(res.equals("false")) {
								showEnglish.setText("单词有误请重新输入！");
							} else {
								showEnglish.setText(res);
							}
							showChinese.setText("");
							showEnglish.setVisible(true);
							addButton.setVisible(false);
						}
						else
						{
							showChinese.setVisible(true);
							showEnglish.setVisible(true);
							showEnglish.setText(rs.getString(1));
							showChinese.setText(rs.getString(2));
							addButton.setVisible(true);
					    }
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}//mysql驱动程序
					catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(searchWord.length()==0)
					droppanel.setVisible(false);
				panel_1.updateUI();
			}
		});
		panel_1.setLayout(null);
		textField.setFont(new Font("宋体", Font.PLAIN, 18));
		panel_1.add(textField);
		textField.setColumns(10);
		
		MyButton searchButton = new MyButton();
		searchButton.setBounds(533, 27, 72, 40);
		searchButton.addActionListener(new ActionListener() {
			//点击搜索
			public void actionPerformed(ActionEvent e) {
				//获取textField的值，和写入到textField_1
				showChinese.setVisible(true);
				showEnglish.setVisible(true);
				droppanel.setVisible(false);
				try {//查询单词
					pclabel.setVisible(false);
				    String Sql="select English,Chinese from dic where English ='"+(searchWord)+"'";
					Sql sql=new Sql();
					ResultSet rs=sql.rsexecuteQuery(Sql);
					if(!rs.next())
					{
						SpellChecker check = new SpellChecker();
						String res = check.start(searchWord);
						if(res.equals("false")) {
							showEnglish.setText("单词有误请重新输入！");
						} else {
							showEnglish.setText(res);
						}
						showChinese.setText("");
						showEnglish.setVisible(true);
						addButton.setVisible(false);
					}	
					else
					{
						showEnglish.setText(rs.getString(1));
						showChinese.setText(rs.getString(2));
						addButton.setVisible(true);
				    } 					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}//mysql驱动程序
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				panel_1.updateUI();
			}
		});
		searchButton.setIcon(new ImageIcon(path + "\\img\\search.png"));
		addButton.setBorderPainted(false);
		panel_1.add(searchButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(24, 27, 72, 40);
		lblNewLabel.setIcon(new ImageIcon(path + "\\img\\search-pre.png"));
		panel_1.add(lblNewLabel);
		
		showChinese.setBounds(24, 191, 581, 99);
		panel_1.add(showChinese);
		showChinese.setVisible(false);
		showChinese.setFont(new Font("宋体", Font.PLAIN, 30));
		showChinese.setEditable(false);	//不可编辑
		
		showEnglish.setBounds(24, 115, 500, 40);
		showEnglish.setFont(new Font("宋体", Font.PLAIN, 42));
		showEnglish.setVisible(false);
		panel_1.add(showEnglish);
		
		pclabel = new JLabel("");
		pclabel.setBounds(80, 77, 474, 474);
		pclabel.setIcon(new ImageIcon(path+"\\img\\pic.jpg"));
		panel_1.add(pclabel);
		
		droppanel = new JPanel();
		droppanel.setBounds(96, 65, 439, 200);
		droppanel.setLayout(null);
		
		DropText[] dropword = new DropText[5];
		
		for(int i=0;i<=4;i++)
		{
			dropword[i] = new DropText(droppanel);
			int y=i*40;
			dropword[i].setBounds(0,y,439,40);
			dropword[i].setSearchText(textField);
			dropword[i].setShowEnglish(showEnglish);
			dropword[i].setShowChinese(showChinese);
			dropword[i].setFont(new Font("宋体", Font.PLAIN, 18));
			dropword[i].setAddButton(addButton);
			droppanel.add(dropword[i]);
			//dropword[i].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
		}
		panel_1.add(droppanel);
		
		downlabel = new JLabel("");
		downlabel.setIcon(new ImageIcon(path +"\\img\\down_1.png"));
		downlabel.setBounds(0, 518, 627, 47);
		downlabel.setVisible(false);
		
		panel_1.add(downlabel);
		panel_1.add(droppanel);
		droppanel.setVisible(false);
	}
	
	public void make_panel_2()
	{//单词本页
		JPanel_2 panel_2 = new JPanel_2(contentPane);
		contentPane.add(panel_2);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 77, 607, 474);
		panel.setBackground(Color.WHITE);
		panel_2.setPanel(panel);
		
		JScrollPane scrollPane = new JScrollPane(panel);
		JScrollBar bar= scrollPane.getVerticalScrollBar(); 

		bar.setUnitIncrement(50); 
		scrollPane.setBounds(10, 77, 607, 474);
		scrollPane.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(scrollPane.getWidth() - 50, scrollPane.getHeight()*4));
		JLabel bcLabel =(JLabel)panel_2.getComponent(0);
		bcLabel.add(scrollPane);
		panel_2.updateUI();
		panel_2.setVisible(false);
		panel.revalidate(); //告诉其他部件,我的宽高变了
		
	}
	
	public void make_panel_3()
	{//每日一文		
		JPanel_3 panel_3 = new JPanel_3();
		contentPane.add(panel_3);
		panel_3.setVisible(false);
	}
	
	public void addWord(JPanel_2 panel_2){
		//统计组件个数！	
		Sql database_notepad=new Sql();
		String Store_En=showEnglish.getText();
		String Store_Ch=showChinese.getText();
	    String  sql="insert into notepad values ('"+(Store_En)+"','"+(Store_Ch)+"')";
		try
		{
			database_notepad.rsexecuteUpdate(sql);
			JOptionPane.showConfirmDialog(null,"添加成功","提示",JOptionPane.CLOSED_OPTION);
		}
		catch(Exception e)
		{
			JOptionPane.showConfirmDialog(null,"该单词已在记事本中 请勿重复添加!","提示",JOptionPane.CLOSED_OPTION);
		}
		
	}
}