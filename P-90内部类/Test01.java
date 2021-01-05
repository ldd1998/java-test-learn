public class Test01{
	//静态内部类用来访问外部类的私有方法
	private static int a=1;
	private String name="liu";
	static class innerClass {
		static void m1(){
			System.out.println("这是外部类的私有静态方法a="+a);
		}
		public void m2(){
			System.out.println(a);//可以运行
			//System.out.println(name);//无法编译通过
		}
		//静态内部类不能访问成员方法
		
		//成员内部类等同于成员变量。可访问类里面的所有数据
		
		//例子略
		
		//局部内部类，等同于局部变量
	}
	public void m3(){
		int a=1;
		//局部内部类不能有访问修饰符，因为它只属于局部括号里面的
		//局部内部类只能访问局部里面的常量
		final int b=1;//不能使用静态方法stati编译不同过不知道为什么
		class innerClass1{
			void m4(){
				System.out.println(b);
			}
			
		}
		//局部内部类只能在局部里面进行生成对象使用
		innerClass1  c= new innerClass1();
		c.m4();
	}
	
	//匿名内部类的静态方法
	public static void s(CustomService q){
		q.logout();
	}
	public static void main (String[] args){
		Test01.innerClass.m1();
		Test01.innerClass m=new Test01.innerClass();
		m.m2();//要生成对象才能访问成员方法
		Test01 t =new Test01();
		t.m3();
		
		//在这里如果我项使用接口里面的logout()函数在正常情况下是需要再写一个类继承接口将函数实现，然后new一个对象出来调用
		//现在使用匿名内部类的方法去实现功能
		s(new CustomService(){
			public void logout(){
				System.out.println("成功退出");//这里就是匿名内部类的使用方法。缺点就是不能够重复使用 ，有点事少些一个类
			}
		} );
		
	}
	//匿名内部类
	
	//接口
	interface CustomService {
		public void logout();
	}
	
}



