import java.util.*;
public class Test01{
	public static void main(String[] args){
		Collection c = new ArrayList();
		//添加数据。自动装箱
		c.add(1);
		c.add("集合");
		c.add(new Object());
		//输出集合大小
		System.out.println(c.size());
		//集合转为Object类型数组
		Object[] o = c.toArray();
		//清空集合
		c.clear();
		System.out.println(c.size());
	}
}