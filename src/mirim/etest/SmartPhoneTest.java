package mirim.etest;

import mirim.data.InputData;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JCheckBox;

public class SmartPhoneTest extends JFrame {
	private JCheckBox cBox;
	private JCheckBox cBox2;
	private JCheckBox cBox3;
	private JCheckBox cBox4;
	private JCheckBox cBox5;
	private JCheckBox cBox6;
	private JCheckBox cBox7;
	private JCheckBox cBox8;
	private JCheckBox cBox9;
	private JCheckBox cBox10;

	private int total = 0;

	public SmartPhoneTest() {
		setTitle("스마트폰 중독 테스트");

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 504, 814);
		panel.setLayout(null);

		JButton btnPrev = new JButton("");
		btnPrev.setBackground(new Color(255, 255, 255));
		ImageIcon img = new ImageIcon(this.getClass().getResource("/before.png"));
		btnPrev.setIcon(img);
		btnPrev.setForeground(new Color(0, 0, 0));
		btnPrev.setBounds(12, 724, 143, 41);
		btnPrev.setBorderPainted(false); // 테두리 없애기
		panel.add(btnPrev);

		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new EtType();
					dispose();
			}
		});

		JButton btnResult = new JButton("");
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/resultIcon2.png"));
		btnResult.setIcon(img1);
		btnResult.setBounds(349, 724, 143, 41);
		btnResult.setBorderPainted(false); // 테두리 없애기
		panel.add(btnResult);

		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputData.SmartPhoneTotal = total;
				new SmartPhoneTestResulst();
				dispose();
			}
		});

		getContentPane().setLayout(null);

		getContentPane().add(panel);

		cBox = new JCheckBox("");
		cBox.setBackground(Color.WHITE);
		cBox.setForeground(Color.WHITE);
		cBox.setBounds(450, 145, 29, 29);
		cBox.addItemListener(new ItemListen());
		panel.add(cBox);

		cBox2 = new JCheckBox("");
		cBox2.setForeground(Color.WHITE);
		cBox2.setBackground(Color.WHITE);
		cBox2.setBounds(450, 196, 29, 29);
		cBox2.addItemListener(new ItemListen());
		panel.add(cBox2);

		cBox3 = new JCheckBox("");
		cBox3.setForeground(Color.WHITE);
		cBox3.setBackground(Color.WHITE);
		cBox3.setBounds(450, 251, 29, 29);
		cBox3.addItemListener(new ItemListen());
		panel.add(cBox3);

		cBox4 = new JCheckBox("");
		cBox4.setForeground(Color.WHITE);
		cBox4.setBackground(Color.WHITE);
		cBox4.setBounds(450, 310, 29, 29);
		cBox4.addItemListener(new ItemListen());
		panel.add(cBox4);

		cBox5 = new JCheckBox("");
		cBox5.setForeground(Color.WHITE);
		cBox5.setBackground(Color.WHITE);
		cBox5.setBounds(450, 358, 29, 29);
		cBox5.addItemListener(new ItemListen());
		panel.add(cBox5);

		cBox6 = new JCheckBox("");
		cBox6.setForeground(Color.WHITE);
		cBox6.setBackground(Color.WHITE);
		cBox6.setBounds(450, 417, 29, 29);
		cBox6.addItemListener(new ItemListen());
		panel.add(cBox6);

		cBox7 = new JCheckBox("");
		cBox7.setForeground(Color.WHITE);
		cBox7.setBackground(Color.WHITE);
		cBox7.setBounds(450, 480, 29, 29);
		cBox7.addItemListener(new ItemListen());
		panel.add(cBox7);

		cBox8 = new JCheckBox("");
		cBox8.setForeground(Color.WHITE);
		cBox8.setBackground(Color.WHITE);
		cBox8.setBounds(450, 532, 29, 29);
		cBox8.addItemListener(new ItemListen());
		panel.add(cBox8);

		cBox9 = new JCheckBox("");
		cBox9.setForeground(Color.WHITE);
		cBox9.setBackground(Color.WHITE);
		cBox9.setBounds(450, 584, 29, 29);
		cBox9.addItemListener(new ItemListen());
		panel.add(cBox9);

		cBox10 = new JCheckBox("");
		cBox10.setForeground(Color.WHITE);
		cBox10.setBackground(Color.WHITE);
		cBox10.setBounds(450, 644, 29, 29);
		cBox10.addItemListener(new ItemListen());
		panel.add(cBox10);

		JLabel background_Label = new JLabel("");
		background_Label.setBounds(0, 0, 504, 814);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/SmartphoneTest.png"));
		background_Label.setIcon(img2);
		panel.add(background_Label);

		setBounds(0, 0, 520, 814);
		setLocationRelativeTo(null);

		setResizable(false); // 화면 크기 고정하는 작업
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public class ItemListen implements ItemListener {
		public void itemStateChanged(ItemEvent arg0) {
			JCheckBox cb = (JCheckBox) arg0.getSource();
			if (cb == cBox) {
				total += 1;
			}
			if (cb == cBox2) {
				total += 1;
			}
			if (cb == cBox3) {
				total += 1;
			}
			if (cb == cBox4) {
				total += 1;
			}
			if (cb == cBox5) {
				total += 1;
			}
			if (cb == cBox6) {
				total += 1;
			}
			if (cb == cBox7) {
				total += 1;
			}
			if (cb == cBox8) {
				total += 1;
			}
			if (cb == cBox9) {
				total += 1;
			}
			if (cb == cBox10) {
				total += 1;
			}
		}
	}
}
