package coursetask;
import javax.swing.JOptionPane;
public class GameResult {
	public static void again(boolean flag){
		if(flag) {
			JOptionPane.showMessageDialog(null,"���ź������ֹ���������");
		}
		else {
			JOptionPane.showMessageDialog(null, "���ź������ֹ�С��������");
		}
	}
	public static void error(){
		JOptionPane.showMessageDialog(null,"�����㲻���������룡");
	}
	public static void fail(){
		JOptionPane.showMessageDialog(null,"���ź�������ʧ�ܣ�");
	}
	public static void success(){
		long time = Datas.otime - Datas.stime;
		time = time/1000;
		JOptionPane.showMessageDialog(null,"��ϲ��´ʳɹ�������ʱ��Ϊ"+time+"�룡");
	}

}
