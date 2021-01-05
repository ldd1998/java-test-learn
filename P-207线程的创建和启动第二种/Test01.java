public class Test01{
	public static void main(String[] args){
		Thread t = new Thread(new ThreadTest());//将类实例化传进去，一般推荐用这种方法
		t.start();
	}
}
class ThreadTest implements Runnable{//实现可运行的接口，Teread这个类其实也是实现的这个接口，因此可以直接创建类运行
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
	}
}