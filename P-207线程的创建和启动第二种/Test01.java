public class Test01{
	public static void main(String[] args){
		Thread t = new Thread(new ThreadTest());//����ʵ��������ȥ��һ���Ƽ������ַ���
		t.start();
	}
}
class ThreadTest implements Runnable{//ʵ�ֿ����еĽӿڣ�Teread�������ʵҲ��ʵ�ֵ�����ӿڣ���˿���ֱ�Ӵ���������
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
	}
}