public class Test01{
	public static void main(String[] args){
		try{
			CustomService s = new CustomService();
			s.register("jjjjjjj");
		}catch(NameException e){
			System.out.println(e.getMessage());
		}

	}
}
class CustomService{
	public void register(String name)throws NameException{//�������׳��Զ����쳣
		if(name.length()<6){
			throw new NameException("�û���С��6λ");//�׳��Զ����쳣//�׳��쳣֮������˳�
		}
		System.out.println("ע��ɹ�");
	}
}
class NameException extends Exception{//�������ʱ�쳣������Ƕ�������ʱ�쳣�ͼ̳�RunException
	public NameException(){}//�޲������췽��
	public NameException(String msg){
		super(msg);//���쳣��Ϣ���ݸ����࣬�Ա���ʾ
	}
}
//ע�⣺���಻�ܲ������׳����㷺���쳣
		//��д�ķ������ܱȱ���д�ķ����׳����㷺���쳣