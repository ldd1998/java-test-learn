//1��װ����ģʽҪ��װ���ߺ��б�װ���ߵ�����
//2��װ����ģʽ�л�Ҫ��װ���ߺͱ�װ����Ӧ��ʵ��ͬһ�����ͣ����󷽷����߽ӿڣ�
public class Test01{
	public static void main(String[] args){
		BufferedReader b = new BufferedReader(new FileReader());
		b.close();
	}
}
//��װ����
class FileReader extends Reader{
	public void close(){
		System.out.println("closed!");
	}
}
//װ����
class BufferedReader extends Reader{
	//FileReader r;//���������
	Reader r;
	public BufferedReader(Reader r){
		this.r = r;
	}
	public void close(){
		System.out.println("��չ����");
		r.close();
	}
}
abstract class  Reader{
	public abstract void close();//����ǵü��ϳ���ؼ��֣��ӿڲŲ���
}