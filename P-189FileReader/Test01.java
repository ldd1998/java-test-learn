import java.io.*;
public class Test01{
	public static void main(String[] args){
		FileReader fis = null;
		try{
			fis = new FileReader("E:\\MyFile\\learn\\java\\Test\\P-189FileReader\\Test01.java");
			//System.out.println(fis.available());//没有这个方法但是有skip
			char[] chars = new char[512];//521个字符是1kb
			int temp=0;
			while((temp=fis.read(chars))!=-1){
				System.out.println(new String(chars,0,temp));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fis != null){
				try{
					fis.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}