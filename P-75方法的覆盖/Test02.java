
//��̬�������ܱ���д���ǣ���Ϊ��̬�������Բ������������ʹ�á������ö���ȥ���þ�̬����Ҳ���൱��������.����ȥ����
public class Test02{
	public static void main(String[] args){
		A a=new B();
		a.m1();
		A.m1();
		B.m1();
	}
}
class A{
	public static void m1(){
		System.out.println("A�ķ���");
	}
}
class B extends A{
	public static void m1(){
		System.out.println("b�ķ���");
	}	
}