public class Test01{
	public static void main(String[] args){
		DebitAccount a= new DebitAccount(100,"ldd",1000);//运行子类的无参数构造方法会自动运行父类的无参数构造方法，原因是子类的构造方法会默认去调用父类的构造方法
		System.out.println(a);
	}
}
