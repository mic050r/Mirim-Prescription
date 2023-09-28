package mirim.etest;

import mirim.data.InputData;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class MemoryTestResult extends JFrame {
	private JLabel mResult_MemoryTest;
	private JLabel mResult_MemoryTest_solu;
	private JLabel mResult_answer;

	public MemoryTestResult() {
		setTitle("단기 기억력 테스트 결과");

		setBounds(0, 0, 520, 814);
		setLocationRelativeTo(null);

		setResizable(false); // 화면 크기 고정하는 작업
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 504, 814);
		getContentPane().add(panel);
		panel.setLayout(null);

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
					new MemoryTest();
					dispose();
			}
		});
		
		JButton btnFirst = new JButton("");
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/first.png"));
		btnFirst.setIcon(img3);
		btnFirst.setBounds(322, 715, 143, 41);
		btnFirst.setBorderPainted(false); // 테두리 없애기
		panel.add(btnFirst);

		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new EtType();
					dispose();
			}
		});

		mResult_MemoryTest = new JLabel("");
		mResult_MemoryTest.setFont(new Font("양재붓꽃체L", Font.BOLD, 25));
		mResult_MemoryTest.setBounds(0, 268, 504, 53);
		mResult_MemoryTest.setHorizontalAlignment(JLabel.CENTER); //가운데 정렬
		panel.add(mResult_MemoryTest);

		mResult_MemoryTest_solu = new JLabel("");
		mResult_MemoryTest_solu.setFont(new Font("양재붓꽃체L", Font.PLAIN, 27));
		mResult_MemoryTest_solu.setBounds(34, 353, 470, 245);
		panel.add(mResult_MemoryTest_solu);
		setVisible(true);

		mResult_answer = new JLabel("");
		mResult_answer.setFont(new Font("양재붓꽃체L", Font.PLAIN, 22));
		mResult_answer.setBounds(0, 176, 504, 41);
		mResult_answer.setHorizontalAlignment(JLabel.CENTER); //가운데 정렬
		panel.add(mResult_answer);

		System.out.println(InputData.answer);
		System.out.println(InputData.number);
		JLabel Background_Label = new JLabel("");
		Background_Label.setBounds(0, 0, 504, 814);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/memoryTestResult4.png"));
		Background_Label.setIcon(img);
		panel.add(Background_Label);

		setDataResult();
	}

	private void setDataResult() {
		String name = InputData.name;
		String answer = InputData.answer;
		String number = InputData.number;
		String result_number = "<html>" + name + "님이 쓴 답 : " + answer + " , " + "정답 : " + number + "<html/>";
		String result_Memory = "";
		String result_Memory_solu = "";

		mResult_answer.setText(result_number);
		if ((number.equals(answer)) == true) {
			result_Memory = "정상 범위입니다.";
			mResult_MemoryTest.setText(result_Memory);
		} else {
			result_Memory = "기억력이 안좋습니다";
			result_Memory_solu = "<html><해결 방안><br/> - 잘 씹으며 식사하기(잘 씹으면, 콜레시스토키닌 분비)<br> - 평소 안쓰는 손쓰기<br> - 친구들한테 손편지 써보기<br> - 친구들과 소리내며 교과서나 책 읽기, 크게 말해보기";
			mResult_MemoryTest.setText(result_Memory);
			mResult_MemoryTest_solu.setText(result_Memory_solu);
		}
	}
}