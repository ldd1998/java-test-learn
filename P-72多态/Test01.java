/*
����ת�ͣ���ת��
����ת�ͣ���ת��

*/


public class Test01{
	public static void main(String[] args){
		Animal a=new Animal();
		Cat c=new Cat();
		Dog d= new Dog();
		a.eat();
		c.eat();
		d.eat();
		
		Animal a1=new Cat();//����ת�ͣ������׶Σ�1.�����ڱ����ڽ�a1��Ϊ��Animal���ͣ���������a1r��Ȼ��Cat����
		a1.eat();
		
		//���Ǵ�ʱ�������a1�е�move������������Ϊa1û��move��������ͨ����ô�죿
		//����Ҫ����ǿ������ת��
		//Cat c1=(Cat)a1;
		//c1.move();
		
		//���³����ܱ���ͨ�����ǲ�������,���ǿ��ת������ڷ��գ�����sun��˾������instanceof
		//Animal a3=new Dog();
		//Cat c3=(Cat)a3;
		if(a1 instanceof Cat){
			Cat c1=(Cat)a1;
			System.out.println("�ܽ���ת��");
		}
		else{
			System.out.println("����ת��");
		}
		
		
		
		
	}
}