import java.util.*;
public class Test01{
	public static void main(String[] args){
		Map m = new TreeMap();
		m.put("1","jack");
		m.put("2","luc");
		m.put("3","join");//�ڼ���Ԫ�ص�ʱ��key�����ظ�������ظ���Ḳ��value��ֵ��key�����򲻿��ظ��ģ�������Ҫ��дhashCode��equals����������
		
		System.out.println(m.containsKey("1"));
		System.out.println(m.containsValue("1"));
		System.out.println(m.size());
		Collection c = m.values();
		
		Iterator it = c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		m.remove("1");
		
		Collection c1 = m.keySet();//��keyת��Ϊset
		Iterator it1 = c1.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
		Set entrySet = m.entrySet();//��mapת��Ϊset�����������������
		Iterator it2 = entrySet.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		
	}
}