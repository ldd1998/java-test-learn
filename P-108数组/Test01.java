public class Test01{
	public static void main(String[] args){
		String[] s={"1","2","3"};//��ʼ������
		int[] i1={1,2,3};
		//��̬��ʼ������
		boolean[] b=new boolean[3];
		b[0]=true;
		Object[] o=new Object[1];
		o[0]=new Object();
		System.out.println(o);//������ֿ�ָ���쳣,ԭ����sun��˾��println�������ж�Ϊ�����null
		System.out.println(o.toString());//�п��ܳ��ֿ�ָ���쳣
		
		
		//����һά����
		Dog d=new Dog();
		Cat c=new Cat();
		Animal[] a={d,c};
		
		for(int i=0;i<a.length;i++){
			if(a[i] instanceof Dog){
				Dog d1=(Dog)a[i]; 
				d1.move();
			}
			else if(a[i] instanceof Cat){
				Cat c1 = (Cat)a[i];
				c1.move();
			}
		}
	}
}

class Animal{
	
}
class Dog extends Animal{
	public void move(){
		System.out.println("������");
	}
}
class Cat extends Animal{
	public void move(){
		System.out.println("è����");
	}
}