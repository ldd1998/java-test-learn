import java.io.*;
public class Test01{
	public static void main(String[] args){
		FileInputStream f = null;
		try{
			f = new FileInputStream("E:/MyFile/learn/java/Test/P-183FileInputStream�е�read(bytes[])/Test02.txt");
			byte[] bytes = new byte[3];
			int i1 = f.read(bytes);//ÿ�ζ�ȡ3���ֽڷ������鲢�ҷ�����ζ�ȡ���˼����ֽ�
			System.out.println(new String(bytes,0,i1));
			int i2 = f.read(bytes);//ÿ�ζ�ȡ3���ֽڷ������鲢�ҷ�����ζ�ȡ���˼����ֽ�
			System.out.println(new String(bytes,0,i2));
			int i3 = f.read(bytes);//ÿ�ζ�ȡ3���ֽڷ������鲢�ҷ�����ζ�ȡ���˼����ֽ�
			System.out.println(new String(bytes,0,i3));//��ֹ�����鱾���ʹ洢����������ݽ������
			
			System.out.println(i1);//3
			System.out.println(i2);//3
			System.out.println(i3);//1
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				f.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}