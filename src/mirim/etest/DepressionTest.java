package mirim.etest;

import mirim.data.InputData;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import javax.swing.JCheckBox;

public class DepressionTest extends JFrame {
    private JCheckBox cb1_0, cb1_1, cb1_2, cb1_3;
    private JCheckBox cb2_0, cb2_1, cb2_2, cb2_3;
    private JCheckBox cb3_0, cb3_1, cb3_2, cb3_3;
    private JCheckBox cb4_0, cb4_1, cb4_2, cb4_3;
    private JCheckBox cb5_0, cb5_1, cb5_2, cb5_3;
    private JCheckBox cb6_0, cb6_1, cb6_2, cb6_3;
    private JCheckBox cb7_0, cb7_1, cb7_2, cb7_3;
    private JCheckBox cb8_0, cb8_1, cb8_2, cb8_3;
    private JCheckBox cb9_0, cb9_1, cb9_2, cb9_3;
    private int total = 0;

    public DepressionTest() {
        setTitle("우울증 자가진단 테스트"); // 화면 이름 설정
        //commit 확인
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 504, 814);
        panel.setLayout(null);

        JButton Result = new JButton("");
        Result.setBounds(349, 724, 143, 41);
        ImageIcon img = new ImageIcon(this.getClass().getResource("/next.png"));
        Result.setIcon(img);
        Result.setBorderPainted(false); // 테두리 없애기
        panel.add(Result);

