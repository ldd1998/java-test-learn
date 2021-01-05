
//静态方法不能被重写覆盖，因为静态方法可以不产生对象就能使用。就算用对象去调用静态方法也会相当于用类名.方法去调用
public class Test02{
	public static void main(String[] args){
		A a=new B();
		a.m1();
		A.m1();
		B.m1();
	}
}
class A{
	public static void m1(){
		System.out.println("A的方法");
	}
}
class B extends A{
	public static void m1(){
		System.out.println("b的方法");
	}	
}