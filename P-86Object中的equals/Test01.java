public class Test01{
	public static void main(String[] args){
		Star a =new Star("张三",100);
		Star b =new Star("张三",100);
		System.out.println(a.equals(b));//重写equls方法需要根据实际情况，并且String的equals方法已经被重写过了，并且==比较的时内存地址
	}
}
class Star{
	String name;
	int nomber;
	public Star(String name,int nomber){
		this.name=name;
		this.nomber=nomber;
	}
	public boolean equals(Object o){
		if (this == o)return true;//如果地址一样则一定是同一个对象
			if(o instanceof Star){
				Star s =(Star) o;
				if(this.name.equals(s.name) && this.nomber==s.nomber);
					return true;
			}
		return false;
	}
}