import java.util.*;
public class Test01{
	public static void main(String[] args){
		Collection c = new ArrayList();//多态
		c.add(1);//这里存在自动装箱
		c.add("2");
		c.add("3");
		
		Iterator it = c.iterator();//这里是多态，因为c有可能是HashSet  ArrayList LinedList
		
		while(it.hasNext()){//hasNext()方法是判断是否有多余的元素；
			Object o = it.next();//next方法是指针往下移动一位并且返回元素，指针默认指向第一个元素上面一个位置
			System.out.println(o);
		}
		
		for(Iterator it1 = c.iterator();it1.hasNext();){
			Object o = it1.next();
			System.out.println(o);
		}
	}
}