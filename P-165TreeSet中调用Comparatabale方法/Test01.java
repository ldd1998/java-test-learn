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
		//���ֱ����������ᱨ��˵û��ʵ��Compalable�ӿ�
		
	}
}
class Student implements Comparable{//ʵ�ֽӿھ�Ҫʵ�ֽӿ�����ķ���
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
	//����ǰ����ַ�����������Ļ���ֱ�ӵ����ַ�����compareTo����
	//ͬʱcompareTo���������˲������ظ���Ԫ�أ��������Ӳ���ȥ
}
