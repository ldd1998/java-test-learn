import java.util.*;
public class Test01{
	public static void main(String[] args){
		sortedSet s = new TreeSet();
		s.add(1);
		s.add(5);
		s.add(4);
		s.add(3);
		s.add(2);
		//s.add("1");//只能存相同的类型
		//sorted集合还可以对字符串和日期类型进行自动排序，因为他们都实现了一个comparatable接口
		Iterator it =s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}