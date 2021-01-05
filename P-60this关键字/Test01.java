public class Test01{
	public static void main(String[] args){
		Custom c=new Custom(10,"小明");
		System.out.println(c.name);
		}
}
//this关键子代表当前对象的内存地址，不写默认也会有，可以用于成员方法和成员变量中
//但是不能用于静态方法中，因为静态方法不产生对象
class Custom{
	int age;
	String name;
	
	Custom(int age, String name){
		this.age=age;
		this.name=name;
	}
}
class MyData{
	int year;
	int month;
	int day;
	
	MyData(){
		/*
		year=2020;
		month=1;
		day=1;
		*/
		//相当于
		this(2020,1,1);//防止代码重复，必须出现在构造方法的第一句
	}
	MyData(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
}