import java.util.*;
import java.text.*;
public class Test01{
	public static void main(String[] args){
		Date d = new Date();
		System.out.println(d);		
		SimpleDateFormat f = new SimpleDateFormat("y-M-d H:m:s S");
		/*
		��һ�д���ȷ����ת���ĸ�ʽ������ yyyy �������Ĺ�Ԫ�꣬MM ���·ݣ�dd �����ڣ�HH:mm:ss ��ʱ���֡��롣
		ע��:�еĸ�ʽ��д���еĸ�ʽСд������ MM ���·ݣ�mm �Ƿ֣�HH �� 24 Сʱ�ƣ��� hh �� 12 Сʱ�ơ�
		*/
		System.out.println(f.format(d));
	}
}