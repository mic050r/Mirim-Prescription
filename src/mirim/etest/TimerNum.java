package mirim.etest;

import javax.swing.*;
import java.awt.*;

class TimerNum extends JLabel implements Runnable {
    int width = 75, height = 75;
    int x = 200, y = 150;

    int second;

    public TimerNum(int second) {
        setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
        setBounds(x, y, width, height);
        setForeground(Color.BLUE);
        setText(second + "");
        // setFont(new Font("맑은고딕", Font.PLAIN, 50));
        setHorizontalAlignment(JLabel.CENTER); //라벨 가운데 정렬

        this.second = second;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000); // 1초
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (second > 0) {
                second -= 1; // 1초씩 줄어듦
                setText(second + "");
            } else {
                setVisible(false);
                break;
            }
        }
    }
}