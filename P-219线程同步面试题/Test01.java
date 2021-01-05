public class Test01{
	public static void main(String[] args)throws Exception{
		Thread t1 = new Thread(new ThreadTest());
		t1.setName("t1");
		t1.start();
		Thread.sleep(1000);//保证m1方法先执行
		Thread t2 = new Thread(new ThreadTest());
		t2.setName("t2");
		t2.start();
	}
}
class ThreadTest implements Runnable{
	public void run(){
		if(Thread.currentThread().getName().equals("t1")){
			m1();
		}
		if(Thread.currentThread().getName().equals("t2")){
			m2();
		}
	}
	public synchronized void m1(){
		Thread.sleep(1000);
		System.out.println("m1...");
	};
	public synchronized void m2(){//这两个方法在一个对象内，因此遇到synchronized就去找这个对象的对象锁，如果找到就执行，找不到就等到找到，结论：对象锁锁的是一个对象内的
		System.out.println("m2...");
	}
}