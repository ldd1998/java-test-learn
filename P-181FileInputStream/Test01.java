import java.io.*;
public class Test01{
	public static void main(String[] args){
		FileInputStream f = null;
		try{
			//f = new FileInputStream("E:\\MyFile\\learn\\java\\Test\\P-181FileInputStream\\Test01.java");//这个方法需要处理FileNotFoundException异常
			f = new FileInputStream("E:/MyFile/learn/java/Test/P-181FileInputStream/Test01.java");//路径的第二种写法
			//f = new FileInputStream("Test01.java");//路径的第三种写法（不可用）
			int i1 = f.read();//这个方法需要处理IOEXception异常,返回int类型，代表读取到的一个字节的数据，比如a则返回97，汉字为两个字节，一次只能读取一半，如果读到结尾则返回-1
			System.out.println(i1);
			//升级循环,//缺点：频繁访问磁盘，效率低
			int temp = 0;
			while((temp = f.read())!=-1){
				System.out.println(temp)
			}
			
		}catch(FileNotFoundException e){//异常需要由小到大处理
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if (f != null){
				try{
					f.close();	
				}catch(IOException e){
					e.printStackTrace();
				}
				
			}
		}
		
	}
}