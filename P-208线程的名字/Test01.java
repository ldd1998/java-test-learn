public class Test01{
	public static void main(String[] args){
		Thread t = Thread.currentThread();//currentThread中是返回当前对象的线程对象
		System.out.println(t.getName());//mian
		
		Thread t1 = new Thread(new ThreadTest());
		System.out.println(t1.getName());//thread-0
		
		Thread t2 = new Thread(new ThreadTest());
		System.out.println(t2.getName());//Thread-1;
		
		Thread t3 = new Thread(new ThreadTest());
		t3.setName("t3");
		System.out.println(t3.getName());
		
	}
}
class ThreadTest implements Runnable{
	public void run(){
		
	}
}