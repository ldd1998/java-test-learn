public class Test01{
	public static void main(String[] args){
		final Custom c=new Custom("李四",15);
		//c = new Custom("王五",16);//不能对c进行重新赋值，因为final关键字修饰
		c.name="王五";
		System.out.println(c.name);//但是可以修改改对象指向的值，是因为c存储的是对象的地址。因此不能对地址进行修改，而该地址指向的对象的属性可以修改
	}
}
class Custom{
	String name;
	int age;
	public Custom(String name,int age){
		this.name=name;
		this.age=age;
	}
}