import java.util.*;
public class Test01{
	public static void main(String[] args){
		Collection c = new ArrayList();
		//������ݡ��Զ�װ��
		c.add(1);
		c.add("����");
		c.add(new Object());
		//������ϴ�С
		System.out.println(c.size());
		//����תΪObject��������
		Object[] o = c.toArray();
		//��ռ���
		c.clear();
		System.out.println(c.size());
	}
}