package coursetask;
import javax.swing.JOptionPane;
public class GameResult {
	public static void again(boolean flag){
		if(flag) {
			JOptionPane.showMessageDialog(null,"很遗憾，数字过大，请重试");
		}
		else {
			JOptionPane.showMessageDialog(null, "很遗憾，数字过小，请重试");
		}
	}
	public static void error(){
		JOptionPane.showMessageDialog(null,"错误！你不能这样输入！");
	}
	public static void fail(){
		JOptionPane.showMessageDialog(null,"很遗憾，猜数失败！");
	}
	public static void success(){
		long time = Datas.otime - Datas.stime;
		time = time/1000;
		JOptionPane.showMessageDialog(null,"恭喜你猜词成功！所用时长为"+time+"秒！");
	}

}
