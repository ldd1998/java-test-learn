import java.io.*;
public class Test01{
	public static void main(String[] args){
		BufferedReader br =null;
		try{
			br = new BufferedReader(new FileReader("E:\\MyFile\\learn\\java\\Test\\P-191BufferedReader\\Test01.java"));
			String temp = null;
			while((temp = br.readLine())!=null){//��������Ƕ�ȡһ�У����ǲ�����ȡ��һ���еĻ��з�
				System.out.println(temp);//����Դ����з�
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(br != null){
				try{
					br.close();//����ֻ��Ҫ�ر�������һ�㣬��Ϊ������װ����ģʽ	
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			
		}
	}
}