/*
	1、接口是一种引用类型
	2、如何定义接口
		【修饰符】interface 接口名称{}
	3、接口中只能出现常量抽象方法
	4、接口中没有构造方法
	5、接口和接口之间可以实现多继承
	6、一个类可以实现多个接口
	7、一个非抽象类实现接口必须重写接口里面的方法
*/


public class Test01{
	public static void main(String[] args){
		B b=new B();
		b.m1();
	}
}

interface A{
	public static final double PI=3.14;
	int I=0;//public static final默认存在可以省略
	public abstract void m1();
}
class B implements A{
	public void m1(){
		System.out.println("m1方法调用");
	}
}