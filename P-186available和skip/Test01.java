import java.io.*;
public class Test01{
	public static void main(String[] args){
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("E:\\MyFile\\learn\\java\\Test\\P-186available��skip\\Test01.java");
			System.out.println(fis.available());//��IOException������ʣ��ɶ��ֽڴ�С
			fis.skip(3);//ָ�����ƶ�3λ
			System.out.println(fis.available());//��IOException������ʣ��ɶ��ֽڴ�С
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