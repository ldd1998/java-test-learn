import java.util.*;
public class Test01{
	public static void main(String[] args){
		Set s = new HashSet();
		Student s1 = new Student(100,"zhang1");
		Student s2 = new Student(100,"zhang1");
		Student s3 = new Student(200,"zhang3");
		Student s4 = new Student(201,"zhang4");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		
		//在真是业务逻辑中，为了保证hashmap的效率更高因此需要重写hashcode和equals方法来保证map均匀分布
		//其中equals是相当于数组的下标，equals用来判断当前hasmap中是否有相同的元素
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
class Student{
	int no;
	String name;
	public Student(){}
	public Student(int no,String name){
		this.no=no;
		this.name=name;
	}
	public boolean equals(Object o){
		if(this==o){
			return true;
		}
		if(o instanceof Student){
			Student s=(Student)o;
			if(this.no==s.no && this.name.equals(s.name))
				return true;
		}
		return false;
	}
	public int hashCode(){
		return (no/100+"").hashCode();//用来均分hashmap
	}
}