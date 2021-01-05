import java.util.*;
public class Test01{
	public static void main(String[] args){
		Collection c = new ArrayList();
		Integer i = new Integer(10);
		c.add(i);
		Integer i1 = new Integer(10);
		System.out.println(c.contains(i1));//这里为什么返回true，两个对象是new出来的，则他们的地址不一样
		//是因为，contains底层是调用的equals方法，而Integer类重写了equals方法去比较值
		System.out.println(i==i1);//这里足以证明i和i1的内存地址不一样false
		System.out.println(i.equals(i1));//这里的结果是和第一个一样，是因为Iteger类重写了equals方法让
		
	}
}