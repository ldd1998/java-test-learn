/*
线程的同步是为了保证数据安全
什么情况下要使用线程的同步
1、多线程环境
2、共享一个数据
3、涉及到数据的修改

*/

public class Test01{
	public static void main(String[] args)throws Exception{
		Balance b = new Balance();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
	}
}
class Balance implements Runnable{
	double price = 4000;
	String name = "xiaoliu";
	
	public void run(){
		synchronized(this){//被synchronized包裹的语句只能同时出现一个，进而保证数据安全
			System.out.println("取出1000");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}		
			price -= 1000;
		}
	}
	public synchronized void m(){//如果synchronized修饰的是成员方法，则拿到的也是this的锁，但是会浪费更多的时间，因此些语句需要线程同步就加到哪句上
		
	}
}