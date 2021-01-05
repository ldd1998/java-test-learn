import java.io.*;
public class Test01{
	public static void main(String[] args)throws Exception{
		//这里思考：如果想要字节流使用bufferedRead，需要将字节流通过InputStreamReader转化为字符流，因为bufferedReader里面的构造函数只有字符流的
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\MyFile\\learn\\java\\Test\\P-191Buffered中的字节输入流\\Test01.java")));
		String temp = null;
		while((temp=br.readLine())!=null){
			System.out.println(temp);
		}
		br.close();
		
	}
}