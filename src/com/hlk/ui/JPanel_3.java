package com.hlk.ui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class JPanel_3 extends JPanel {
	private JPanel panel;
	private JTextField textField;
	private final String path = System.getProperty("user.dir");
	/**
	 * Create the panel.
	 */
	public JPanel_3() {
		super();
		setBounds(157, 0, 627, 561);
		setBackground(Color.gray);
		setLayout(null);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 627, 561);
		panel.setBackground(Color.WHITE);
		
		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setBounds(0, 0, 627, 561);
		scrollPane.setBackground(Color.WHITE);
		JScrollBar bar= scrollPane.getVerticalScrollBar(); 

		bar.setUnitIncrement(50); 
		panel.setPreferredSize(new Dimension(scrollPane.getWidth() - 50, 2640));//scrollPane.getHeight()*5
		
		JLabel lblNewLabel = new JLabel("\u5982\u4F55\u7528\u82F1\u8BED\u548C\u7403\u8FF7\u6109\u5FEB\u5730\u4EA4\u8C08\uFF1F");
		lblNewLabel.setFont(new Font("黑体", Font.PLAIN, 23));
		lblNewLabel.setBounds(128, 30, 322, 45);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(path + "\\img\\panel_3.png"));
		lblNewLabel_1.setBounds(94, 127, 401, 251);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setText("2016-06-14 11:47:46     \u6765\u6E90\uFF1A\u4E2D\u56FD\u65E5\u62A5\u82F1\u8BED\u70B9\u6D25     \u70B9\u51FB\uFF1A988\u6B21");
		textField.setBounds(107, 91, 379, 21);
		textField.setBorder(null);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrfootballFans = new JTextArea();
		txtrfootballFans.setText("\u5BFC\u8BFB\uFF1A\u5317\u4EAC\u65F6\u95F42016\u5E746\u670811\u65E503:00\u8D77\uFF0C\u4F60\u8EAB\u8FB9\u662F\u4E0D\u662F\u5C31\u6709\u90A3\u4E48\u4E00\u7FA4\u4EBA\uFF0C\u4ED6\u4EEC\u56E4\u79EF\u98DF\u7CAE\uFF0C\u663C\u4F0F\u591C\u51FA\uFF0C\r\n\u4ED6\u4EEC\u65F6\u800C\u6B22\u547C\uFF0C\u65F6\u800C\u53F9\u606F\u2026\u2026\u4ED6\u4EEC\u6B64\u65F6\u90FD\u6709\u4E00\u4E2A\u540D\u5B57\uFF1A\u7403\u8FF7football fans~\r\n\r\n\u56E0\u4E3A\uFF0C\u6B27\u6D32\u676F\u6765\u4E86\uFF01\r\n\r\n\u6B27\u6D32\u676F\u7531\u6B27\u6D32\u8DB3\u7403\u534F\u4F1A\u8054\u76DF\uFF08Union of European Football Associations\uFF0CUEFA\uFF09\u7BA1\u7406\uFF0C2016\u5E74\r\n\u6CD5\u56FD\u6B27\u6D32\u676F\uFF082016 UEFA European Championship\uFF0CUEFA Euro 2016\uFF09\u6B63\u5728\u706B\u70ED\u8FDB\u884C\u3002\r\n\r\n\u4E0D\u7BA1\u4F60\u662F\u4E0D\u662F\u7403\u8FF7\uFF0C\u4F60\u90FD\u53EF\u4EE5Get\u4E0B\u9762\u8FD9\u4E9B\u7403\u8D5B\u76F8\u5173\u7684\u6709\u8DA3\u8868\u8FBE\uFF0C\u6700\u8D77\u7801\u4E0D\u81F3\u4E8E\u5728\u9047\u5230\u7403\u8FF7\u7684\u65F6\u5019\u6839\r\n\u672C\u65E0\u6CD5\u6109\u5FEB\u5730\u4EA4\uFF08tu\uFF09\u8C08\uFF08cao\uFF09\u561B~\r\n\r\n1 Lifting the silverware \u593A\u51A0\r\n\r\n>>>> silverware ['s\u026Alv\u0259we\u0259] \u94F6\u5668\uFF0C\u94F6\u8D28\u9910\u5177\r\n\r\nlift the silverware\u8FD9\u4E2A\u642D\u914D\u4E2D\uFF0C\u6CE8\u610Fsilverware\u6307\u7684\u662F\u7403\u8D5B\u7684\u51A0\u519B\u5956\u676F\uFF0C\u53EF\u4E0D\u662F\u4EC0\u4E48\u94F6\u5956\u54E6\u3002\r\n\r\nThis is literally what happens when your team wins a major trophy. Everyone goes insane,\r\n and the winning team gets to \u201Clift the silverware\u201D.\r\n\r\n\u4F60\u7684\u7403\u961F\u8D62\u5F97\u5927\u5956\u7684\u65F6\u5019\uFF0C\u5C31\u662F\u8FD9\u4E48\u55E8~\u6BCF\u4E2A\u4EBA\u6FC0\u52A8\u75AF\u4E86\uFF0C\u8D62\u7684\u961F\u4F0D\u5C31\u80FD lift the silverware\uFF01\r\n\r\n2 Heads for an early bath\u201C\u65E9\u70B9\u6D17\u5934\u53BB\u201D\uFF1A\u7EA2\u724C\u7F5A\u4E0B\r\n\r\nThis means you got ejected from the game. Might as well go clean up since there's\r\n nothing better to do, right\uFF1F\r\n\r\n\u8FD9\u610F\u5473\u7740\u4F60\u88AB\u51FA\u5C40\u4E86\u3002\u4E0D\u59A8\u53BB\u6D17\u6D17\u597D\u4E86\u2026\u2026\u53CD\u6B63\u53C8\u6CA1\u522B\u7684\u4E8B\u513F\u597D\u505A\u4E86\uFF0C\u5BF9\u5427\uFF1F\uFF08\u55EF\u2026\u2026\u4E2D\u6587\u7248\u8868\u8FBE\u6216\r\n\u8BB8\u662F\u201C\u6D17\u6D17\u7761\u5427\u201D\uFF1F\uFF09\r\n\r\n3 Hit the woodwork \u51FB\u4E2D\u7403\u95E8\r\n\r\n>>>> woodwork \u6728\u5236\u54C1\uFF0C\u5728\u4FDA\u8BED\u4E2D\u4E5F\u53EF\u6307\u201C\uFF08\u8DB3\u7403\u7684\uFF09\u7403\u95E8\u6846\u201D\r\n\r\nThis refers to a shot that ends up hitting the goalposts. Hit the woodwork \u6307\u7684\u662F\u8FDB\u7403\u51FB\u4E2D\r\n\u4E86\u95E8\u6846\u3002\r\n\r\n\uFF08\u8FDB\u4E0D\u8FDB\u7403\u5C31\u4E0D\u4E00\u5B9A\u5566~\u6240\u4EE5hit the woodwork\u4E4B\u65F6\uFF0C\u6B63\u662F\u5173\u952E\u65F6\u523B\u6240\u5728\u3002\uFF09\r\n\r\n4 Get stuck in \u594B\u529B\u62FC\u62A2\r\n\r\nIf you've ever played defense, you know that you have to go in hard and take no prisoners\r\n if you want to do your job well.\r\n\r\n\u5982\u679C\u4F60\u8E22\u8FC7\u9632\u5B88\uFF0C\u4F60\u80AF\u5B9A\u77E5\u9053\uFF0C\u5982\u679C\u60F3\u8981\u5E72\u5F97\u6F02\u4EAE\uFF0C\u4F60\u4E0D\u5F97\u4E0D\u62FC\u5C3D\u5168\u529B\uFF0C\u7528\u5C3D\u4E00\u5207\u624B\u6BB5\u3002\r\n\r\n5 Howler \u5B88\u95E8\u5458\u7684\u4F4E\u7EA7\u9519\u8BEF\r\n\r\nAs admirable as every goalkeeper is for risking life and limb to protect the goal, sometimes\r\n they really screw things up without any good excuse.\r\n\r\n\u867D\u7136\u6BCF\u4E2A\u5B88\u95E8\u5458\u90FD\u662F\u62FC\u4E0A\u6027\u547D\u5B88\u536B\u7403\u95E8\uFF0C\u503C\u5F97\u5C0A\u91CD\uFF0C\u4F46\u6709\u7684\u65F6\u5019\u4ED6\u4EEC\u771F\u7684\u662F\u628A\u4E8B\u60C5\u641E\u7838\u4E86\u3002\r\n\r\n>>>> howler ['haul\u0259] \u4F4E\u7EA7\u9519\u8BEF\r\n\r\n>>>> risk life and limb \u62FC\u4E0A\u6027\u547D\r\n\r\n6 The Talisman \u201C\u62A4\u8EAB\u7B26\u201D\u7403\u661F\r\n\r\nYou'll hear this a lot when a team has a star player, their \"talisman\", who they pretty much\r\n rely on to win games. Without the \"talisman\", winning becomes a lot more difficult.\r\n\r\n\u4F60\u7ECF\u5E38\u542C\u5230\u6709\u4EBA\u8FD9\u6837\u53EB\u4E00\u4E2A\u7403\u961F\u7684\u660E\u661F\u7403\u5458\uFF1A\u201C\u62A4\u8EAB\u7B26\u201D\uFF0C\u5C31\u662F\u4ED6\u4EEC\u8D56\u4EE5\u8D62\u5F97\u6BD4\u8D5B\u7684\u4EBA\u3002\u6CA1\u4E86\u201C\u62A4\u8EAB\u7B26\u201D\uFF0C\r\n\u6253\u8D62\u6BD4\u8D5B\u5C31\u96BE\u591A\u4E86\u3002\r\n\r\n>>>> talisman ['t\u00E6lizm\u0259n] \u62A4\u8EAB\u7B26\uFF0C\u6CD5\u5B9D\uFF0C\u6B64\u5904\u6307\u7403\u961F\u7684\u5F53\u5BB6\u7403\u661F\u3002\r\n\r\n7 Hair Dryer Treatment \u201C\u7535\u5439\u98CE\u5F0F\u201D\u5486\u54EE\r\n\r\nDavid Beckham\uFF1A\"The fear of getting the hairdryer was the reason why we all played so \r\nwell. He was a manager you wanted to do well for.\"\r\n\r\n\u8D1D\u514B\u6C49\u59C6\u8BF4\uFF1A\u56E0\u4E3A\u5BB3\u6015\u53D7\u5230\u7535\u5439\u98CE\u5F0F\u7684\u5F85\u9047\uFF0C\u6211\u4EEC\u624D\u90FD\u8E22\u5F97\u8FD9\u4E48\u597D\u3002\u4ED6\u5C31\u662F\u4E00\u4F4D\u4F60\u60F3\u8981\u4E3A\u4E4B\u505A\u597D\u7684\u6559\u7EC3\u3002\r\n\r\n\u8FD9\u79CD\u8BF4\u6CD5\u7684\u51FA\u5904\u636E\u8BF4\u662F\u4E16\u754C\u8457\u540D\u7684\u8DB3\u7403\u6559\u7EC3Alex Ferguson \uFF08\u4E9A\u5386\u514B\u65AF\u00B7\u5F17\u683C\u68EE\u7235\u58EB\uFF0C\u5373\u7403\u8FF7\u53E3\u4E2D\u7684\r\n\u201C\u8D39\u7235\u7237\u201D\uFF09\u3002\u4ED6\u5E38\u5BF9\u8868\u73B0\u4E0D\u7406\u60F3\u7684\u7403\u5458\u72C2\u66B4\u6012\u543C\uFF0C\u88AB\u543C\u7684\u7403\u5458\u4EEC\u8BF4\uFF0C\u611F\u89C9\u5C31\u50CF\u88AB\u7535\u5439\u98CE\u5439\u8FC7\u4E00\u6837\u3002\r\n\r\n8 \"Squeaky bum time\" \u201C\u78E8\u5C41\u80A1\u65F6\u95F4\u201D\r\n\r\nThis refers to that nerve-wracking period of time when a team is up by one, but there are \r\nstill a few minutes left for the losing side to make a comeback. When fans get this nervous, \r\nthey tend to move around uneasily in their seats, creating a squeaky sound.\r\n\r\n\u8FD9\u6307\u7684\u662F\u5F53\u67D0\u961F\u9886\u5148\u4E00\u7403\uFF0C\u4F46\u8FD8\u6709\u51E0\u5206\u949F\uFF0C\u5BF9\u65B9\u8FD8\u6709\u673A\u4F1A\u9006\u88AD\u7684\u7D27\u5F20\u65F6\u523B\u3002\u5F53\u7403\u8FF7\u4EEC\u7D27\u5F20\u7684\u65F6\u5019\uFF0C\u4ED6\u4EEC\r\n\u53EF\u80FD\u4F1A\u5728\u5EA7\u6905\u4E0A\u4E0D\u5B89\u5730\u79FB\u52A8\uFF0C\u53D1\u51FA\u8FD9\u79CD\u5431\u5440\u4F5C\u54CD\u7684\u58F0\u97F3\u3002\r\n\r\n>>>> squeaky ['skwi\u02D0k\u026A] \u5431\u5440\u4F5C\u54CD\u7684\uFF0C\u53D1\u51FA\u523A\u8033\u5431\u560E\u58F0\u7684 bum\u662F\u82F1\u5F0F\u82F1\u8BED\u4E2D\u6307\u201C\u5C41\u80A1\u201D\u7684\u975E\u6B63\u5F0F\u8BF4\r\n\u6CD5\u3002 squeaky bum time\u76F4\u8BD1\u8FC7\u6765\u662F\u201C\u78E8\u5C41\u80A1\u65F6\u95F4\u201D\uFF0C\u8FD9\u4E5F\u662F\u8D39\u7235\u7237\u5F00\u521B\u7684\u8BF4\u6CD5\uFF0C\u73B0\u5728\u4E13\u6307\u5728\u770B\u7403\u65F6\u8BA9\u4EBA\u9AD8\u5EA6\u7D27\u5F20\u7684\u65F6\u523B\u3002\r\n\r\n\u5176\u5B83\u76F8\u5173\u8868\u8FBE\r\n\r\n\u25BA pass \u4F20\u7403 kick the ball to another player on your team.\r\n\r\nHe passed the ball back to the goalkeeper.\r\n\r\n\u4ED6\u628A\u7403\u56DE\u4F20\u7ED9\u4E86\u5B88\u95E8\u5458\u3002\r\n\r\n\u25BA dribble \u5E26\u7403 keep kicking the ball as you go forwards \uFF08before trying to pass to another player\uFF09.\r\n\r\nHe dribbled the ball past the defender.\r\n\r\n\u4ED6\u5E26\u7403\u8D8A\u8FC7\u4E86\u9632\u536B\u3002\r\n\r\n\u25BA tackle \u62E6\u622A\u62A2\u7403 try to take the ball from another player.\r\n\r\nBe careful when you tackle\uFF01\r\n\r\n\u62E6\u7403\u7684\u65F6\u5019\u4F60\u8981\u5C0F\u5FC3\uFF01\r\n\r\n\u25BAshoot \u5C04\u95E8 try and kick the ball into the net.\r\n\r\nDalglish shoots, but misses.\r\n\r\n\u8FBE\u683C\u5229\u4EC0\u5C04\u95E8\u4E86\uFF0C\u4F46\u6CA1\u8FDB\u3002\r\n\r\n\u25BA head \u9876\u5934\u7403 use your head to hit the ball.\r\n\r\nHe headed the ball into the back of the net.\r\n\r\n\u4ED6\u9876\u7684\u5934\u7403\u8FDB\u5165\u4E86\u7403\u7F51\u7684\u540E\u65B9\u3002\r\n\r\n\u25BA dive [\u4FDA\u8BED]\u5047\u6454\uFF0C\u5047\u88C5\u88AB\u649E\u5012 fall to the ground to make it look that an opposing player has tackled you badly \uFF08especially in football\uFF09.\r\n\r\nIf you dive in the match, you might get a yellow card.\r\n\r\n\u5982\u679C\u4F60\u6BD4\u8D5B\u4E2D\u5047\u6454\uFF0C\u4F60\u53EF\u80FD\u4F1A\u6536\u5230\u4E00\u5F20\u9EC4\u724C\u3002\r\n\r\n\u25BA blow the whistle \uFF08\u88C1\u5224\u5728\u7ED3\u675F\u65F6\uFF09\u5439\u54E8 when the referee signals the end of the \uFF08football\uFF09 match.\r\n\r\nHe blew the whistle at half time.\r\n\r\n\u4ED6\u5728\u4E2D\u573A\u7ED3\u675F\u65F6\u5439\u4E86\u54E8\u3002\r\n\r\n\u25BA draw/ tie \u5E73\u5C40 have the same score as the opposing team\r\n\r\nThey drew 1-1.\r\n\r\n\u4ED6\u4EEC\u6BD4\u5206\u4E00\u6BD4\u4E00\u5E73\u3002\r\n\r\nThe game ended in a draw/tie.\r\n\r\n\u6BD4\u8D5B\u4EE5\u5E73\u5C40\u7ED3\u675F\u3002\r\n\r\nTie\u8868\u793A\u201C\u5E73\u5C40\u201D\u65F6\u8FD8\u53EF\u505A\u4E0D\u53CA\u7269\u52A8\u8BCD\uFF1Atie with\uFF08 \u4E0E...\u6253\u6210\u5E73\u5C40\uFF09\u3002\r\n\r\nRonan Rafferty had tied with Frank Nobilo.\r\n\r\n\u7F57\u5357\u00B7\u62C9\u5F17\u8482\u4E0E\u8BFA\u6BD4\u7F57\u6253\u6210\u4E86\u5E73\u5C40\u3002\r\n\r\n\u6700\u540E\u6E29\u99A8\u63D0\u793A\uFF1A\u770B\u7403\u867D\u55E8\uFF0C\u4E5F\u8981\u9002\u5F53\u6CE8\u610F\u4F11\u606F\u54E6~");
		txtrfootballFans.setBounds(32, 388, 540, 2246);
		panel.add(txtrfootballFans);
		
		add(scrollPane);
		updateUI();
		setVisible(false);
		txtrfootballFans.setCaretPosition(0);
		panel.revalidate(); //告诉其他部件,我的宽高变了
	}
}
