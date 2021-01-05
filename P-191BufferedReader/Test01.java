import java.io.*;
public class Test01{
	public static void main(String[] args){
		BufferedReader br =null;
		try{
			br = new BufferedReader(new FileReader("E:\\MyFile\\learn\\java\\Test\\P-191BufferedReader\\Test01.java"));
			String temp = null;
			while((temp = br.readLine())!=null){//这个方法是读取一行，但是并不读取这一行中的换行符
				System.out.println(temp);//输出自带换行符
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(br != null){
				try{
					br.close();//这里只需要关闭最外面一层，因为这里是装饰者模式	
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			
		}
	}
}