//��java������ʵ���̵߳ĵ�һ�ַ���//ȱ�㣺�����ټ̳���������
//1���̳�Thread�࣬��дrun����
public class Test01{
	public static void main(String[] args){
		ThreadTest t = new ThreadTest();
		t.start();//��star�����������̣߳��Զ�����run�������൱�ڴ�����һ��ջ֡�����ҵ�������main����֮���µ��߳�Ҳ�������ֱ�����н���
		t.run()//���ֱ�ӵ���run�����Ļ�����൱�������ķ���һ�������������̣߳�ֻ�е�run����ִ�����֮��Ż���������
		}
}
class ThreadTest extends Thread{
	public void run(){
		for(int i = 0;i <10;i++){
			System.out.println(i);
		}	
	}
}