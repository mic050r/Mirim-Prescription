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

public class DepressionTestResult extends JFrame {
	private JLabel background_Label;
	private JLabel mResult_DepresstionTest;
	private JLabel mResult_DepresstionTest_solu;
	private JLabel mResult_DepresstionTest_condtion;
	private JLabel mResult_DepresstionTest_solu2;

	public DepressionTestResult() {

		setTitle("우울증 자가진단 결과");
		//commit 확인22
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 504, 814);
		getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnFirst = new JButton("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/first.png"));
		btnFirst.setIcon(img);
		btnFirst.setBounds(322, 715, 143, 41);
		btnFirst.setBorderPainted(false); // 테두리 없애기
		panel.add(btnFirst);

		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EtType();
				dispose();
			}
		});

		JButton btnRetry = new JButton("");
		btnRetry.setBackground(new Color(255, 255, 255));
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/retryIcon1.png"));
		btnRetry.setIcon(img2);
		btnRetry.setForeground(new Color(0, 0, 0));
		btnRetry.setBounds(40, 715, 143, 41);
		btnRetry.setBorderPainted(false); // 테두리 없애기
		panel.add(btnRetry);

		btnRetry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DepressionTest();
				dispose();
			}
		});

		mResult_DepresstionTest = new JLabel("");
		mResult_DepresstionTest.setFont(new Font("양재붓꽃체L", Font.BOLD, 25));
		mResult_DepresstionTest.setBounds(0, 92, 504, 79);
		mResult_DepresstionTest.setHorizontalAlignment(JLabel.CENTER); // 가운데 정렬
		panel.add(mResult_DepresstionTest);

		mResult_DepresstionTest_solu = new JLabel("");
		mResult_DepresstionTest_solu.setFont(new Font("양재붓꽃체L", Font.PLAIN, 20));
		mResult_DepresstionTest_solu.setBounds(0, 141, 504, 52);
		mResult_DepresstionTest_solu.setHorizontalAlignment(JLabel.CENTER); // 가운데 정렬
		panel.add(mResult_DepresstionTest_solu);

		mResult_DepresstionTest_condtion = new JLabel("");
		mResult_DepresstionTest_condtion.setFont(new Font("양재붓꽃체L", Font.PLAIN, 20));
		mResult_DepresstionTest_condtion.setBounds(12, 169, 482, 99);
		panel.add(mResult_DepresstionTest_condtion);

		mResult_DepresstionTest_solu2 = new JLabel("");
		mResult_DepresstionTest_solu2.setFont(new Font("양재붓꽃체L", Font.PLAIN, 26));
		mResult_DepresstionTest_solu2.setBounds(31, 332, 463, 314);
		panel.add(mResult_DepresstionTest_solu2);

		background_Label = new JLabel("");
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/depressionTestResult2.png"));
		background_Label.setIcon(img1);
		background_Label.setBounds(0, 0, 504, 814);
		panel.add(background_Label);

		setBounds(0, 0, 520, 814);
		setLocationRelativeTo(null);

		setResizable(false); // 화면 크기 고정하는 작업
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		setDataResult(); // setDataResult값 불러오기
	}

	private void setDataResult() {
		int total = InputData.DepreesionTotal; // InputData에 있는 DepreesionTotal값을 total에 넣기
		System.out.println(total);

		/*
		 * 0 ~ 4점 (우울 아님) 5 ~ 9점(가벼운 우울) 10 ~ 19점(중간 정도의 우울) 20 ~ 27점(심한 우울)
		 */

		String result_Depression = ""; // 결과
		String result_Depresstion_condtion = ""; // 사용자의 상태를 나타냄
		String result_Depresstion_solu = ""; // 해결방안
		String result_Depression_solu2 = "<html> <<해결방안><br/> - 선생님께 상담 받아보기 <br/> - 친구들과 정원 걸으며 10분 이상씩 유산소 운동하기<br/> - 밤새지말고 규칙적인 활동하기<br/> - 좋아하는 노래 듣기, 책읽기,<br/> - 동아리 활동하기, 친구와 상담하기</html>";
		if (0 < total && total < 4) {
			result_Depression = "유의한 수준의 우울감이 시사되지 않습니다.";
			mResult_DepresstionTest.setText(result_Depression);
		} else if (5 <= total && total <= 9) {
			result_Depression = "다소 경미한 수준의 우울감이 있으나 일상생활에 지장을 줄 정도는 아닙니다.";
			result_Depresstion_condtion = "<html>- 다만, 이러한 기분 상태가 지속될 경우 개인의 신체적, 심리적 대처자원을 저하시킬 수 있습니다.<br>혼자서 끙끙앓는 것이 아닌 우울함과 불안함을 <br/>주변에 털어놓는 것만으로도 도움이 됩니다.</html>";
			mResult_DepresstionTest.setText(result_Depression);
			mResult_DepresstionTest_condtion.setText(result_Depresstion_condtion);
			mResult_DepresstionTest_solu2.setText(result_Depression_solu2);
		} else if (10 <= total && total <= 19) {
			result_Depression = "중간정도의 우울감이 시사됩니다.";
			result_Depresstion_condtion = "<html> - 이러한 수준의 우울감은 흔히 신체적, 심리적 대처자원을 저하시키며 개인의 일상생활을 어렵게 만들기도 합니다.<html/>";
			mResult_DepresstionTest.setText(result_Depression);
			mResult_DepresstionTest_condtion.setText(result_Depresstion_condtion);
			mResult_DepresstionTest_solu2.setText(result_Depression_solu2);
		} else if (20 <= total && total <= 27) {
			result_Depression = "심한 수준의 우울감이 시사됩니다.";
			result_Depresstion_solu = "<html>전문기관의 도움을 받는 것이 중요합니다.<html/>";
			mResult_DepresstionTest.setText(result_Depression);
			mResult_DepresstionTest_solu.setText(result_Depresstion_solu);
			mResult_DepresstionTest_solu2.setText(result_Depression_solu2);
		}
	}
}