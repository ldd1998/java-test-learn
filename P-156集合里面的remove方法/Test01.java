import java.util.*;
public class Test01{
	public static void main(String[] args){
		Collection c = new ArrayList();
		Integer i1 = new Integer(10); 
		c.add(i1);
		Integer i2 = new Integer(10);//��Ϊremove����Ҳ��������д���equals���������ɾ��i2����ɾ��i1
		c.remove(i2);
		System.out.println(c.size());
		
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		//ɾ�����е�Ԫ��
		Iterator it = c.iterator();
		while(it.hasNext()){
			//it.next();
			//it.remove();//������ͨ��������ȥɾ�����е�Ԫ��
			//�������ͨ��Ԫ��ȥɾ�����е�Ԫ��ʱ���е�
			//c.remove(it.next());
			//Object o = it.next();
			//System.out.println(it.next());
			
		}
		System.out.println(c.size());
	}
}