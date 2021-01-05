import java.util.*;	
public class Test01{
	public static void main(String[] args){
		SortedSet s = new TreeSet();
		
		Student stu1= new Student("zang1",1);
		Student stu2= new Student("sang1",1);
		Student stu3= new Student("yang1",2);
		Student stu4= new Student("kang1",4);
		
		s.add(stu1);
		s.add(stu2);
		s.add(stu3);
		s.add(stu4);
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//如果直接这样编译会报错，说没有实现Compalable接口
		
	}
}
class Student implements Comparable{//实现接口就要实现接口里面的方法
	String name;
	int age;
	public Student(){}
	public Student (String name,int age){
		this.name=name;
		this.age = age;
	}
	public String toString(){
		return name+":"+age;
	}
	public int compareTo(Object o){
		return this.age-((Student)o).age;
	}
	//如果是按照字符串进行排序的话，直接调用字符串的compareTo方法
	//同时compareTo方法决定了不能有重复的元素，否则会添加不进去
}
