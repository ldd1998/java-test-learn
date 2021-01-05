import java.io.*;
public class Test01{
	public static void main(String[] args){
		FileInputStream f = null;
		try{
			f = new FileInputStream("E:/MyFile/learn/java/Test/P-183FileInputStream中的read(bytes[])/Test02.txt");
			byte[] bytes = new byte[3];
			int i1 = f.read(bytes);//每次读取3个字节放入数组并且返回这次读取到了几个字节
			System.out.println(new String(bytes,0,i1));
			int i2 = f.read(bytes);//每次读取3个字节放入数组并且返回这次读取到了几个字节
			System.out.println(new String(bytes,0,i2));
			int i3 = f.read(bytes);//每次读取3个字节放入数组并且返回这次读取到了几个字节
			System.out.println(new String(bytes,0,i3));//防止对数组本来就存储在里面的数据进行输出
			
			System.out.println(i1);//3
			System.out.println(i2);//3
			System.out.println(i3);//1
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				f.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}