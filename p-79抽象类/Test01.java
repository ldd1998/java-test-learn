public class Test01{
	public static void main(String[] args){
		B b=new B();
	}
}
abstract class A{//abstruct�ؼ�����������

	String name;
	public A(){System.out.println("���췽��������");};//���������й��췽���ģ����췽���Ǹ������superʹ�õ�
	public abstract void m1();//�������еķ�������Ҫȥʵ��Ҳû��{}�����������ȥȥʵ���������ҳ��󷽷�ֻ���ڳ������д���
	//public void m2();//����ֻ���������󷽷�
}
class B extends A{
	public void m1(){
		System.out.println("��������ʵ�ֵĳ�����ĳ��󷽷�");
	}
	
}