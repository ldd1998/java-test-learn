import java.util.*;
public class Test01{
	public static void main(String[] args){
		SortedSet s = new TreeSet(new StudentComparable());
		Student s1= new Student("zhang1",1);
		Student s2= new Student("shang1",2);
		Student s3= new Student("chang1",4);
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
class Student{
	String name;
	int age;
	public Student(){}
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return name+":"+age;
	}
}
class StudentComparable implements Comparator{
	public int compare(Object o1,Object o2){
		return ((Student)o1).age-((Student)o2).age;
	}
}
//此方法是传递一个比较器进去，优点是低耦合，可以重复使用