import java.util.*;
public class Test01{
	public static void main(String[] args){
		Collection c = new ArrayList();//��̬
		c.add(1);//��������Զ�װ��
		c.add("2");
		c.add("3");
		
		Iterator it = c.iterator();//�����Ƕ�̬����Ϊc�п�����HashSet  ArrayList LinedList
		
		while(it.hasNext()){//hasNext()�������ж��Ƿ��ж����Ԫ�أ�
			Object o = it.next();//next������ָ�������ƶ�һλ���ҷ���Ԫ�أ�ָ��Ĭ��ָ���һ��Ԫ������һ��λ��
			System.out.println(o);
		}
		
		for(Iterator it1 = c.iterator();it1.hasNext();){
			Object o = it1.next();
			System.out.println(o);
		}
	}
}