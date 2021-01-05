public class Test01{
	public static void main(String[] args)throws Exception{
		Thread t = new Thread(new ThreadTest());
		t.start();
		for(int i = 0;i<9;i++){
			System.out.println(i);
			Thread.sleep(250);//阻塞当前主线程。如果是t.sleep()也相当于阻塞当前主线程，因为sleep是静态方法相当于Thread.sleep
		}
	}
}
class ThreadTest implements Runnable{
	public void run(){//重写方法不能抛出被重写方法更广泛的异常，因此只能trycatch 
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