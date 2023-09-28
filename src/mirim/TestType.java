package mirim;

import mirim.data.InputData;
import mirim.etest.EtType;
import mirim.ptest.PhysicalTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestType extends JFrame {

    private JPanel panel;
    private JLabel mResult_name;

    public TestType() {
        setTitle("테스트 선택");

        panel = new JPanel();
        panel.setBounds(0, 0, 504, 814);

        getContentPane().setLayout(null);

        getContentPane().add(panel);
        panel.setLayout(null);

        mResult_name = new JLabel("");
        mResult_name.setForeground(Color.WHITE); // 글씨색 흰색으로 지정
        mResult_name.setFont(new Font("HY견고딕", Font.PLAIN, 32)); // 폰트설정
        mResult_name.setBounds(90, 13, 106, 51); // 위치 설정
        panel.add(mResult_name);

        setName(); // 사용자가 입력했던 이름 불러오기

        JButton btnPrev = new JButton(""); // 이전버튼
        btnPrev.setBackground(new Color(255, 255, 255));
        ImageIcon img = new ImageIcon(this.getClass().getResource("/before.png"));
        btnPrev.setIcon(img);
        btnPrev.setForeground(new Color(0, 0, 0));
        btnPrev.setBounds(40, 715, 143, 41);
        btnPrev.setBorderPainted(false); // 테두리 없애기
        panel.add(btnPrev);

        btnPrev.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int res = JOptionPane.showConfirmDialog(null, "이전 메뉴로 이동하시겠습니까?", "", JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null);
                if (res == 0) {
                    new Questionnaire();
                    dispose();
                }
            }
        });

        JButton pht = new JButton("");
        pht.setForeground(new Color(255, 255, 255));
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/pt.png"));
        pht.setIcon(img1);
        pht.setFont(new Font("굴림", Font.PLAIN, 13));
        pht.setBackground(new Color(255, 255, 255));
        pht.setBounds(27, 313, 444, 111);
        pht.setBorderPainted(false); // 테두리 없애기
        panel.add(pht);
        // add(jp2, BorderLayout.CENTER);

        pht.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PhysicalTest();
                dispose();
            }
        });

        JButton emt = new JButton("");
        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/et.png"));
        emt.setIcon(img3);
        emt.setBorderPainted(false); // 테두리 없애기
        emt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        emt.setFont(new Font("굴림", Font.PLAIN, 13));
        emt.setBackground(Color.WHITE);
        emt.setBounds(27, 157, 444, 111);
        panel.add(emt);

        emt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new EtType();
                dispose();
            }
        });

        JLabel backgroud_Label = new JLabel("");
        ImageIcon img4 = new ImageIcon(this.getClass().getResource("/testype.png"));
        backgroud_Label.setIcon(img4);
        backgroud_Label.setBounds(0, 0, 504, 814);
        panel.add(backgroud_Label);

        setBounds(0, 0, 504, 814);
        setLocationRelativeTo(null);

        setResizable(false); // 화면 크기 고정하는 작업
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setName() { // 사용자의 이름을 InputData에서 불러오기
        String result_name = InputData.name;
        mResult_name.setText(result_name);
    }
}
