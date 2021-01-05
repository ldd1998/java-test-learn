public class Test01{
	public static void main(String[] args){
		MyClass<String> m = new MyClass<String>();//只能向类中传递特定的类型的参数
		m.m1("1");
	}
}
class MyClass<T>{
	public void m1(T s){
		System.out.println(s);
	}
}