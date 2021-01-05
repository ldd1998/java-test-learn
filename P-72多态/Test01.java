/*
向上转型：子转父
向下转型：父转子

*/


public class Test01{
	public static void main(String[] args){
		Animal a=new Animal();
		Cat c=new Cat();
		Dog d= new Dog();
		a.eat();
		c.eat();
		d.eat();
		
		Animal a1=new Cat();//向上转型，两个阶段，1.程序在编译期将a1认为是Animal类型，在运行期a1r仍然是Cat类型
		a1.eat();
		
		//但是此时我想调用a1中的move方法编译器认为a1没有move方法不给通过怎么办？
		//这是要进行强制类型转换
		//Cat c1=(Cat)a1;
		//c1.move();
		
		//以下程序能编译通过但是不能运行,因此强制转换会存在风险，但是sun公司引入了instanceof
		//Animal a3=new Dog();
		//Cat c3=(Cat)a3;
		if(a1 instanceof Cat){
			Cat c1=(Cat)a1;
			System.out.println("能进行转换");
		}
		else{
			System.out.println("不能转型");
		}
		
		
		
		
	}
}