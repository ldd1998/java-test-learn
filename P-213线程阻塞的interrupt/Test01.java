public class Test01{
	public static void main(String[] args){
		Thread t = new Thread(new ThreadTest());
		t.start();
		t.interrupt();//�������
	}
}
class ThreadTest implements Runnable{
	public void run(){
		try{
			Thread.sleep(100000);//һֱ����
			System.out.println("���ﲻ�����У���Ϊ��������൱���쳣����");
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("�����ִ��");
	}
}