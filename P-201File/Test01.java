import java.io.*;
public class Test01{
	public static void main(String[] args)throws Exception{
		File f = new File("E:\\MyFile\\learn\\java\\Test\\P-201File\\Test01.java");
		File f1 = new File("E:\\MyFile\\learn\\java\\Test\\P-201File\\Test02");
		System.out.println(f);//E:\MyFile\learn\java\Test\P-201File\Test01.java���Զ��������ת���ȥ��
		System.out.println(f.exists());
		System.out.println(f1);//
		System.out.println(f1.exists());
		if(!f1.exists()){
			f1.mkdir();//�����ļ���
			f1.createNewFile();//�����ļ�//�ļ��ļ��в���ͬ��
			f1.mkdirs();//���������ļ���
		}
		
	}
}