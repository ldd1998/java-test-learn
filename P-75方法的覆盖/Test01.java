//˽�з������ᱻ����
public class Test01{
	private void m1(){System.out.println("A�ķ���");}
	public static void main(String[] args){
		Test01 b=new B();
		b.m1();
	}
}
class B extends Test01{
	public void m1(){System.out.println("B�ĸ��Ƿ���");}
}