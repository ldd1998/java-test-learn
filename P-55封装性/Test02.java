public class Test02{
	public static void main(String[] args){
		//编译主程序会自动编译与之相关的类
		Custom c =new Custom();
		
		c.setAge(1000);
		System.out.println(c.getAge());
	}
}