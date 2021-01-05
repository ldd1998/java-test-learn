public class Test01{
	public static void main(String[] args){
		B b=new B();
	}
}
abstract class A{//abstruct关键字在最先面

	String name;
	public A(){System.out.println("构造方法被调用");};//抽象类是有构造方法的，构造方法是给子类的super使用的
	public abstract void m1();//抽象类中的方法不需要去实现也没有{}，但是子类必去去实现它，并且抽象方法只能在抽象类中存在
	//public void m2();//并且只能声明抽象方法
}
class B extends A{
	public void m1(){
		System.out.println("这是子类实现的抽象类的抽象方法");
	}
	
}