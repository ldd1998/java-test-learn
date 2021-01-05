public class Test01{
	public static void main(String[] args)throws Exception{
		ThreadTest tt = new ThreadTest();
		Thread t = new Thread(tt);
		t.start();
		t.join();//线程合并t线程加入主线程中
		t.yield();//给同级别线程让出cpu碎片，但是让出的时间不固定
		Thread.sleep(3000);		
		tt.run = false;//可以直接将参数传入另一个线程
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