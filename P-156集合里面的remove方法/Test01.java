import java.util.*;
public class Test01{
	public static void main(String[] args){
		Collection c = new ArrayList();
		Integer i1 = new Integer(10); 
		c.add(i1);
		Integer i2 = new Integer(10);//因为remove里面也调用了重写后的equals方法，因此删除i2就是删除i1
		c.remove(i2);
		System.out.println(c.size());
		
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		//删除所有的元素
		Iterator it = c.iterator();
		while(it.hasNext()){
			//it.next();
			//it.remove();//这样是通过迭代器去删除所有的元素
			//但是如果通过元素去删除所有的元素时不行的
			//c.remove(it.next());
			//Object o = it.next();
			//System.out.println(it.next());
			
		}
		System.out.println(c.size());
	}
}