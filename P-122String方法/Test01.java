public class Test01{
	public static void main(String[] args){
		String s1="aaa";
		String s2="aaa";
		System.out.println(s1==s2);//���Ϊtrue��֤�����ַ��������ش���
		
		String s3=new String("111");
		String s4=new String("111");
		System.out.println(s3==s4);//���Ϊfalse��֤����������������
		System.out.println(s3.equals(s4));//���Ϊtrue֤������д��equals���������ԱȽ������ַ����Ƿ����
	}
}