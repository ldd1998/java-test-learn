import java.io.*;
public class Test01{
	public static void main(String[] args)throws Exception{
		//BufferedWriter br = new BufferedWriter(new FileWriter("E:\\MyFile\\learn\\java\\Test\\P-193BufferedWriter\\Test_fuben.java"));
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\MyFile\\learn\\java\\Test\\P-193BufferedWriter\\Test_fuben.java",true)));//ת����
		br.write("zifuchuan�ַ���");
		br.flush();
		br.close();
	}
}