public class Test01{
	//��̬�ڲ������������ⲿ���˽�з���
	private static int a=1;
	private String name="liu";
	static class innerClass {
		static void m1(){
			System.out.println("�����ⲿ���˽�о�̬����a="+a);
		}
		public void m2(){
			System.out.println(a);//��������
			//System.out.println(name);//�޷�����ͨ��
		}
		//��̬�ڲ��಻�ܷ��ʳ�Ա����
		
		//��Ա�ڲ����ͬ�ڳ�Ա�������ɷ������������������
		
		//������
		
		//�ֲ��ڲ��࣬��ͬ�ھֲ�����
	}
	public void m3(){
		int a=1;
		//�ֲ��ڲ��಻���з������η�����Ϊ��ֻ���ھֲ����������
		//�ֲ��ڲ���ֻ�ܷ��ʾֲ�����ĳ���
		final int b=1;//����ʹ�þ�̬����stati���벻ͬ����֪��Ϊʲô
		class innerClass1{
			void m4(){
				System.out.println(b);
			}
			
		}
		//�ֲ��ڲ���ֻ���ھֲ�����������ɶ���ʹ��
		innerClass1  c= new innerClass1();
		c.m4();
	}
	
	//�����ڲ���ľ�̬����
	public static void s(CustomService q){
		q.logout();
	}
	public static void main (String[] args){
		Test01.innerClass.m1();
		Test01.innerClass m=new Test01.innerClass();
		m.m2();//Ҫ���ɶ�����ܷ��ʳ�Ա����
		Test01 t =new Test01();
		t.m3();
		
		//�������������ʹ�ýӿ������logout()�������������������Ҫ��дһ����̳нӿڽ�����ʵ�֣�Ȼ��newһ�������������
		//����ʹ�������ڲ���ķ���ȥʵ�ֹ���
		s(new CustomService(){
			public void logout(){
				System.out.println("�ɹ��˳�");//������������ڲ����ʹ�÷�����ȱ����ǲ��ܹ��ظ�ʹ�� ���е�����Щһ����
			}
		} );
		
	}
	//�����ڲ���
	
	//�ӿ�
	interface CustomService {
		public void logout();
	}
	
}



