package coursetask;

public class Datas {
	public static int max=0;
	public static int min=0;
	public static int maxcount=0;
	public static int input=0;
	public static int target=0;
	public static int count = 1;
	public static long stime = 0;
	public static long otime = 0; //������δ��ɣ����ڸ��û���ʱ��Ҳ�ɿ�����һ������ʵ�ֶ�̬��ʱ
	
	//ÿ�λ�ȡ����û�������������������ж��Ƿ����Ҫ��
	//��������������false����ô��չʾerror����
	public Datas() {
		max = 0;
		min = 0;
		maxcount = 0;
		
		input = 0;
		target = 0;
		count = 1;
		
	}
	public static boolean judge(){
		if( min>=max || maxcount>=max-min+1 || 
				maxcount<0 || max-min+1<=2 ) return false;
		else return true;
	}
	public static boolean judgeinput() {
		if(input<min||input>max) return false;
		else return true;
	}
	public static int getTarget() {
		double temp = (Datas.max-Datas.min)*Math.random()+Datas.min;
		int result = (int)temp;
		
		if(temp - result >= 0.5) result = (int)(temp+1);
		
		return result;
	}
}
