package com.hlk.ui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.hlk.util.MyButton;

public class DropText extends JTextField{
	private JPanel fpanel;
	private JTextField searchText;
	private JLabel showEnglish;
	private JTextArea showChinese;
	private MyButton addButton;
	public MyButton getAddButton() {
		return addButton;
	}
	public void setAddButton(MyButton addButton) {
		this.addButton = addButton;
	}
	public JLabel getShowEnglish() {
		return showEnglish;
	}
	public void setShowEnglish(JLabel showEnglish) {
		this.showEnglish = showEnglish;
	}
	public JTextArea getShowChinese() {
		return showChinese;
	}
	public void setShowChinese(JTextArea showChinese) {
		this.showChinese = showChinese;
	}

	public JTextField getSearchText() {
		return searchText;
	}
	public void setSearchText(JTextField searchText) {
		this.searchText = searchText;
	}
	public DropText(final JPanel fpanel){
		super();
		this.setFpanel(fpanel);
		setBorder(null);
		setEditable(false);
		setText("");
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fpanel.setVisible(false);
				String [] Word=getText().split("  ");
				searchText.setText(Word[0]);
				showEnglish.setText(Word[0]);
				showChinese.setText(Word[1]);
				fpanel.setVisible(false);
				showEnglish.setVisible(true);		
				showChinese.setVisible(true);
				addButton.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackground(new Color(204, 204, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(null);
			}
		});
	}
	public JPanel getFpanel() {
		return fpanel;
	}
	public void setFpanel(JPanel fpanel) {
		this.fpanel = fpanel;
	}
}
