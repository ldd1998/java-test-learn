public class Test01{
	public static void main(String[] args)throws Exception{
		ThreadTest tt = new ThreadTest();
		Thread t = new Thread(tt);
		t.start();
		t.join();//�̺߳ϲ�t�̼߳������߳���
		t.yield();//��ͬ�����߳��ó�cpu��Ƭ�������ó���ʱ�䲻�̶�
		Thread.sleep(3000);		
		tt.run = false;//����ֱ�ӽ�����������һ���߳�
	}
}
class ThreadTest implements Runnable{
	boolean run = true;
	public void run(){
		
		for(int i = 0;i < 9&&run==true;i++){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}
}