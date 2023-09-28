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

public class SmartPhoneTestResulst extends JFrame {
    private JLabel mText_SmartPhone;
    private JLabel mText_SmartPhone_Solu;

    public SmartPhoneTestResulst() {
        setTitle("스마트폰 자가진단 테스트");

        setResizable(false); // 화면 크기 고정하는 작업
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 504, 814);
        getContentPane().add(panel);

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
                new SmartPhoneTest();
                dispose();
            }
        });


        mText_SmartPhone = new JLabel("");
        mText_SmartPhone.setBackground(new Color(255, 255, 255));
        mText_SmartPhone.setFont(new Font("양재붓꽃체L", Font.BOLD, 26));
        mText_SmartPhone.setBounds(0, 179, 504, 75);
        mText_SmartPhone.setHorizontalAlignment(JLabel.CENTER); //가운데 정렬
        panel.add(mText_SmartPhone);

        mText_SmartPhone_Solu = new JLabel("");
        mText_SmartPhone_Solu.setForeground(new Color(0, 0, 0));
        mText_SmartPhone_Solu.setFont(new Font("양재붓꽃체L", Font.PLAIN, 26));
        mText_SmartPhone_Solu.setBounds(12, 234, 492, 324);
        panel.add(mText_SmartPhone_Solu);

        JLabel background_Label = new JLabel("");
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/SmartphoneTestResult2.png"));
        background_Label.setIcon(img1);
        background_Label.setBounds(0, 0, 504, 814);
        panel.setLayout(null);
        panel.add(background_Label);

        setBounds(0, 0, 520, 814);
        setLocationRelativeTo(null);

        setResizable(false); // 화면 크기 고정하는 작업
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setResultData();
    }

    public void setResultData() { // 스마트폰 중독 자가진단 테스트 결과
        // 1-2개 양호, 3-4개 중독 위험군, 5-8개 중독의심, 8개 이상 중독
        int total = InputData.SmartPhoneTotal;
        String result_smartPhone = "";
        System.out.println(total);
        String result_smartPhone_solu = "<html><해결방안><br> - 시간 정하여 핸드폰 보기<br> - 친구와 만나 대화 하고 보드게임하기<br> - 취침 20분 전 스마트폰 보지 않기";
        System.out.println(total);
        switch (total) {
            case 1:
            case 2:
                result_smartPhone = "양호합니다.";
                mText_SmartPhone.setText(result_smartPhone);
                break;
            case 3:
            case 4:
                result_smartPhone = "스마트폰 중독위험군입니다.";
                mText_SmartPhone.setText(result_smartPhone);
                mText_SmartPhone_Solu.setText(result_smartPhone_solu);
                break;
            case 5:
            case 7:
                result_smartPhone = "스마트폰 중독의심입니다.";
                mText_SmartPhone.setText(result_smartPhone);
                mText_SmartPhone_Solu.setText(result_smartPhone_solu);
                break;
            default:
                result_smartPhone = "스마트폰 중독입니다.";
                mText_SmartPhone.setText(result_smartPhone);
                mText_SmartPhone_Solu.setText(result_smartPhone_solu);
                break;
        }
    }
}