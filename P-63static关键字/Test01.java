public class Test01{
	static {
		System.out.println("����һ�侲̬���飬�����ʱ��ִ�У�����ִֻ��һ��,���մ������µ�˳��ִ��");
	}
	{
		System.out.println("����һ��ʵ�����飬�ڵ��ù��췽����֮ǰִ��,�����¼��־,���ü��ι��췽��ִ�м���");
	}
	public static void m1(){
		System.out.println("����һ�侲̬���������õ�ʱ����Բ���������ֱ����.����");
	}
	static String str="����һ����̬�����������ڷ������У������еĶ�����һ����̬�����������ڴ�ʹ��";
	
	
	static void m2(){
		System.out.println(i);
	}
	static int i=100;//������Ե�
	/*
		static {
		System.out.println(i);
	}
	static int i=100;
	*///���������
	public static void main(String[] args){
		Test01 t=new Test01();
		Test01 t2=new Test01();
		Test01.m1();
		t.m1();//ע�⣺�������ͨ����������ִ�е�ʱ����Ȼ������.����ִ�еľ�̬����
		//����
		t=null;
		t.m1();//�˴���Ȼ����ִ�У����ᱨ��ֵ�쳣
		m2();
	}
}
