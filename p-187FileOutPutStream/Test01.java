import java.io.*;
public class Test01{
	public static void main(String[] args){
		FileOutputStream fos = null;
		try{
			//fos = new FileOutputStream("E:\\MyFile\\learn\\java\\Test\\p-187FileOutPutStream\\Temp001.txt");//�ļ���֪��ȥ������
			fos = new FileOutputStream("E:\\MyFile\\learn\\java\\Test\\p-187FileOutPutStream\\Temp001.txt",true);//��׷�ӵķ�ʽд��
			String str = "HelloWorld";
			byte[] bytes = str.getBytes();
			fos.write(bytes);//�ļ������ڻ��Զ�����
			fos.write(bytes,0,3);//���������һ����д���ļ�
			fos.flush();//�Ƽ����Ϊ�˱�������ȫ��д�룬��ˢ��һ��
		}catch(FileNotFoundException e ){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fos != null){
				try{
					fos.close();
				}catch(IOException e ){
					e.printStackTrace();
				}
				
			}
		}
	}
}