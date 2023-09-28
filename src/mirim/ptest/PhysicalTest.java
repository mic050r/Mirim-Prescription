package mirim.ptest;

import mirim.data.InputData;

import javax.swing.*;
import java.awt.*;

public class PhysicalTest extends JFrame {
    private JTextField mText_eyes1; // 왼쪽눈
    private JTextField mText_eyes2; // 오른쪽 눈
    private JTextField mText_rollUp; // 윗몸말아올리
    private JTextField mText_sitDown; // 앉아윗몸앞으로굽히기
    private JTextField mText_pushUp; // 무릎대고 팔굽혀펴기
    private JTextField mText_run; // 왕복 오래달리기
    private JPanel panel;

    public PhysicalTest() {
        setTitle("신체검사");

        panel = new JPanel();
        panel.setBounds(0, 0, 504, 814);
        panel.setLayout(null);

        mText_eyes1 = createTextField(339, 574, 93, 33, 31);
        mText_eyes2 = createTextField(339, 641, 93, 33, 31);
        mText_rollUp = createTextField(339, 385, 93, 33, 31);
        mText_sitDown = createTextField(381, 158, 51, 33, 31);
        mText_pushUp = createTextField(381, 459, 44, 33, 31);
        mText_run = createTextField(339, 271, 93, 33, 31);

        JButton btnResult = createButton("/resultIcon.png", 329, 719, 143, 41, "결과 확인");

        btnResult.addActionListener(e -> getData());

        getContentPane().setLayout(null);
        getContentPane().add(panel);

        createImageLabel("/PyTest.png", 0, 0, 504, 814, panel);

        setBounds(0, 0, 504, 814);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JTextField createTextField(int x, int y, int width, int height, int fontSize) {
        JTextField textField = new JTextField();
        textField.setFont(new Font("굴림", Font.PLAIN, fontSize));
        textField.setBounds(x, y, width, height);
        panel.add(textField);
        return textField;
    }

    private JButton createButton(String imagePath, int x, int y, int width, int height, String tooltip) {
        JButton button = new JButton("");
        ImageIcon img = new ImageIcon(this.getClass().getResource(imagePath));
        button.setIcon(img);
        button.setBounds(x, y, width, height);
        button.setBorderPainted(false);
        button.setToolTipText(tooltip);
        panel.add(button);
        return button;
    }

    private void getData() {
        String sitDown = mText_sitDown.getText();
        String run = mText_run.getText();
        String rollUp = mText_rollUp.getText();
        String pushUp = mText_pushUp.getText();
        String eyes1 = mText_eyes1.getText();
        String eyes2 = mText_eyes2.getText();

        if (sitDown.isEmpty() || run.isEmpty() || rollUp.isEmpty() || pushUp.isEmpty() || eyes1.isEmpty() || eyes2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "입력되지 않은 항목이 있습니다. 모든 항목을 입력하세요.", "입력 오류", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int runValue = Integer.parseInt(run);
        int rollUpValue = Integer.parseInt(rollUp);
        int pushUpValue = Integer.parseInt(pushUp);

        if (runValue < 0 || rollUpValue < 0 || pushUpValue < 0) {
            JOptionPane.showMessageDialog(null, "음수 값을 입력할 수 없습니다. 양수 값을 입력하세요.", "입력 오류", JOptionPane.WARNING_MESSAGE);
            return;
        }

        InputData.sitDown = sitDown;
        InputData.run = run;
        InputData.rollUp = rollUp;
        InputData.pushUp = pushUp;
        InputData.eyes1 = eyes1;
        InputData.eyes2 = eyes2;

        new PhysicalTestResult();
        dispose();
    }

    private void createImageLabel(String imagePath, int x, int y, int width, int height, JPanel panel) {
        JLabel background_Label = new JLabel("");
        ImageIcon img1 = new ImageIcon(this.getClass().getResource(imagePath));
        background_Label.setIcon(img1);
        background_Label.setBounds(x, y, width, height);
        panel.add(background_Label);
    }


}
