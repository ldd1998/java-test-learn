public class Test01{
	public static void main(){
		//Star a = new Star();
		//a=null;
		System.Gc();
	}
}
class Star{
	String name;
	public void finalize() throws Throwable {
		System.out.println("垃圾被回收");
		Star p=this;//挽救该对象
	}
}