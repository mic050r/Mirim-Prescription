package mirim.etest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemoryTestEx extends JFrame {

    public MemoryTestEx() {
        setTitle("단기 기억력 테스트");

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 504, 814);
        getContentPane().add(panel);
        panel.setLayout(null);

        JButton btnNext = new JButton("");
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/nextIcon.png"));
        btnNext.setIcon(img2);
        btnNext.setBounds(435, 290, 59, 59);
        btnNext.setBorderPainted(false); // 테두리 없애기
        panel.add(btnNext);

        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MemoryTest();
                dispose();
            }
        });

        JLabel plusIcon = new JLabel("+");
        plusIcon.setFont(new Font("굴림", Font.PLAIN, 65));
        plusIcon.setBounds(228, 269, 59, 102);
        panel.add(plusIcon);

        JLabel touch = new JLabel("눌러주세요");
        touch.setFont(new Font("굴림", Font.PLAIN, 10));
        touch.setBounds(440, 350, 74, 15);
        panel.add(touch);

        JLabel background_Label = new JLabel("");
        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/memoryTestExplain.png"));
        background_Label.setIcon(img3);
        background_Label.setBounds(0, 0, 504, 814);
        panel.add(background_Label);

        setBounds(0, 0, 520, 814);
        setLocationRelativeTo(null);

        setResizable(false); // 화면 크기 고정하는 작업
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}