package mirim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame {

    public Start() {
        setTitle("미림 처방전"); // 타이틀 설정

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 504, 814);
        panel.setLayout(null);

        // 시작 버튼
        JButton startButton = new JButton("");
        ImageIcon startIcon = new ImageIcon(this.getClass().getResource("/startIcon.png"));
        startButton.setIcon(startIcon);
        startButton.setBackground(Color.WHITE);
        startButton.setBounds(154, 633, 196, 61);
        startButton.setBorderPainted(false);
        panel.add(startButton);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 시작 버튼을 누르면 문진표로 이동
                new Questionnaire();
                dispose(); // 현재 창 종료
            }
        });

        // 시작 화면 이미지
        JLabel backgroundLabel = new JLabel("");
        ImageIcon startScreenIcon = new ImageIcon(this.getClass().getResource("/StartScreen.png"));
        backgroundLabel.setIcon(startScreenIcon);
        backgroundLabel.setBounds(0, 0, 504, 814);
        panel.add(backgroundLabel);

        getContentPane().setLayout(null);

        getContentPane().add(panel);

        setBounds(0, 0, 508, 814);
        setLocationRelativeTo(null); // 윈도우 창을 화면 중앙에 배치

        setResizable(false); // 화면 크기 고정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // 화면 표시
    }
}
