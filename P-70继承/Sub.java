public class Sub extends Super{
	//子类继承父类所有方法和变量，包括私有变量，但是私有变量不能直接访问，可以间接访问
	//注意：不能继承构造方法
	public void m1(){
		System.out.print("子类覆盖父类m1方法");
	}
	public void m2(){
		m1();
	}
}