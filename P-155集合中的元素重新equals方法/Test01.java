import java.util.*;
public class Test01{
	public static void main(String[] args){
		Collection c = new ArrayList();
		Integer i = new Integer(10);
		c.add(i);
		Integer i1 = new Integer(10);
		System.out.println(c.contains(i1));//����Ϊʲô����true������������new�����ģ������ǵĵ�ַ��һ��
		//����Ϊ��contains�ײ��ǵ��õ�equals��������Integer����д��equals����ȥ�Ƚ�ֵ
		System.out.println(i==i1);//��������֤��i��i1���ڴ��ַ��һ��false
		System.out.println(i.equals(i1));//����Ľ���Ǻ͵�һ��һ��������ΪIteger����д��equals������
		
	}
}