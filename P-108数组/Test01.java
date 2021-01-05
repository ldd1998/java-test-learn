public class Test01{
	public static void main(String[] args){
		String[] s={"1","2","3"};//初始化数组
		int[] i1={1,2,3};
		//动态初始化数组
		boolean[] b=new boolean[3];
		b[0]=true;
		Object[] o=new Object[1];
		o[0]=new Object();
		System.out.println(o);//不会出现空指针异常,原因是sun公司在println方法里判断为空输出null
		System.out.println(o.toString());//有可能出现空指针异常
		
		
		//深入一维数组
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
		System.out.println("狗在走");
	}
}
class Cat extends Animal{
	public void move(){
		System.out.println("猫在走");
	}
}