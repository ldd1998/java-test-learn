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
		System.out.println("����������");
		Star p=this;//��ȸö���
	}
}