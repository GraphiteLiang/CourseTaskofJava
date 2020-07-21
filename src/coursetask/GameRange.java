package coursetask;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameRange extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameRange() {
		setSize(400,300);
		setTitle("��������Ϸ");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Container ct = getContentPane();
		JLabel message = new JLabel("��������������Ҫ�ļ��㷶Χ");
		JLabel max = new JLabel("max");
		JLabel min = new JLabel("min");
		JTextField getmax = new JTextField("");
		JTextField getmin = new JTextField("");
		JButton confirm = new JButton("ȷ��");
		//���ÿؼ���λ��
		message.setBounds(30,5,500,100);
		getmax.setBounds(60,100,250,40);
		getmin.setBounds(60,160,250,40);
		confirm.setBounds(110, 210,150,50);
		max.setBounds(30,100,50,50);
		min.setBounds(30,160,50,50);
		//���ؼ����뵽������
		ct.add(message);
		ct.add(getmax);
		ct.add(confirm);
		ct.add(getmin);
		ct.add(max);
		ct.add(min);
		//
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datas.max = Integer.parseInt(getmax.getText());
				Datas.min = Integer.parseInt(getmin.getText());
				if(!Datas.judge()) {
					GameResult.error();
					Datas.max = 0;
					Datas.min = 0;
				}
				else {
					Datas.target = Datas.getTarget();
					dispose();
					new GameCount();
				}
			}
		});
		//
		setVisible(true);
	}
	
}
