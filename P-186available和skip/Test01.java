import java.io.*;
public class Test01{
	public static void main(String[] args){
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("E:\\MyFile\\learn\\java\\Test\\P-186available和skip\\Test01.java");
			System.out.println(fis.available());//是IOException，返回剩余可读字节大小
			fis.skip(3);//指针右移动3位
			System.out.println(fis.available());//是IOException，返回剩余可读字节大小
		}catch(FileNotFoundException e ){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fis != null){
				try{
					fis.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			
		}
	}
}