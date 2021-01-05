public class Test01{
	public static void main(String[] args)throws Exception{
		Thread t1 = new Thread(new ThreadTest());
		t1.setName("t1");
		t1.start();
		Thread.sleep(1000);//��֤m1������ִ��
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
	public synchronized void m2(){//������������һ�������ڣ��������synchronized��ȥ���������Ķ�����������ҵ���ִ�У��Ҳ����͵ȵ��ҵ������ۣ�������������һ�������ڵ�
		System.out.println("m2...");
	}
}