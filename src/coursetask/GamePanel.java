package coursetask;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GamePanel() {
		
		//设置ui界面基本布局
		setSize(400,300);
		setTitle("猜数字游戏");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Container ct = getContentPane();
		//设置需要的控件
		JLabel message = new JLabel("你可以在下面的文本框中进行输入\n"
				+ "点击确定确认你猜测的数字");
		JTextField getinput = new JTextField("");
		JButton confirm = new JButton("确认");
		//设置控件的位置
		message.setBounds(30,5,500,100);
		getinput.setBounds(60,100,250,50);
		confirm.setBounds(110, 180,150,50);
		//将控件加入到容器中
		ct.add(message);
		ct.add(getinput);
		ct.add(confirm);
		//为文本域添加键盘事件响应，若按下回车，则直接开始计算是否相等
		getinput.addKeyListener(new KeyListener() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					Datas.input = Integer.parseInt(getinput.getText());
					//判断用户输入合法性
					if(!Datas.judgeinput()) GameResult.error();
					//用户输入合法，开始计算用户是否成功猜数
					else {
						if(Datas.count >= Datas.maxcount) {
							dispose();
							new GameStart();
							GameResult.fail();
						}
						else {
							if(Datas.input != Datas.target) {
							GameResult.again(Datas.input>Datas.target);
							Datas.count+=1;
							}
							else {
								dispose();
								new GameStart();
								GameResult.success();
							}
						}
					}
				};
			}
			public void keyTyped(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {}
		});
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datas.input = Integer.parseInt(getinput.getText());
				if(!Datas.judge()) GameResult.error();
				else {
					Datas.input = Integer.parseInt(getinput.getText());
					//判断用户输入合法性
					if(!Datas.judgeinput()) GameResult.error();
					//用户输入合法，开始计算用户是否成功猜数
					else {
						if(Datas.count >= Datas.maxcount) {
							dispose();
							new GameStart();
							GameResult.fail();
						}
						else {
							if(Datas.input != Datas.target) {
								GameResult.again(Datas.input>Datas.target);
								Datas.count+=1;
							}
							else {
								dispose();
								Datas.otime = System.currentTimeMillis( );
								new GameStart();
								GameResult.success();
							}
						}
					}
				}
			}
		});
		
		setVisible(true);
	}
	
	
	
	

}
