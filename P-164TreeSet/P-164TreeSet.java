import java.util.*;
public class Test01{
	public static void main(String[] args){
		sortedSet s = new TreeSet();
		s.add(1);
		s.add(5);
		s.add(4);
		s.add(3);
		s.add(2);
		//s.add("1");//ֻ�ܴ���ͬ������
		//sorted���ϻ����Զ��ַ������������ͽ����Զ�������Ϊ���Ƕ�ʵ����һ��comparatable�ӿ�
		Iterator it =s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}