import java.io.*;
public class Test01{
	//ʹ��throws ֻ�Ὣ�쳣�׳�����һ����������������Ĵ���
	public static void main(String[] args) throws FileNotFoundException{//�����쳣����Ҫ�ڱ����ڴ��������޷�����ͨ��
		//FileInputStream f = new FileInputStream("C:/1.txt");//Test01.java:4: ����: δ������쳣����FileNotFoundException; ���������в���������Ա��׳�
		
		//try...catch�������쳣
		FileInputStream fi=null;//Ϊ���ں����ͷ���Դ
		try{
			 fi = new FileInputStream("C:/1.txt");//��ִ�е������ʱ�����쳣������һ�����󣬲��ҽ���ַ��ֵ��e
			System.out.println("����һ��try��������һ�䷢���쳣֮�󣬺������佫����ִ�У����ֻ��ִ��һ��catch���");
			fi.read();// δ������쳣����IOException; ���������в���������Ա��׳�
			return;//����������һ��return��finally������Ĵ���һ����ִ��
		}catch(FileNotFoundException e){//e�ڴ��ַָ����Ƿ���FileNotFoundException������¼���������д��toString������
			System.out.println(e);
			e.printStackTrace();//�����ϸ��Ϣ
			String s=e.getMessage();
			System.out.print(s);
		}catch(IOException e){//�쳣���Բ�׽���������ֻ�ܴ��ϵ��£���С���󣬲���catchֻ��ִ��һ����
			
		}
		finally{
			System.out.println("һ����ִ�У�һ�������ͷ���Դ");
			try{
				if(fi!=null){
					fi.close();//�ͷ���Դ
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
			System.exit(0);//�˳�
			System.out.println("ֻ���������fianlly��䲻��ִ��");
		}
	}
}