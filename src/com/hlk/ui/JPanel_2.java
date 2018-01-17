package com.hlk.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

public class JPanel_2 extends JPanel {

	private JPanel panel;
	private final String path = System.getProperty("user.dir");
	public JPanel getPanel() {
		return panel;
	}
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	/**
	 * Create the panel.
	 */
	public JPanel_2(JPanel contentJPanel) {
		super();
		setBackground(Color.WHITE);
		setBounds(157, 0, 627, 561);
		setLayout(null);	
		JLabel label = new JLabel("\u5355\u8BCD\u672C");
		label.setForeground(Color.WHITE);
		label.setBounds(10, 5, 214, 67);
		label.setFont(new Font("华文彩云", Font.PLAIN, 50));
		
		JLabel bcLabel = new JLabel("");
		bcLabel.setIcon(new ImageIcon(path+"\\img\\panel_2.jpg"));
		bcLabel.setBounds( 0, 0, 627, 561);
		add(bcLabel);
		bcLabel.add(label);
	}
}