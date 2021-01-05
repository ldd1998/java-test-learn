public class Test01{
	public static void main(String[] args){
		Sub s=new Sub();
		s.m2();
		s.m1();//方法的覆盖
		s.setAge(10);
		System.out.println(s.getAge());//间接访问私有变量
	}
}