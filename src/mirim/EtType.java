package mirim;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;

public class EtType extends JFrame {

	public EtType() {
		setTitle("정서검사 테스트 선택");

		setResizable(false); // 화면 크기 고정하는 작업
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 504, 814);
		getContentPane().add(panel);
		panel.setLayout(null);

		JButton smartphoneTest = new JButton("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/smartptIcon.png"));
		smartphoneTest.setIcon(img);
		smartphoneTest.setBounds(43, 154, 420, 99);
		smartphoneTest.setBorderPainted(false); // 테두리 없애기
		panel.add(smartphoneTest);

		smartphoneTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SmartPhoneTest();
				dispose();
			}
		});

		JButton stressTest = new JButton("");
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/streesptIcon.png"));
		stressTest.setIcon(img1);
		stressTest.setBounds(43, 284, 420, 101);
		stressTest.setBorderPainted(false); // 테두리 없애기
		panel.add(stressTest);

		stressTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StressTest();
				dispose();
			}
		});

		JButton depressTest = new JButton("");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/depreesptIcon.png"));
		depressTest.setIcon(img2);
		depressTest.setBounds(43, 415, 420, 102);
		depressTest.setBorderPainted(false); // 테두리 없애기
		panel.add(depressTest);

		depressTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DepressionTest();
				dispose();
			}
		});

		JButton memoryTest = new JButton("");
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/memoryptIcon.png"));
		memoryTest.setIcon(img3);
		memoryTest.setBounds(43, 547, 420, 98);
		memoryTest.setBorderPainted(false); // 테두리 없애기
		panel.add(memoryTest);

		memoryTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemoryTestEx();
				dispose();
			}
		});
		JButton btnPrev = new JButton("");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnPrev.setBackground(new Color(255, 255, 255));
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/before.png"));
		btnPrev.setIcon(img4);
		btnPrev.setForeground(new Color(0, 0, 0));
		btnPrev.setBounds(12, 724, 143, 41);
		btnPrev.setBorderPainted(false); // 테두리 없애기
		panel.add(btnPrev);

		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(null, "이전 메뉴로 이동하시겠습니까?", "", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null);
				if (res == 0) {
					new TestType();
					dispose();
				}
			}
		});

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 504, 814);
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/EtTypeScreen.png"));
		lblNewLabel.setIcon(img5);
		panel.add(lblNewLabel);
		setBounds(0, 0, 520, 814);
		setLocationRelativeTo(null);

		setResizable(false); // 화면 크기 고정하는 작업
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}
