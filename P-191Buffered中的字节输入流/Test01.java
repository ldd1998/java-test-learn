import java.io.*;
public class Test01{
	public static void main(String[] args)throws Exception{
		//����˼���������Ҫ�ֽ���ʹ��bufferedRead����Ҫ���ֽ���ͨ��InputStreamReaderת��Ϊ�ַ�������ΪbufferedReader����Ĺ��캯��ֻ���ַ�����
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\MyFile\\learn\\java\\Test\\P-191Buffered�е��ֽ�������\\Test01.java")));
		String temp = null;
		while((temp=br.readLine())!=null){
			System.out.println(temp);
		}
		br.close();
		
	}
}