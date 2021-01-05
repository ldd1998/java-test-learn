import java.util.*;
public class Test01{
	public static void main(String[] args){
		Map m = new TreeMap();
		m.put("1","jack");
		m.put("2","luc");
		m.put("3","join");//在加入元素的时候key不能重复，如果重复则会覆盖value的值，key是无序不可重复的，并且需要重写hashCode和equals方法！！！
		
		System.out.println(m.containsKey("1"));
		System.out.println(m.containsValue("1"));
		System.out.println(m.size());
		Collection c = m.values();
		
		Iterator it = c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		m.remove("1");
		
		Collection c1 = m.keySet();//讲key转化为set
		Iterator it1 = c1.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
		Set entrySet = m.entrySet();//将map转化为set集合这个方法不常用
		Iterator it2 = entrySet.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		
	}
}