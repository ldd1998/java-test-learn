public class Test01{
	public static void main(String[] args)throws Exception{
		Thread t = new Thread(new ThreadTest());
		t.start();
		for(int i = 0;i<9;i++){
			System.out.println(i);
			Thread.sleep(250);//������ǰ���̡߳������t.sleep()Ҳ�൱��������ǰ���̣߳���Ϊsleep�Ǿ�̬�����൱��Thread.sleep
		}
	}
}
class ThreadTest implements Runnable{
	public void run(){//��д���������׳�����д�������㷺���쳣�����ֻ��trycatch 
		for (int i = 0;i<10;i++){
			System.out.println(i);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}
}