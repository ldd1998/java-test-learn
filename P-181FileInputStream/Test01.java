import java.io.*;
public class Test01{
	public static void main(String[] args){
		FileInputStream f = null;
		try{
			//f = new FileInputStream("E:\\MyFile\\learn\\java\\Test\\P-181FileInputStream\\Test01.java");//���������Ҫ����FileNotFoundException�쳣
			f = new FileInputStream("E:/MyFile/learn/java/Test/P-181FileInputStream/Test01.java");//·���ĵڶ���д��
			//f = new FileInputStream("Test01.java");//·���ĵ�����д���������ã�
			int i1 = f.read();//���������Ҫ����IOEXception�쳣,����int���ͣ������ȡ����һ���ֽڵ����ݣ�����a�򷵻�97������Ϊ�����ֽڣ�һ��ֻ�ܶ�ȡһ�룬���������β�򷵻�-1
			System.out.println(i1);
			//����ѭ��,//ȱ�㣺Ƶ�����ʴ��̣�Ч�ʵ�
			int temp = 0;
			while((temp = f.read())!=-1){
				System.out.println(temp)
			}
			
		}catch(FileNotFoundException e){//�쳣��Ҫ��С������
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