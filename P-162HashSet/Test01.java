import java.util.*;
public class Test01{
	public static void main(String[] args){
		Set s =new HashSet();
		s.add(1);
		s.add(1);
		s.add(3);
		s.add(4);
		s.add(8);
		
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());//为什么输出会自动排序
		}
	}
}