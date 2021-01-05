//在java程序中实现线程的第一种方法//缺点：不能再继承其他的类
//1、继承Thread类，重写run方法
public class Test01{
	public static void main(String[] args){
		ThreadTest t = new ThreadTest();
		t.start();//用star方法来启动线程，自动调用run方法，相当于创建了一个栈帧，并且等主方法main结束之后，新的线程也不会结束直到运行结束
		t.run()//如果直接调用run方法的话则会相当于正常的方法一样不会启动多线程，只有等run方法执行完成之后才会往下运行
		}
}
class ThreadTest extends Thread{
	public void run(){
		for(int i = 0;i <10;i++){
			System.out.println(i);
		}	
	}
}