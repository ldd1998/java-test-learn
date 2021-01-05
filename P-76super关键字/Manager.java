public class Manager extends Employee{
	
	String name ="李四";
	public void work(){
		System.out.println("经理在工作");
		super.work();
		System.out.println(super.name);
	}
	
}//super可以用在成员方法中
//不可以用在静态方法中，因为静态方法没有产生对象