package coursetask;

public class Datas {
	public static int max=0;
	public static int min=0;
	public static int maxcount=0;
	public static int input=0;
	public static int target=0;
	public static int count = 1;
	public static long stime = 0;
	public static long otime = 0; //这两行未完成，用于给用户计时，也可考虑用一个界面实现动态计时
	
	//每次获取完毕用户输入后调用这个函数来判断是否符合要求
	//如果这个函数返回false，那么就展示error界面
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
