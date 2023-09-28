package mirim.etest;

import mirim.data.InputData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextField;

public class MemoryTest extends JFrame {
	Random rand = new Random(); // 난수
	String numStr = ""; // 난수가 저장될 변수
	// String ran = Integer.toString(rand.nextInt(7)); //0~7 까지 난수 생성
	private JPanel panel;

	private TimerBar timerBar;
	private Thread threadBar;

	private TimerNum timerNum;
	private Thread threadNum;

	private int second = 5;
	private int count = 0;
	private JLabel number;
	private JLabel lblNewLabel_1;
	private JLabel hide;
	private JLabel mText_question;
	private JTextField answer;
	private JLabel mText_attention;

	public MemoryTest() {
		setTitle("단기 기억력 테스트");

		setBounds(0, 0, 520, 814);
		setLocationRelativeTo(null);

		setResizable(false); // 화면 크기 고정하는 작업
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 504, 814);
		getContentPane().add(panel);
		panel.setLayout(null);

		timerBar = new TimerBar(second);
		timerBar.setSize(213, 50);
		timerBar.setLocation(141, 90);
		threadBar = new Thread(timerBar);
		threadBar.start();
		panel.add(timerBar);

		timerNum = new TimerNum(second);
		timerNum.setLocation(207, 151);
		threadNum = new Thread(timerNum);
		threadNum.start();
		panel.add(timerNum);

		number = new JLabel(Util.numberGen(7, 2));
		number.setFont(new Font("굴림", Font.BOLD, 59));
		number.setBounds(53, 269, 424, 85);
		panel.add(number);

		mText_question = new JLabel("정답은?");
		mText_question.setFont(new Font("양재붓꽃체L", Font.PLAIN, 40));
		mText_question.setBounds(180, 269, 166, 50);
		panel.add(mText_question);
		mText_question.setVisible(false);

		answer = new JTextField();
		answer.setFont(new Font("굴림", Font.PLAIN, 17));
		answer.setBounds(96, 321, 284, 38);
		panel.add(answer);
		answer.setColumns(10);
		answer.setVisible(false);
		setVisible(true); // 전체

		JButton btnNewButton = new JButton("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/checkIcon.png"));
		btnNewButton.setIcon(img);
		btnNewButton.setBounds(391, 321, 61, 38);
		panel.add(btnNewButton);
		btnNewButton.setVisible(false);

		mText_attention = new JLabel("※띄어쓰기 없이 써주세요.");
		mText_attention.setBounds(96, 364, 155, 15);
		panel.add(mText_attention);
		mText_attention.setVisible(false);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputData.answer = answer.getText();
				InputData.number = number.getText().replaceAll(" ", "");
				new MemoryTestResult();
				dispose();
			}
		});

		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				if (count <= second) { // count값이 5보다 작거나 같을때까지 수행
					count++; // 실행횟수 증가
				} else { // 타이머가 끝나면
					timer.cancel(); // 타이머 종료
					number.setVisible(false); // 타이머가 사라짐
					answer.setVisible(true); // 사용자의 답 사라짐
					mText_question.setVisible(true); //
					btnNewButton.setVisible(true);
					mText_attention.setVisible(true);
				}
			}
		};
		timer.schedule(task, 0, 1000); // 실행 Task, 1초뒤 실행, 1초마다 반복

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(0, 0, 504, 814);
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/MemoryTest.png"));
		lblNewLabel.setIcon(img1);
		panel.add(lblNewLabel);

	}
}
