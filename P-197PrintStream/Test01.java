import java.util.*;
import java.io.*;
import java.text.*;
public class Test01{
	public static void main(String[] args)throws Exception{
		//Ĭ�����������̨��
		System.out.println("HelloWorld");
		//��һ�ַ���.��Ҫ����io��
		PrintStream ps = System.out;
		ps.println("HelloWorld");
		//�����Ըı��������
		System.setOut(new PrintStream(new FileOutputStream("E:\\MyFile\\learn\\java\\Test\\P-197PrintStream\\log.txt")));
		System.out.println("��־");
		SimpleDateFormat d = new SimpleDateFormat("y-m-d H:m:s SSS");
		System.out.println(d.format(new Date()));
		A a = new A();
		System.out.println(d.format(new Date()));
		
	}
}
class A{
	public void m1(){
		System.out.println("m1����ִ��");//Ӱ�첻������������println
	}
}