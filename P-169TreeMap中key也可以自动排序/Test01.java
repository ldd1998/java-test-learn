//�����ҪTreeMap�е�key�Զ���������Ҫʵ��Comparatable�����compareTo�������ߴ�һ���Ƚ���Comparator������compaare(Object o,Object o)��ȥ

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
class ComparatorStudent implements Comparator{ //��������
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
			return ((Student)o1).age-((Student)o2).age;}	//�����ڲ���ķ���	
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
































