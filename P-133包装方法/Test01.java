public class Test01{
	public static void main(String[] args){
		//Integer i = new Integer(10);
		Integer i1 =10;//��������ã��Զ�װ���ֻ࣬����ֵ���ڳ����صķ�Χ��ʱ���൱����һ��
		
		//�ж����³���
		Integer i2=127;
		Integer i3=127;
		System.out.println(i2==i3);//������Integer i = new Integer(10);�൱�ڴ������������󣬵���������ڴ��ַ��һ����,֤��û�д�������
		//����Ϊsun��˾������һ�����ͳ����ش洢��ΧΪ��-128��127��������������ݡ���Ϊ��Щ���ݱȽϳ���
		
		//�ж����³���
		Integer i8=new Integer(127);
		Integer i9=new Integer(127);
		System.out.println(i8==i9);//Ϊʲô�����false
		
		Integer i4=-128;
		Integer i5=-128;
		System.out.println(i4==i5);//true
		
		Integer i6=128;
		Integer i7=128;
		System.out.println(i6==i7);//false
	}
}