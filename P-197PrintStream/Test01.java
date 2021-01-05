import java.util.*;
import java.io.*;
import java.text.*;
public class Test01{
	public static void main(String[] args)throws Exception{
		//默认输出到控制台上
		System.out.println("HelloWorld");
		//另一种方法.需要导入io包
		PrintStream ps = System.out;
		ps.println("HelloWorld");
		//还可以改变输出方向
		System.setOut(new PrintStream(new FileOutputStream("E:\\MyFile\\learn\\java\\Test\\P-197PrintStream\\log.txt")));
		System.out.println("日志");
		SimpleDateFormat d = new SimpleDateFormat("y-m-d H:m:s SSS");
		System.out.println(d.format(new Date()));
		A a = new A();
		System.out.println(d.format(new Date()));
		
	}
}
class A{
	public void m1(){
		System.out.println("m1方法执行");//影响不到这个类里面的println
	}
}