public class Test01{
	static {
		System.out.println("这是一句静态语句块，类加载时就执行，并且只执行一次,按照从上往下的顺序执行");
	}
	{
		System.out.println("这是一句实例语句块，在调用构造方法的之前执行,比如记录日志,调用几次构造方法执行几次");
	}
	public static void m1(){
		System.out.println("这是一句静态方法，调用的时候可以不产生对象，直接类.方法");
	}
	static String str="这是一个静态变量，存在于方法区中，且所有的对象公用一个静态变量，减少内存使用";
	
	
	static void m2(){
		System.out.println(i);
	}
	static int i=100;//这个可以的
	/*
		static {
		System.out.println(i);
	}
	static int i=100;
	*///这个不可以
	public static void main(String[] args){
		Test01 t=new Test01();
		Test01 t2=new Test01();
		Test01.m1();
		t.m1();//注意：这里编译通过，但是在执行的时候仍然是类名.方法执行的静态方法
		//比如
		t=null;
		t.m1();//此处仍然可以执行，不会报空值异常
		m2();
	}
}
