/*
	1���ӿ���һ����������
	2����ζ���ӿ�
		�����η���interface �ӿ�����{}
	3���ӿ���ֻ�ܳ��ֳ������󷽷�
	4���ӿ���û�й��췽��
	5���ӿںͽӿ�֮�����ʵ�ֶ�̳�
	6��һ�������ʵ�ֶ���ӿ�
	7��һ���ǳ�����ʵ�ֽӿڱ�����д�ӿ�����ķ���
*/


public class Test01{
	public static void main(String[] args){
		B b=new B();
		b.m1();
	}
}

interface A{
	public static final double PI=3.14;
	int I=0;//public static finalĬ�ϴ��ڿ���ʡ��
	public abstract void m1();
}
class B implements A{
	public void m1(){
		System.out.println("m1��������");
	}
}