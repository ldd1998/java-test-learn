//私有方法不会被覆盖
public class Test01{
	private void m1(){System.out.println("A的方法");}
	public static void main(String[] args){
		Test01 b=new B();
		b.m1();
	}
}
class B extends Test01{
	public void m1(){System.out.println("B的覆盖方法");}
}