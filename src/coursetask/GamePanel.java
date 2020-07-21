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
		
		//����ui�����������
		setSize(400,300);
		setTitle("��������Ϸ");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Container ct = getContentPane();
		//������Ҫ�Ŀؼ�
		JLabel message = new JLabel("�������������ı����н�������\n"
				+ "���ȷ��ȷ����²������");
		JTextField getinput = new JTextField("");
		JButton confirm = new JButton("ȷ��");
		//���ÿؼ���λ��
		message.setBounds(30,5,500,100);
		getinput.setBounds(60,100,250,50);
		confirm.setBounds(110, 180,150,50);
		//���ؼ����뵽������
		ct.add(message);
		ct.add(getinput);
		ct.add(confirm);
		//Ϊ�ı�����Ӽ����¼���Ӧ�������»س�����ֱ�ӿ�ʼ�����Ƿ����
		getinput.addKeyListener(new KeyListener() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					Datas.input = Integer.parseInt(getinput.getText());
					//�ж��û�����Ϸ���
					if(!Datas.judgeinput()) GameResult.error();
					//�û�����Ϸ�����ʼ�����û��Ƿ�ɹ�����
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
					//�ж��û�����Ϸ���
					if(!Datas.judgeinput()) GameResult.error();
					//�û�����Ϸ�����ʼ�����û��Ƿ�ɹ�����
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
