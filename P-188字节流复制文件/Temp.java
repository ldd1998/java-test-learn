import java.io.*;
public class Test01{
	public static void main(String[] args){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			fis = new FileInputStream("E:\\MyFile\\learn\\java\\Test\\P-188复制文件\\Test01.java");
			fos = new FileOutputStream("E:\\MyFile\\learn\\java\\Test\\P-188复制文件\\Temp.java");
			
			byte[] bytes = new byte[1024];//一次读取1kb
			int temp=0;
			while((temp = fis.read(bytes))!=-1){
				fos.write(bytes,0,temp);
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fos!=null&&fis!=null){
				try{
					fos.close();
					fis.close();
				}catch(IOException e){
					e.printStackTrace();
				}
	
			}
		}
	}
}