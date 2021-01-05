public class User{
	int age;
	User(){
		System.out.println("无参数构造方法执行");
	}
	User(int _age){
		System.out.println("有参构造方法执行");
		age=_age;
	}
	public void print(){
		System.out.println("函数调用成功");
	}
}