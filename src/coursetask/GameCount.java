package coursetask;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GameCount extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameCount() {
		setSize(400,300);
		setTitle("��������Ϸ");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Container ct = getContentPane();
		JLabel message = new JLabel("��������������Ҫ�����²����");
		JTextField getinput = new JTextField("");
		JButton confirm = new JButton("ȷ��");
		//���ÿؼ���λ��
		message.setBounds(50,5,500,100);
		getinput.setBounds(60,100,250,50);
		confirm.setBounds(110, 180,150,50);
		//���ؼ����뵽������
		ct.add(message);
		ct.add(getinput);
		ct.add(confirm);
		
		getinput.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					Datas.maxcount = Integer.parseInt(getinput.getText());
					if(!Datas.judge()) {
						GameResult.error();
						Datas.maxcount = 0;
					}
					else {
						dispose();
						new GamePanel();
					}
				}
			}
		});
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datas.maxcount = Integer.parseInt(getinput.getText());
				if(!Datas.judge()) {
					GameResult.error();
					Datas.maxcount = 0;
				}
				else {
					dispose();
					new GamePanel();
					Datas.stime = System.currentTimeMillis( );
				}
			}
		});
		setVisible(true);
	}
}
