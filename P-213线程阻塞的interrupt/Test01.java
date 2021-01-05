public class Test01{
	public static void main(String[] args){
		Thread t = new Thread(new ThreadTest());
		t.start();
		t.interrupt();//打断休眠
	}
}
class ThreadTest implements Runnable{
	public void run(){
		try{
			Thread.sleep(100000);//一直休眠
			System.out.println("这里不会运行，因为打断休眠相当于异常机制");
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("这里会执行");
	}
}