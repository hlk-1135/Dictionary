package com.hlk.util;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyButton extends JButton{
	public MyButton(){
		// TODO 自动生成的构造函数存根
		super();
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				JButton btn = (JButton) e.getComponent();
				btn.getToolTipText();
				btn.setBorderPainted(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				JButton btn = (JButton) e.getComponent();
				btn.setBorderPainted(false);
			}
		});
	}
}