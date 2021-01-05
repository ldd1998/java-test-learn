public class Test01{
	//编码设置为ansi
	public static void main(String[] args){
		//创建对象
		Student s=new Student();
		System.out.println("name="+s.name);
		s.name = "小明";
		System.out.println("name="+s.name);
	}
}