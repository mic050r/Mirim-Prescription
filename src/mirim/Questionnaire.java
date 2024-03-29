package mirim;

import mirim.data.InputData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questionnaire extends JFrame {

    private JTextField mText_cm;
    private JTextField mText_kg;
    private JTextField mText_blood;
    private JTextField mText_birth;
    private JTextField mText_name;
    private JButton btnNext;
    private JButton btnPrev;

    public Questionnaire() { // 문진표 작성
        setTitle("문진표 작성"); // 화면 이름 설정

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 504, 814);
        panel.setLayout(null);

        btnNext = new JButton("");
        ImageIcon img = new ImageIcon(this.getClass().getResource("/next.png"));
        btnNext.setIcon(img);
        btnNext.setForeground(new Color(255, 255, 255));
        btnNext.setBounds(319, 715, 143, 41);
        btnNext.setBorderPainted(false); // 테두리 없애기
        panel.add(btnNext);

        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getData();
            }
        });

        btnPrev = new JButton("");
        btnPrev.setBackground(new Color(255, 255, 255));
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/before.png"));
        btnPrev.setIcon(img1);
        btnPrev.setForeground(new Color(0, 0, 0));
        btnPrev.setBounds(40, 715, 143, 41);
        btnPrev.setBorderPainted(false); // 테두리 없애기
        panel.add(btnPrev);

        btnPrev.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int res = JOptionPane.showConfirmDialog(null, "이전 메뉴로 이동하시겠습니까?", "", JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null);
                if (res == 0) {
                    new Start();
                    dispose();
                }
            }
        });

        JLabel mText_attention = new JLabel("※숫자만 입력해주세요.");
        mText_attention.setBounds(189, 665, 155, 15);
        panel.add(mText_attention);

        JLabel mText_attention2 = new JLabel("※숫자만 입력해주세요.");
        mText_attention2.setBounds(189, 555, 155, 15);
        panel.add(mText_attention2);

        mText_cm = new JTextField();
        mText_cm.setForeground(new Color(0, 0, 0));
        mText_cm.setFont(new Font("굴림", Font.PLAIN, 25));
        mText_cm.setBounds(189, 512, 202, 41);
        panel.add(mText_cm);
        mText_cm.setColumns(10);

        mText_kg = new JTextField();
        mText_kg.setForeground(new Color(0, 0, 0));
        mText_kg.setFont(new Font("굴림", Font.PLAIN, 25));
        mText_kg.setColumns(10);
        mText_kg.setBounds(189, 622, 202, 41);
        panel.add(mText_kg);

        mText_blood = new JTextField();
        mText_blood.setForeground(new Color(0, 0, 0));
        mText_blood.setFont(new Font("굴림", Font.PLAIN, 25));
        mText_blood.setColumns(10);
        mText_blood.setBounds(189, 397, 202, 41);
        panel.add(mText_blood);

        mText_birth = new JTextField();
        mText_birth.setForeground(new Color(0, 0, 0));
        mText_birth.setFont(new Font("굴림", Font.PLAIN, 25));
        mText_birth.setColumns(10);
        mText_birth.setBounds(189, 286, 202, 41);
        panel.add(mText_birth);

        mText_name = new JTextField();
        mText_name.setForeground(new Color(0, 0, 0));
        mText_name.setFont(new Font("굴림", Font.PLAIN, 25));
        mText_name.setColumns(10);
        mText_name.setBounds(189, 180, 202, 41);
        panel.add(mText_name);

        JLabel backgroud_Label = new JLabel("");
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/questionnaire.png"));
        backgroud_Label.setIcon(img2);
        backgroud_Label.setBounds(0, 0, 504, 814);
        panel.add(backgroud_Label);

        getContentPane().setLayout(null);

        getContentPane().add(panel);

        setBounds(0, 0, 504, 814);
        setLocationRelativeTo(null);

        setResizable(false); // 화면 크기 고정하는 작업, 임의로 사용자가 바꿀 수 없음 사이즈를
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 테스트 종료시 프로그램 전체 종료
        // 이를 지정하지 않으면 메인프레임을 닫았는데도 JFrame객체는 JVM에서 계속 살아서 실행됨.
        // 즉, 사용자에게 보여지는 View는 종료되었지만 프로그램은 계속 실행중인 상태가 됨
        setVisible(true);
    }

    private void getData() {
        String name = mText_name.getText();
        String birth = mText_birth.getText();
        String blood = mText_blood.getText();
        String cm = mText_cm.getText();
        String kg = mText_kg.getText();

        if (isEmpty(name, "이름을 입력하지 않았습니다.") || isEmpty(birth, "생일을 입력하지 않았습니다.")
                || isEmpty(blood, "혈액형을 입력하지 않았습니다.") || isEmpty(cm, "키를 입력하지 않았습니다.")
                || isNotPositiveInteger(cm, "키를 다시 입력해주세요.") || isEmpty(kg, "몸무게를 입력하지 않았습니다.")
                || isNotPositiveInteger(kg, "몸무게를 다시 입력해주세요.")) {
            return;
        }

        InputData.name = name;
        InputData.birth = birth;
        InputData.blood = blood;
        InputData.cm = cm;
        InputData.kg = kg;

        new TestType();
        dispose();
    }

    private boolean isEmpty(String value, String errorMessage) {
        if (value.length() == 0) {
            JOptionPane.showMessageDialog(null, errorMessage, "문진표를 다시 확인해주세요.", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean isNotPositiveInteger(String value, String errorMessage) {
        try {
            int intValue = Integer.parseInt(value);
            if (intValue < 0) {
                JOptionPane.showMessageDialog(null, errorMessage, "문진표를 다시 확인해주세요.", JOptionPane.WARNING_MESSAGE);
                return true;
            }
        } catch (NumberFormatException e) {
            // 숫자로 변환할 수 없는 경우도 처리
            JOptionPane.showMessageDialog(null, errorMessage, "문진표를 다시 확인해주세요.", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }
}
