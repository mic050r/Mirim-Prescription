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

public class StressResult extends JFrame {
    JLabel background_Label, mResult_StressTest, mResult_StressTest_Solu;

    public StressResult() {

        setTitle("스트레스 자가진단 테스트 결과");

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 504, 814);
        getContentPane().add(panel);
        panel.setLayout(null);

        JButton btnFirst = new JButton("");
        ImageIcon img = new ImageIcon(this.getClass().getResource("/first.png"));
        btnFirst.setIcon(img);
        btnFirst.setBorderPainted(false); // 테두리 없애기
        btnFirst.setBounds(322, 715, 143, 41);
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
                new StressTest();
                dispose();
            }
        });

        mResult_StressTest = new JLabel("");
        mResult_StressTest.setFont(new Font("양재붓꽃체L", Font.BOLD, 27));
        mResult_StressTest.setBounds(0, 125, 506, 93);
        mResult_StressTest.setHorizontalAlignment(JLabel.CENTER); // 가운데 정렬
        panel.add(mResult_StressTest);

        mResult_StressTest_Solu = new JLabel("");
        mResult_StressTest_Solu.setFont(new Font("양재붓꽃체L", Font.PLAIN, 26));
        mResult_StressTest_Solu.setBounds(12, 243, 494, 304);
        panel.add(mResult_StressTest_Solu);

        background_Label = new JLabel("");
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/StreesTestResult2.png"));
        background_Label.setIcon(img1);
        background_Label.setBounds(0, 0, 504, 814);
        panel.add(background_Label);

        setBounds(0, 0, 520, 814);
        setLocationRelativeTo(null);

        setResizable(false); // 화면 크기 고정하는 작업
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setResultData();
    }

    private void setResultData() {
        /* 13점 이하 : 정상적인 상태 14~16점 : 약한 스트레스 17~18점 : 중간정도의 스트레스 19점 이상 : 높은 스트레스 */
        int total = InputData.stressTotal;
        System.out.println(total);

        String result_Stress = "";
        String result_Stress_solu = "<html> <<해결방안> <br> - 운동이나 수다, 하교 후 친구와 맛있는 거먹으러 같이 가기 <br> - 균형 있는 식단 가지기 <br> - 카페인 줄이기, 많이 웃기<br> - 취미 생활 하기";
        if (total >= 14) {
            switch (total) {
                case 14:
                case 15:
                case 16:
                    result_Stress = "약한 스트레스입니다.";
                    mResult_StressTest.setText(result_Stress);
                    mResult_StressTest_Solu.setText(result_Stress_solu);
                case 17:
                case 18:
                    result_Stress = "중간정도의 스트레스입니다.";
                    mResult_StressTest.setText(result_Stress);
                    mResult_StressTest_Solu.setText(result_Stress_solu);
                default:
                    result_Stress = "높은 스트레스입니다.";
                    mResult_StressTest.setText(result_Stress);
                    mResult_StressTest_Solu.setText(result_Stress_solu);
            }
        } else {
            result_Stress = "<html><center>정상적인 상태입니다.</center><html/>";
            mResult_StressTest.setText(result_Stress);
        }
    }

}
