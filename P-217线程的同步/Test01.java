/*
�̵߳�ͬ����Ϊ�˱�֤���ݰ�ȫ
ʲô�����Ҫʹ���̵߳�ͬ��
1�����̻߳���
2������һ������
3���漰�����ݵ��޸�

*/

public class Test01{
	public static void main(String[] args)throws Exception{
		Balance b = new Balance();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
	}
}
class Balance implements Runnable{
	double price = 4000;
	String name = "xiaoliu";
	
	public void run(){
		synchronized(this){//��synchronized���������ֻ��ͬʱ����һ����������֤���ݰ�ȫ
			System.out.println("ȡ��1000");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}		
			price -= 1000;
		}
	}
	public synchronized void m(){//���synchronized���ε��ǳ�Ա���������õ���Ҳ��this���������ǻ��˷Ѹ����ʱ�䣬���Щ�����Ҫ�߳�ͬ���ͼӵ��ľ���
		
	}
}