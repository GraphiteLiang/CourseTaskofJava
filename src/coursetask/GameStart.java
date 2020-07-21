package coursetask;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GameStart extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GameStart() {
		setSize(400,300);
		setTitle("猜数字游戏");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Container ct = getContentPane();
		
		JLabel message = new JLabel("点击开始以开始游戏");
		JButton start = new JButton("开始");
		JButton quit = new JButton("退出");
		
		message.setBounds(40,10,500,100);
		start.setBounds(50, 200,100,30);
		quit.setBounds(250,200,100,30);
		
		
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new GameRange();
				new Datas();
			}
		});
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		ct.add(message);
		ct.add(start);
		ct.add(quit);
		setVisible(true);
		
		}
	public static void main(String args[]){
		new GameStart();
	}
}
