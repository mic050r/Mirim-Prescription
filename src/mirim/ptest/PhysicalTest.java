package mirim.ptest;

import mirim.data.InputData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextField;

public class PhysicalTest extends JFrame {

	private JTextField mText_eyes1; // 왼쪽눈
	private JTextField mText_eyes2; // 오른쪽 눈
	private JTextField mText_rollUp; // 윗몸말아올리
	private JTextField mText_sitDown; // 앉아윗몸앞으로굽히기
	private JTextField mText_pushUp; // 무릎대고 팔굽혀펴기
	private JTextField mText_run; // 왕복 오래달리기

	public PhysicalTest() {
		setTitle("신체검사");

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 504, 814);
		panel.setLayout(null);

		mText_eyes1 = new JTextField();
		mText_eyes1.setFont(new Font("굴림", Font.PLAIN, 31));
		mText_eyes1.setBounds(339, 574, 93, 33);
		panel.add(mText_eyes1);
		mText_eyes1.setColumns(10);

		mText_eyes2 = new JTextField();
		mText_eyes2.setFont(new Font("굴림", Font.PLAIN, 31));
		mText_eyes2.setBounds(339, 641, 93, 33);
		panel.add(mText_eyes2);
		mText_eyes2.setColumns(10);
		// add(jp2, BorderLayout.CENTER);

		mText_rollUp = new JTextField();
		mText_rollUp.setFont(new Font("굴림", Font.PLAIN, 31));
		mText_rollUp.setColumns(10);
		mText_rollUp.setBounds(339, 385, 93, 33);
		panel.add(mText_rollUp);

		mText_sitDown = new JTextField();
		mText_sitDown.setFont(new Font("굴림", Font.PLAIN, 31));
		mText_sitDown.setColumns(10);
		mText_sitDown.setBounds(381, 158, 51, 33);
		panel.add(mText_sitDown);

		mText_pushUp = new JTextField();
		mText_pushUp.setFont(new Font("굴림", Font.PLAIN, 31));
		mText_pushUp.setColumns(10);
		mText_pushUp.setBounds(381, 459, 44, 33);
		panel.add(mText_pushUp);

		mText_run = new JTextField();
		mText_run.setFont(new Font("굴림", Font.PLAIN, 31));
		mText_run.setColumns(10);
		mText_run.setBounds(339, 271, 93, 33);
		panel.add(mText_run);

		JButton btnResult = new JButton("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/resultIcon.png"));
		btnResult.setIcon(img);
		btnResult.setBounds(329, 719, 143, 41);
		btnResult.setBorderPainted(false); // 테두리 없애기
		panel.add(btnResult);

		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getData();
			}
		});

		getContentPane().setLayout(null);

		getContentPane().add(panel);

		JLabel background_Label = new JLabel("");
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/PyTest.png"));
		background_Label.setIcon(img1);
		background_Label.setBounds(0, 0, 504, 814);
		panel.add(background_Label);

		setBounds(0, 0, 504, 814);
		setLocationRelativeTo(null);

		setResizable(false); // 화면 크기 고정하는 작업
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void getData() {

		String sitDown = mText_sitDown.getText();
		if (sitDown.length() == 0) {
			JOptionPane.showMessageDialog(null, "앉아윗몸앞으로굽히기 수를 입력하지 않았습니다.", "신체검사를 다시 확인해주세요.",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		String run = mText_run.getText();
		if (run.length() == 0) {
			JOptionPane.showMessageDialog(null, "왕복오래달리기 개수를 입력하지 않았습니다.", "신체검사를 다시 확인해주세요.",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (Integer.parseInt(run) < 0) {
			JOptionPane.showMessageDialog(null, "왕복오래달리기 개수를 다시 입력해주세요.", "신체검사를 다시 확인해주세요.",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		String rollUp = mText_rollUp.getText();
		if (rollUp.length() == 0) {
			JOptionPane.showMessageDialog(null, "윗몸말아올리기 개수를 입력하지 않았습니다.", "신체검사를 다시 확인해주세요.",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (Integer.parseInt(rollUp) < 0) {
			JOptionPane.showMessageDialog(null, "윗몸말아올리기 개수를 다시 입력해주세요.", "신체검사를 다시 확인해주세요.",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		String pushUp = mText_pushUp.getText();
		if (pushUp.length() == 0) {
			JOptionPane.showMessageDialog(null, "무릎대고 팔굽혀펴기 개수를 입력하지 않았습니다.", "신체검사를 다시 확인해주세요.",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (Integer.parseInt(pushUp) < 0) {
			JOptionPane.showMessageDialog(null, "무릎대고 팔굽혀펴기 개수를 다시 입력해주세요.", "신체검사를 다시 확인해주세요.",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		String eyes1 = mText_eyes1.getText();
		if (eyes1.length() == 0) {
			JOptionPane.showMessageDialog(null, "왼쪽 시력을 입력하지 않았습니다.", "신체검사를 다시 확인해주세요.", JOptionPane.ERROR_MESSAGE);
			return;
		}

		String eyes2 = mText_eyes2.getText();
		if (eyes2.length() == 0) {
			JOptionPane.showMessageDialog(null, "오른쪽 시력을 입력하지 않았습니다.", "신체검사를 다시 확인해주세요.", JOptionPane.ERROR_MESSAGE);
			return;
		}

		InputData.sitDown = sitDown; //InputData에 있는 값 넣기
		InputData.run = run;
		InputData.rollUp = rollUp;
		InputData.pushUp = pushUp;
		InputData.eyes1 = eyes1;
		InputData.eyes2 = eyes2;

		new PhysicalTestResult();
		dispose();
	}
}
