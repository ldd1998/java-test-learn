//如果想要TreeMap中的key自动排序则需要实现Comparatable里面的compareTo方法或者传一个比较器Comparator里面有compaare(Object o,Object o)进去

/*
import java.util.*;
public class Test01{
	public static void main(String[] args){
		Map m = new TreeMap();
		Student s1 = new Student("xiaoming1",2);
		Student s2 = new Student("xiaoming2",1);
		Student s3 = new Student("xiaoming3",3);
		m.put(s1,"02");
		m.put(s2,"01");
		m.put(s3,"03");
		
		
		Collection c = m.values();
		Iterator it = c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
class Student implements Comparable{
	String name;
	int age;
	public Student(){}
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Object o){
		return this.age-((Student)o).age;
	}
	public String toString(){
		return name+":"+age;
	}
}
*/

/*
import java.util.*;
public class Test01{
	public static void main(String[] args){
		Map m = new TreeMap(new ComparatorStudent());
	}
}
class Student{
	String name;
	int age;
	public Student(){}
	public Student(String name,int age){
		this.age = age;
		this.name = name;
	}
}
class ComparatorStudent implements Comparator{ //正常方法
	public int compare(Object o1 , Object o2){
		return ((Student)o1).age-((Student)o2).age;		
	}
}
*/

import java.util.*;
public class Test01{
	public static void main(String[] args){
		Map m = new TreeMap(new Comparator{ 
			public int compare(Object o1 , Object o2){
			return ((Student)o1).age-((Student)o2).age;}	//匿名内部类的方法	
		});
	}
}
class Student{
	String name;
	int age;
	public Student(){}
	public Student(String name,int age){
		this.age = age;
		this.name = name;
	}
}
































