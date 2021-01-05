public class Test01{
	public static void main(String[] args){
		Thread t1 = new Thread(new ThreadTest());
		Thread t2 = new Thread(new ThreadTest());
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.setPriority(1);//最小
		t2.setPriority(9);//最大
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
	}
}
class ThreadTest implements Runnable{
	public void run(){}
}