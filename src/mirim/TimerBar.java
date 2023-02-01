package mirim;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;

class TimerBar extends JLabel implements Runnable {
	int width = 200, height = 50;
	int x = 140, y = 90;
	Color color = new Color(255, 0, 0); // 빨간색으로 설정

	int second; // 초 선언

	public TimerBar(int second) {
		setBackground(color);
		setOpaque(true);
		setBounds(x, y, 141, 90);

		this.second = second;
	}

	@Override
	public void run() {
		while (true) {
			try {
				if (width == 0)
					break;
				Thread.sleep(1000 / (width / second)); //동시 수행 가능 
				System.out.println(1000 / (width / second));
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (getWidth() > 0) { //0보다 클 때
				width -= 5; // 너비가 5씩 줄어듦
//				System.out.println(width);
				setBounds(x, y, width, height);
			} else { //0이 되면 끝
				// System.out.println("종료");
				break;
			}
		}
	}
}