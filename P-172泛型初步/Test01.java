import java.util.*;
public class Test01{
	public static void main(String[] args){
		List<String> l = new ArrayList<String>();//·ºÐÍ
		
		l.add("1");
		l.add("1");
		l.add("1");
		l.add("1");
		
		Iterator it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}