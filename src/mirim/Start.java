package mirim;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Start extends JFrame {

	public Start() {
		setTitle("미림 처방전"); // 타이틀 바에 제목을 변경

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 504, 814); // 패널의 위치 설정
		panel.setLayout(null); // 배치관리자를 지정하지 않는다는 의미로 절대 위치로 컴포넌트들을 나타냄 => setBounds

		JButton btn1 = new JButton(""); // 일반적인 버튼 생성
		ImageIcon img = new ImageIcon(this.getClass().getResource("/startIcon.png"));
		btn1.setIcon(img);
		btn1.setBackground(new Color(255, 255, 255)); // 버튼 배경색을 흰색으로
		btn1.setBounds(154, 633, 196, 61); // btn1의 위치
		btn1.setBorderPainted(false); // 테두리 없애기
		panel.add(btn1); // add() 메소드를 사용하여 패널에 btn1 추가

		btn1.addActionListener(new ActionListener() { // addActionListener 메소드의 매개변수에 액션 리스너 생성
			public void actionPerformed(ActionEvent e) { // ActionEvent클래스이고 e해당 클래스의 인스턴스임
				// e를 사용하여 여기에서 찾을 수 있는 메서드/속성을 호출할 수 있음
				new Questionnaire(); // 버튼 1을 누르면 문진표로 이동
				dispose(); // 현재의 frame을 종료시키는 메서드
			}
		});

		JLabel background_Label = new JLabel(""); // 라벨생성
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/StartScreen.png"));
		background_Label.setIcon(img1);
		background_Label.setBounds(0, 0, 504, 814); // 라벨 크기 설정
		panel.add(background_Label);

		getContentPane().setLayout(null); // 레이아웃설정

		getContentPane().add(panel);
		// add(jp2, BorderLayout.CENTER);

		setBounds(0, 0, 508, 814);
		setLocationRelativeTo(null); // 윈도우 창을 화면의 가운데에 띄우는 역할

		setResizable(false); // 화면 크기 고정하는 작업
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 도우창 종료 시 프로세스까지 깔끔하게 닫을 수 있음
		setVisible(true); // 보이도록 설정
	}

}
