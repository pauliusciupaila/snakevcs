package lt.vcs.paul.SnakeGame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Snake extends JFrame {
	
	private int snakespeed = Board.DELAY;
	
	

    public Snake() {
    	
    	JLabel statusbar = new JLabel("Time");
    	
    	statusbar.setSize(300, 20);
    	this.setSize(300, 325);
    	
        getContentPane().add(new Board(statusbar), BorderLayout.CENTER);
        getContentPane().add(statusbar, BorderLayout.PAGE_END);
        
        
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
   
    }
  

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                JFrame ex = new Snake();
                ex.setVisible(true);  
                
            }
        });
    }
}