package lt.vcs.paul.SnakeGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.Timer;

public class TimerCount implements ActionListener {

	private int seconds = 0;

	private Timer clock = new Timer(1000, this);

	JLabel statusbar;

	public TimerCount(JLabel statusbar) {
		this.statusbar = statusbar;
	}

	public int getSeconds() {
		return seconds;
	}

	public void start() {
		clock.start();
	}

	public void stop() {
		clock.stop();
	}

	public void reset() {
		seconds = 0;
		statusbar.setText("Time: " + seconds + "s");
	}

	public void actionPerformed(ActionEvent e) {
		seconds++;
		statusbar.setText("Time: " + seconds + "s");
		System.out.println(seconds);
	}

	/*
	 * public static void main(String args[]) {
	 * 
	 * TimerCount gameTimer = new TimerCount();
	 * 
	 * gameTimer.start(); try { Thread.sleep(10000); } catch
	 * (InterruptedException e) { e.printStackTrace(); } gameTimer.stop(); }
	 */
}