        Result.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                InputData.DepreesionTotal = total;
                new DepressionTestResult();
                dispose();
            }
        });

        JButton btnPrev = new JButton("");
        btnPrev.setBackground(new Color(255, 255, 255));
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/before.png"));
        btnPrev.setIcon(img1);
        btnPrev.setForeground(new Color(0, 0, 0));
        btnPrev.setBounds(12, 724, 143, 41);
        btnPrev.setBorderPainted(false); // 테두리 없애기
        panel.add(btnPrev);

        btnPrev.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new EtType();
                dispose();
            }
        });

        getContentPane().setLayout(null);

        getContentPane().add(panel);

        cb1_0 = new JCheckBox("");
        cb1_0.setBounds(380, 170, 21, 29);
        cb1_0.setBackground(Color.WHITE);
        cb1_0.setForeground(Color.WHITE);
        cb1_0.addItemListener(new ItemListen());
        panel.add(cb1_0);

        cb1_1 = new JCheckBox("");
        cb1_1.setForeground(Color.WHITE);
        cb1_1.setBackground(Color.WHITE);
        cb1_1.setBounds(410, 170, 21, 29);
        cb1_1.addItemListener(new ItemListen());
        panel.add(cb1_1);

        cb1_2 = new JCheckBox("");
        cb1_2.setForeground(Color.WHITE);
        cb1_2.setBackground(Color.WHITE);
        cb1_2.setBounds(439, 170, 21, 29);
        cb1_2.addItemListener(new ItemListen());
        panel.add(cb1_2);

        cb1_3 = new JCheckBox("");
        cb1_3.setForeground(Color.WHITE);
        cb1_3.setBackground(Color.WHITE);
        cb1_3.setBounds(468, 170, 21, 29);
        cb1_3.addItemListener(new ItemListen());
        panel.add(cb1_3);

        cb2_0 = new JCheckBox("");
        cb2_0.setForeground(Color.WHITE);
        cb2_0.setBackground(Color.WHITE);
        cb2_0.setBounds(380, 222, 21, 29);
        cb2_0.addItemListener(new ItemListen());
        panel.add(cb2_0);

        cb2_1 = new JCheckBox("");
        cb2_1.setForeground(Color.WHITE);
        cb2_1.setBackground(Color.WHITE);
        cb2_1.setBounds(408, 222, 21, 29);
        cb2_1.addItemListener(new ItemListen());
        panel.add(cb2_1);

        cb2_2 = new JCheckBox("");
        cb2_2.setForeground(Color.WHITE);
        cb2_2.setBackground(Color.WHITE);
        cb2_2.setBounds(439, 222, 21, 29);
        cb2_2.addItemListener(new ItemListen());
        panel.add(cb2_2);

        cb2_3 = new JCheckBox("");
        cb2_3.setForeground(Color.WHITE);
        cb2_3.setBackground(Color.WHITE);
        cb2_3.setBounds(468, 222, 21, 29);
        cb2_3.addItemListener(new ItemListen());
        panel.add(cb2_3);

        cb3_0 = new JCheckBox("");
        cb3_0.setForeground(Color.WHITE);
        cb3_0.setBackground(Color.WHITE);
        cb3_0.setBounds(380, 285, 21, 29);
        cb3_0.addItemListener(new ItemListen());
        panel.add(cb3_0);

        cb3_1 = new JCheckBox("");
        cb3_1.setForeground(Color.WHITE);
        cb3_1.setBackground(Color.WHITE);
        cb3_1.setBounds(412, 285, 21, 29);
        cb3_1.addItemListener(new ItemListen());
        panel.add(cb3_1);

        cb3_2 = new JCheckBox("");
        cb3_2.setForeground(Color.WHITE);
        cb3_2.setBackground(Color.WHITE);
        cb3_2.setBounds(440, 285, 21, 29);
        cb3_2.addItemListener(new ItemListen());
        panel.add(cb3_2);

        cb3_3 = new JCheckBox("");
        cb3_3.setForeground(Color.WHITE);
        cb3_3.setBackground(Color.WHITE);
        cb3_3.setBounds(468, 285, 21, 29);
        cb3_3.addItemListener(new ItemListen());
        panel.add(cb3_3);

        cb4_0 = new JCheckBox("");
        cb4_0.setForeground(Color.WHITE);
        cb4_0.setBackground(Color.WHITE);
        cb4_0.setBounds(380, 339, 21, 29);
        cb4_0.addItemListener(new ItemListen());
        panel.add(cb4_0);

        cb4_1 = new JCheckBox("");
        cb4_1.setForeground(Color.WHITE);
        cb4_1.setBackground(Color.WHITE);
        cb4_1.setBounds(410, 339, 21, 29);
        cb4_1.addItemListener(new ItemListen());
        panel.add(cb4_1);

        cb4_2 = new JCheckBox("");
        cb4_2.setForeground(Color.WHITE);
        cb4_2.setBackground(Color.WHITE);
        cb4_2.setBounds(438, 339, 21, 29);
        cb4_2.addItemListener(new ItemListen());
        panel.add(cb4_2);

        cb4_3 = new JCheckBox("");
        cb4_3.setForeground(Color.WHITE);
        cb4_3.setBackground(Color.WHITE);
        cb4_3.setBounds(466, 339, 21, 29);
        cb4_3.addItemListener(new ItemListen());
        panel.add(cb4_3);

        cb5_0 = new JCheckBox("");
        cb5_0.setForeground(Color.WHITE);
        cb5_0.setBackground(Color.WHITE);
        cb5_0.setBounds(380, 407, 21, 29);
        cb5_0.addItemListener(new ItemListen());
        panel.add(cb5_0);

        cb5_1 = new JCheckBox("");
        cb5_1.setForeground(Color.WHITE);
        cb5_1.setBackground(Color.WHITE);
        cb5_1.setBounds(410, 407, 21, 29);
        cb5_1.addItemListener(new ItemListen());
        panel.add(cb5_1);

        cb5_2 = new JCheckBox("");
        cb5_2.setForeground(Color.WHITE);
        cb5_2.setBackground(Color.WHITE);
        cb5_2.setBounds(438, 407, 21, 29);
        cb5_2.addItemListener(new ItemListen());
        panel.add(cb5_2);

        cb5_3 = new JCheckBox("");
        cb5_3.setForeground(Color.WHITE);
        cb5_3.setBackground(Color.WHITE);
        cb5_3.setBounds(466, 407, 21, 29);
        cb5_3.addItemListener(new ItemListen());
        panel.add(cb5_3);

        cb6_3 = new JCheckBox("");
        cb6_3.setForeground(Color.WHITE);
        cb6_3.setBackground(Color.WHITE);
        cb6_3.setBounds(468, 477, 21, 29);
        cb6_3.addItemListener(new ItemListen());
        panel.add(cb6_3);

        cb6_2 = new JCheckBox("");
        cb6_2.setForeground(Color.WHITE);
        cb6_2.setBackground(Color.WHITE);
        cb6_2.setBounds(440, 477, 21, 29);
        cb6_2.addItemListener(new ItemListen());
        panel.add(cb6_2);

        cb6_1 = new JCheckBox("");
        cb6_1.setForeground(Color.WHITE);
        cb6_1.setBackground(Color.WHITE);
        cb6_1.setBounds(412, 477, 21, 29);
        cb6_1.addItemListener(new ItemListen());
        panel.add(cb6_1);

        cb6_0 = new JCheckBox("");
        cb6_0.setForeground(Color.WHITE);
        cb6_0.setBackground(Color.WHITE);
        cb6_0.setBounds(382, 477, 21, 29);
        cb6_0.addItemListener(new ItemListen());
        panel.add(cb6_0);

        cb7_0 = new JCheckBox("");
        cb7_0.setForeground(Color.WHITE);
        cb7_0.setBackground(Color.WHITE);
        cb7_0.setBounds(380, 530, 21, 29);
        cb7_0.addItemListener(new ItemListen());
        panel.add(cb7_0);

        cb7_1 = new JCheckBox("");
        cb7_1.setForeground(Color.WHITE);
        cb7_1.setBackground(Color.WHITE);
        cb7_1.setBounds(410, 530, 21, 29);
        cb7_1.addItemListener(new ItemListen());
        panel.add(cb7_1);

        cb7_2 = new JCheckBox("");
        cb7_2.setForeground(Color.WHITE);
        cb7_2.setBackground(Color.WHITE);
        cb7_2.setBounds(438, 530, 21, 29);
        cb7_2.addItemListener(new ItemListen());
        panel.add(cb7_2);

        cb7_3 = new JCheckBox("");
        cb7_3.setForeground(Color.WHITE);
        cb7_3.setBackground(Color.WHITE);
        cb7_3.setBounds(466, 530, 21, 29);
        cb7_3.addItemListener(new ItemListen());
        panel.add(cb7_3);

        cb8_0 = new JCheckBox("");
        cb8_0.setForeground(Color.WHITE);
        cb8_0.setBackground(Color.WHITE);
        cb8_0.setBounds(380, 592, 21, 29);
        cb8_0.addItemListener(new ItemListen());
        panel.add(cb8_0);

        cb8_1 = new JCheckBox("");
        cb8_1.setForeground(Color.WHITE);
        cb8_1.setBackground(Color.WHITE);
        cb8_1.setBounds(410, 592, 21, 29);
        cb8_1.addItemListener(new ItemListen());
        panel.add(cb8_1);

        cb8_2 = new JCheckBox("");
        cb8_2.setForeground(Color.WHITE);
        cb8_2.setBackground(Color.WHITE);
        cb8_2.setBounds(438, 592, 21, 29);
        cb8_2.addItemListener(new ItemListen());
        panel.add(cb8_2);

        cb8_3 = new JCheckBox("");
        cb8_3.setForeground(Color.WHITE);
        cb8_3.setBackground(Color.WHITE);
        cb8_3.setBounds(466, 592, 21, 29);
        cb8_3.addItemListener(new ItemListen());
        panel.add(cb8_3);

        cb9_3 = new JCheckBox("");
        cb9_3.setForeground(Color.WHITE);
        cb9_3.setBackground(Color.WHITE);
        cb9_3.setBounds(466, 664, 21, 29);
        cb9_3.addItemListener(new ItemListen());
        panel.add(cb9_3);

        cb9_2 = new JCheckBox("");
        cb9_2.setForeground(Color.WHITE);
        cb9_2.setBackground(Color.WHITE);
        cb9_2.setBounds(438, 664, 21, 29);
        cb9_2.addItemListener(new ItemListen());
        panel.add(cb9_2);

        cb9_1 = new JCheckBox("");
        cb9_1.setForeground(Color.WHITE);
        cb9_1.setBackground(Color.WHITE);
        cb9_1.setBounds(410, 664, 21, 29);
        cb9_1.addItemListener(new ItemListen());
        panel.add(cb9_1);

        cb9_0 = new JCheckBox("");
        cb9_0.setForeground(Color.WHITE);
        cb9_0.setBackground(Color.WHITE);
        cb9_0.setBounds(380, 664, 21, 29);
        cb9_0.addItemListener(new ItemListen());
        panel.add(cb9_0);

        JLabel background_Label = new JLabel("");
        background_Label.setBounds(0, 0, 504, 814);
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/DepressionTest1.png"));
        background_Label.setIcon(img2);
        panel.add(background_Label);

        setBounds(0, 0, 520, 814);
        setLocationRelativeTo(null);

        setResizable(false); // 화면 크기 고정하는 작업
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 테스트 종료시 프로그램 전체 종료
        // 이를 지정하지 않으면 메인프레임을 닫았는데도 JFrame객체는 JVM에서 계속 살아서 실행됨.
        // 즉, 사용자에게 보여지는 View는 종료되었지만 프로그램은 계속 실행중인 상태가 됨
        setVisible(true); // 테스트 실행 시 정상 출력되면 화면에 나타냄

    }

    private class ItemListen implements ItemListener {
        public void itemStateChanged(ItemEvent arg0) {
            JCheckBox cb = (JCheckBox) arg0.getSource();

            // 문제 1번
            if (cb == cb1_0) { // 체크가 됐냐 안됐냐
                if (cb1_0.isSelected()) { // 체크하면 체크한걸로 바뀜
                    cb1_1.setSelected(false);
                    cb1_2.setSelected(false);
                    cb1_3.setSelected(false);
                    total += 0;
                }
            }

            if (cb == cb1_1) {
                if (cb1_1.isSelected()) {
                    cb1_0.setSelected(false);
                    cb1_2.setSelected(false);
                    cb1_3.setSelected(false);
                    total += 1;
                }
            }

            if (cb == cb1_2) {
                if (cb1_2.isSelected()) {
                    cb1_0.setSelected(false);
                    cb1_1.setSelected(false);
                    cb1_3.setSelected(false);
                    total += 2;
                }
            }

            if (cb == cb1_3) {
                if (cb1_3.isSelected()) {
                    cb1_0.setSelected(false);
                    cb1_1.setSelected(false);
                    cb1_2.setSelected(false);
                    total += 3;
                }
            }

            // 문제2번
            if (cb == cb2_0) {
                if (cb2_0.isSelected()) {
                    cb2_1.setSelected(false);
                    cb2_2.setSelected(false);
                    cb2_3.setSelected(false);
                    total += 0;
                }
            }

            if (cb == cb2_1) {
                if (cb2_1.isSelected()) {
                    cb2_0.setSelected(false);
                    cb2_2.setSelected(false);
                    cb2_3.setSelected(false);
                    total += 1;
                }
            }

            if (cb == cb2_2) {
                if (cb1_2.isSelected()) {
                    cb2_0.setSelected(false);
                    cb2_1.setSelected(false);
                    cb2_3.setSelected(false);
                    total += 2;
                }
            }

            if (cb == cb2_3) {
                if (cb2_3.isSelected()) {
                    cb2_0.setSelected(false);
                    cb2_1.setSelected(false);
                    cb2_2.setSelected(false);
                    total += 3;
                }
            }

            // 문제3번
            if (cb == cb3_0) {
                if (cb3_0.isSelected()) {
                    cb3_1.setSelected(false);
                    cb3_2.setSelected(false);
                    cb3_3.setSelected(false);
                    total += 0;
                }
            }

            if (cb == cb3_1) {
                if (cb3_1.isSelected()) {
                    cb3_0.setSelected(false);
                    cb3_2.setSelected(false);
                    cb3_3.setSelected(false);
                    total += 1;
                }
            }

            if (cb == cb3_2) {
                if (cb3_2.isSelected()) {
                    cb3_0.setSelected(false);
                    cb3_1.setSelected(false);
                    cb3_3.setSelected(false);
                    total += 2;
                }
            }

            if (cb == cb3_3) {
                if (cb3_3.isSelected()) {
                    cb3_0.setSelected(false);
                    cb3_1.setSelected(false);
                    cb3_2.setSelected(false);
                    total += 3;
                }
            }

            // 문제4번
            if (cb == cb4_0) {
                if (cb4_0.isSelected()) {
                    cb4_1.setSelected(false);
                    cb4_2.setSelected(false);
                    cb4_3.setSelected(false);
                    total += 0;
                }
            }

            if (cb == cb4_1) {
                if (cb4_1.isSelected()) {
                    cb4_0.setSelected(false);
                    cb4_2.setSelected(false);
                    cb4_3.setSelected(false);
                    total += 1;
                }
            }

            if (cb == cb4_2) {
                if (cb4_2.isSelected()) {
                    cb4_0.setSelected(false);
                    cb4_1.setSelected(false);
                    cb4_3.setSelected(false);
                    total += 2;
                }
            }

            if (cb == cb4_3) {
                if (cb4_3.isSelected()) {
                    cb4_0.setSelected(false);
                    cb4_1.setSelected(false);
                    cb4_2.setSelected(false);
                    total += 3;
                }
            }

            // 문제 5번
            if (cb == cb5_0) {
                if (cb5_0.isSelected()) {
                    cb5_1.setSelected(false);
                    cb5_2.setSelected(false);
                    cb5_3.setSelected(false);
                    total += 0;
                }
            }

            if (cb == cb5_1) {
                if (cb5_1.isSelected()) {
                    cb5_0.setSelected(false);
                    cb5_2.setSelected(false);
                    cb5_3.setSelected(false);
                    total += 1;
                }
            }

            if (cb == cb5_2) {
                if (cb5_2.isSelected()) {
                    cb5_0.setSelected(false);
                    cb5_1.setSelected(false);
                    cb5_3.setSelected(false);
                    total += 2;
                }
            }

            if (cb == cb5_3) {
                if (cb5_3.isSelected()) {
                    cb5_0.setSelected(false);
                    cb5_1.setSelected(false);
                    cb5_2.setSelected(false);
                    total += 3;
                }
            }

            // 문제6번
            if (cb == cb6_0) {
                if (cb6_0.isSelected()) {
                    cb6_1.setSelected(false);
                    cb6_2.setSelected(false);
                    cb6_3.setSelected(false);
                    total += 0;
                }
            }

            if (cb == cb6_1) {
                if (cb6_1.isSelected()) {
                    cb6_0.setSelected(false);
                    cb6_2.setSelected(false);
                    cb6_3.setSelected(false);
                    total += 1;
                }
            }

            if (cb == cb6_2) {
                if (cb6_2.isSelected()) {
                    cb6_0.setSelected(false);
                    cb6_1.setSelected(false);
                    cb6_3.setSelected(false);
                    total += 2;
                }
            }

            if (cb == cb6_3) {
                if (cb6_3.isSelected()) {
                    cb6_0.setSelected(false);
                    cb6_1.setSelected(false);
                    cb6_2.setSelected(false);
                    total += 3;
                }
            }

            // 문제7번
            if (cb == cb7_0) {
                if (cb7_0.isSelected()) {
                    cb7_1.setSelected(false);
                    cb7_2.setSelected(false);
                    cb7_3.setSelected(false);
                    total += 0;
                }
            }

            if (cb == cb7_1) {
                if (cb7_1.isSelected()) {
                    cb7_0.setSelected(false);
                    cb7_2.setSelected(false);
                    cb7_3.setSelected(false);
                    total += 1;
                }
            }

            if (cb == cb7_2) {
                if (cb7_2.isSelected()) {
                    cb7_0.setSelected(false);
                    cb7_1.setSelected(false);
                    cb7_3.setSelected(false);
                    total += 2;
                }
            }

            if (cb == cb7_3) {
                if (cb7_3.isSelected()) {
                    cb7_0.setSelected(false);
                    cb7_1.setSelected(false);
                    cb7_2.setSelected(false);
                    total += 3;
                }
            }

            // 문제8번
            if (cb == cb8_0) {
                if (cb8_0.isSelected()) {
                    cb8_1.setSelected(false);
                    cb8_2.setSelected(false);
                    cb8_3.setSelected(false);
                    total += 0;
                }
            }

            if (cb == cb8_1) {
                if (cb8_1.isSelected()) {
                    cb8_0.setSelected(false);
                    cb8_2.setSelected(false);
                    cb8_3.setSelected(false);
                    total += 1;
                }
            }

            if (cb == cb8_2) {
                if (cb8_2.isSelected()) {
                    cb8_0.setSelected(false);
                    cb8_1.setSelected(false);
                    cb8_3.setSelected(false);
                    total += 2;
                }
            }

            if (cb == cb8_3) {
                if (cb8_3.isSelected()) {
                    cb8_0.setSelected(false);
                    cb8_1.setSelected(false);
                    cb8_2.setSelected(false);
                    total += 3;
                }
            }

            // 문제 9번
            if (cb == cb9_0) {
                if (cb9_0.isSelected()) {
                    cb9_1.setSelected(false);
                    cb9_2.setSelected(false);
                    cb9_3.setSelected(false);
                    total += 0;
                }
            }

            if (cb == cb9_1) {
                if (cb9_1.isSelected()) {
                    cb9_0.setSelected(false);
                    cb9_2.setSelected(false);
                    cb9_3.setSelected(false);
                    total += 1;
                }
            }

            if (cb == cb9_2) {
                if (cb9_2.isSelected()) {
                    cb9_0.setSelected(false);
                    cb9_1.setSelected(false);
                    cb9_3.setSelected(false);
                    total += 2;
                }
            }

            if (cb == cb9_3) {
                if (cb9_3.isSelected()) {
                    cb9_0.setSelected(false);
                    cb9_1.setSelected(false);
                    cb9_2.setSelected(false);
                    total += 3;
                }
            }
        }

    }

}
