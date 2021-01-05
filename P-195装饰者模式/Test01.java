//1、装饰者模式要求装饰者含有被装饰者的引用
//2、装饰者模式中还要求，装饰者和被装饰这应该实现同一个类型（抽象方法或者接口）
public class Test01{
	public static void main(String[] args){
		BufferedReader b = new BufferedReader(new FileReader());
		b.close();
	}
}
//被装饰者
class FileReader extends Reader{
	public void close(){
		System.out.println("closed!");
	}
}
//装饰者
class BufferedReader extends Reader{
	//FileReader r;//面向对象编程
	Reader r;
	public BufferedReader(Reader r){
		this.r = r;
	}
	public void close(){
		System.out.println("扩展代码");
		r.close();
	}
}
abstract class  Reader{
	public abstract void close();//这里记得加上抽象关键字，接口才不加
}