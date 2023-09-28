package mirim.ptest;

import mirim.TestType;
import mirim.data.InputData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicalTestResult extends JFrame {
    private JLabel mResult_BMI;
    private JLabel mResult_BMI_solu;
    private JLabel mResult_EyeTest;
    private JLabel mResult_EyeTest_solu;
    private JLabel mResult_RubTest;
    private JLabel mResult_RubTest_solu;
    private JLabel mResult_RunTest;
    private JLabel mResult_RunTest_solu;
    private JLabel mResult_StTest;
    private JLabel mResult_StTest_solu;

    public PhysicalTestResult() {
        setTitle("체력검사 결과");

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 504, 814);
        panel.setLayout(null);

        JButton btnFirst = new JButton("");
        ImageIcon img = new ImageIcon(this.getClass().getResource("/first.png"));
        btnFirst.setIcon(img);
        btnFirst.setBounds(349, 729, 143, 41);
        btnFirst.setBorderPainted(false); // 테두리 없애기
        panel.add(btnFirst);

        btnFirst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TestType();
                dispose();
            }
        });

        mResult_BMI = new JLabel("");
        mResult_BMI.setFont(new Font("양재붓꽃체L", Font.BOLD, 19));
        mResult_BMI.setBounds(24, 641, 457, 37);
        panel.add(mResult_BMI);

        mResult_BMI_solu = new JLabel("");
        mResult_BMI_solu.setFont(new Font("양재붓꽃체L", Font.PLAIN, 14));
        mResult_BMI_solu.setBounds(24, 662, 457, 77);
        panel.add(mResult_BMI_solu);

        mResult_EyeTest = new JLabel("");
        mResult_EyeTest.setFont(new Font("양재붓꽃체L", Font.BOLD, 19));
        mResult_EyeTest.setBounds(24, 502, 450, 37);
        panel.add(mResult_EyeTest);

        mResult_RubTest = new JLabel("");
        mResult_RubTest.setFont(new Font("양재붓꽃체L", Font.BOLD, 19));
        mResult_RubTest.setBounds(24, 375, 450, 37);
        panel.add(mResult_RubTest);

        mResult_EyeTest_solu = new JLabel("");
        mResult_EyeTest_solu.setFont(new Font("양재붓꽃체L", Font.PLAIN, 14));
        mResult_EyeTest_solu.setBounds(24, 527, 457, 85);
        panel.add(mResult_EyeTest_solu);

        mResult_RubTest_solu = new JLabel("");
        mResult_RubTest_solu.setFont(new Font("양재붓꽃체L", Font.PLAIN, 14));
        mResult_RubTest_solu.setBounds(24, 390, 457, 70);
        panel.add(mResult_RubTest_solu);

        mResult_RunTest = new JLabel("");
        mResult_RunTest.setFont(new Font("양재붓꽃체L", Font.BOLD, 19));
        mResult_RunTest.setBounds(23, 238, 450, 42);
        panel.add(mResult_RunTest);

        mResult_RunTest_solu = new JLabel("");
        mResult_RunTest_solu.setFont(new Font("양재붓꽃체L", Font.PLAIN, 14));
        mResult_RunTest_solu.setBounds(24, 267, 457, 85);
        panel.add(mResult_RunTest_solu);

        mResult_StTest = new JLabel("");
        mResult_StTest.setFont(new Font("양재붓꽃체L", Font.BOLD, 19));
        mResult_StTest.setBounds(24, 104, 450, 41);
        panel.add(mResult_StTest);

        mResult_StTest_solu = new JLabel("");
        mResult_StTest_solu.setFont(new Font("양재붓꽃체L", Font.PLAIN, 14));
        mResult_StTest_solu.setBounds(24, 129, 457, 85);
        panel.add(mResult_StTest_solu);

        // 불러오기
        setResultData1();
        setResultData2();
        setResultData3();
        setResultData4();
        setResultData5();

        getContentPane().setLayout(null);
        getContentPane().add(panel);

        JLabel background_Label = new JLabel("");
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/ptResult2.png"));
        background_Label.setIcon(img1);
        background_Label.setBounds(0, 0, 504, 814);
        panel.add(background_Label);

        setBounds(0, 0, 518, 815);
        setLocationRelativeTo(null);

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void setResultData1() { // 유연성 테스트 결과
        // 앉아윗몸앞으로굽히기 1등급 - 16cm 이상 2등급 - 11cm 이상 3등급 - 8cm 이상 4등급 - 2cm 이상 5등급 - -40cm이상
        int sT = Integer.parseInt(InputData.sitDown.trim()); // trim => 띄어쓰기 없애기
        String result_StTest = "";
        String result_StTest_solu = "<html>•해결방안 : 학교 가기전 매일 아침 건강하고 든든한 아침식사 먹기<br/>*매일 10분씩 쉬는시간에 스트레칭하기*, 물 충분히 마시기<br/>유연해지는 과정에서 긍정적인 태도를 가지기<br/>근육을 늘려 약간 당겨짐이 느껴질 정도로 하기<html/>";
        if (sT >= 8) {
            result_StTest = "유연성이 좋습니다.";
            mResult_StTest.setText(result_StTest);
        } else {
            result_StTest = "유연성이 안좋습니다.";
            mResult_StTest.setText(result_StTest);
            mResult_StTest_solu.setText(result_StTest_solu);
        }
    }

    public void setResultData2() { // 심폐지구력 테스트 결과
        // 왕복오래달리기(셔틀런) 1등급 - 50개 이상 2등급 - 37개 이상 3등급 - 25개 이상 4등급 - 17개 이상 5등급 - 0개
        int sT = Integer.parseInt(InputData.run.trim()); // trim => 띄어쓰기 없애기
        String result_Run = "";
        String result_Run_solu = "<html>•해결방안 : 운동장을 2개의 구역으로 나누고, 1구역에서는 걷기, 2구역에서는 달리기<br/>간과 거리를 정해 놓고 달려 보고, 익숙해지면 시간을 줄이거나 거리를 늘려 가며 운동하기<br/><html/>";
        if (sT >= 25) {
            result_Run = "심폐지구력이 좋습니다.";
            mResult_RunTest.setText(result_Run);
        } else {
            result_Run = "심폐지구력이 안좋습니다.";
            mResult_RunTest.setText(result_Run);
            mResult_RunTest_solu.setText(result_Run_solu);
        }
    }

    private void setResultData5() { // BMI 테스트 결과
        double kg = Double.parseDouble(InputData.kg.trim());
        double cm = Double.parseDouble(InputData.cm.trim());

        double BMI = getBMIData(kg, cm);

        System.out.println("kg : " + kg + " cm : " + cm + " BMI : " + BMI);

        String result_BMI = "";
        String result_BMI_solu = "";
        if (BMI >= 25) {
            result_BMI = "비만입니다.";
            mResult_BMI.setText(result_BMI);
            result_BMI_solu = "<html>•해결방안 : 아침식사 반드시 하기, 쉬는시간 마다 일어나서 복도 걸어다니기<br/>점심먹고 수업전까지 운동장이나 정원돌기<html/>";
            mResult_BMI_solu.setText(result_BMI_solu);
        } else if (BMI > 23 && BMI < 25) {
            result_BMI = "과체중입니다.";
            mResult_BMI.setText(result_BMI);
            result_BMI_solu = "<html>•해결방안 : 균형 있는 식습관 가지기,<br/> 친구들과 운동장 및 정원 걷기, 빠르게 걷기<br/>쉬는시간에 일어나서 친구들과 복도걸어다니기<html/>";
            mResult_BMI_solu.setText(result_BMI_solu);
        } else if (BMI < 23 && BMI > 18.5) {
            result_BMI = "정상체중입니다";
            mResult_BMI.setText(result_BMI);
        } else if (BMI < 17) {
            result_BMI = "저체중입니다.";
            mResult_BMI.setText(result_BMI);
            result_BMI_solu = "<html>•해결방안 : 과일과 채소, 탄수화물이 충분히 포함된 균형잡힌 식단 식사하기,<br/> 적절한 운동하기, 초콜릿, 케이크와 같은 고칼로리 음식에 의존하지 않기<html/>";
            mResult_BMI_solu.setText(result_BMI_solu);
        }
    }

    private double getBMIData(double kg, double cm) {
        // 공식 BMI 지수 계산법 => 체중(kg) /(키(m)× 키(m))
        double m = cm * 0.01;
        double BMI = kg / ((m * m));
        return BMI;
    }

    private void setResultData4() { // 시력 테스트 결과

        double eyes1 = Double.parseDouble(InputData.eyes1.trim());
        double eyes2 = Double.parseDouble(InputData.eyes2.trim());

        String result_Eye = "";
        String result_Eye_solu = "<html> •해결방안 : 눈을 지그시 감았다 뜨기, 당근&블루베리주스 마시기<br/>먼 산 바라보기(관악산), 안구 운동 틈틈이 하기_눈동자로 나비를 그린다고 생각하며 눈동자를 움직여주기<br/> 멀리 떨어진 지점에 시선을 고정시킨 다음 눈으로 천천히 숫자 8 그리기<html/>";
        if (eyes1 > 1.0 && eyes2 > 1.0) {
            result_Eye = "시력이 좋습니다.";
            mResult_EyeTest.setText(result_Eye);
        } else if (eyes1 > 1.0 && eyes2 < 1.0) {
            result_Eye = "오른쪽 시력이 안좋습니다.";
            mResult_EyeTest.setText(result_Eye);
            mResult_EyeTest_solu.setText(result_Eye_solu);
        } else if (eyes1 < 1.0 && eyes2 > 1.0) {
            result_Eye = "왼쪽 시력이 안좋습니다.";
            mResult_EyeTest_solu.setText(result_Eye_solu);
            mResult_EyeTest.setText(result_Eye);
        } else { // 오른쪽 왼쪽 시력 구분
            result_Eye = "시력이 안좋습니다.";
            mResult_EyeTest.setText(result_Eye);
            mResult_EyeTest_solu.setText(result_Eye_solu);
        }
    }

    public void setResultData3() { // 근력 및 근지구력 테스트 결과
        /*무릎대고 팔굽혀펴기 무릎대고 팔굽혀펴기 1등급 - 40개 이상 2등급 - 24개 이상 3등급 - 14개 이상 4등급 - 6개 이상 5등급
         * - 0 이상 윗몸말아올리기 1등급 - 40 이상 2등급 - 30 이상 3등급 - 13 이상 4등급 - 4 이상 5등급 - 0 이상*/

        int rub = Integer.parseInt(InputData.rollUp.trim()); // roll up
        int pu = Integer.parseInt(InputData.pushUp.trim()); // push up
        String result_Rub = "";
        String result_Rub_solu = "<html> •해결방안 : 아침, 점심, 쉬는시간에 계단 오르기 <br/>또는 친구들과 운동장, 정원 돌기<html/>";
        if (rub >= 13 && pu >= 14) {
            result_Rub = "체력이 좋습니다.";
            mResult_RubTest.setText(result_Rub);
        } else {
            result_Rub = "체력이 안좋습니다.";
            mResult_RubTest.setText(result_Rub);
            mResult_RubTest_solu.setText(result_Rub_solu);
        }
    }

}