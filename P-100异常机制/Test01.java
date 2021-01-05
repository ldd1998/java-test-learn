import java.io.*;
public class Test01{
	//使用throws 只会将异常抛出给上一级，不会进行真正的处理。
	public static void main(String[] args) throws FileNotFoundException{//编译异常必须要在编译期处理，否则无法编译通过
		//FileInputStream f = new FileInputStream("C:/1.txt");//Test01.java:4: 错误: 未报告的异常错误FileNotFoundException; 必须对其进行捕获或声明以便抛出
		
		//try...catch来处理异常
		FileInputStream fi=null;//为了在后面释放资源
		try{
			 fi = new FileInputStream("C:/1.txt");//在执行到这里的时候发生异常，产生一个对象，并且将地址赋值给e
			System.out.println("当在一个try语句块中有一句发生异常之后，后面的语句将不会执行，因此只能执行一个catch语句");
			fi.read();// 未报告的异常错误IOException; 必须对其进行捕获或声明以便抛出
			return;//就算这里有一个return；finally语句块里的代码一定会执行
		}catch(FileNotFoundException e){//e内存地址指向的是发生FileNotFoundException错误的事件，并且重写了toString方法，
			System.out.println(e);
			e.printStackTrace();//输出详细信息
			String s=e.getMessage();
			System.out.print(s);
		}catch(IOException e){//异常可以捕捉多个，但是只能从上到下，从小到大，并且catch只会执行一个，
			
		}
		finally{
			System.out.println("一定会执行，一般用来释放资源");
			try{
				if(fi!=null){
					fi.close();//释放资源
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
			System.exit(0);//退出
			System.out.println("只有这种情况fianlly语句不会执行");
		}
	}
}