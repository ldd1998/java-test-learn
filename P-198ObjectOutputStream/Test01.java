import java.io.*;

public class Test01{
	public static void main(String[] args)throws Exception{
		User u =new User("xiaoming");
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("E:\\MyFile\\learn\\java\\Test\\P-198ObjectOutputStream\\User"));
		o.writeObject(u);
		o.flush();
		o.close();
		
		//�����л�
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\MyFile\\learn\\java\\Test\\P-198ObjectOutputStream\\User"));
		Object o1 = ois.readObject();
		System.out.println(((User)o1).name);
		ois.close();
	}
}
class User implements Serializable{//java.io.NotSerializableException: User�����ʵ������ӿڽ��ᱨ��,����ӿ�û��һ��������һ����־�Խӿڣ�������������ӿڵ��������������������һ���汾
									//����������ӿڵ��������������������һ���汾������static final long serialVersionUID=xxxxxxL;
	static final long serialVersionUID = 123L;//������Ƕ�����˰汾�ţ�ϵͳ�򲻻�������һ���汾��
	String name;
	public User(String name){
		this.name = name;
	}
}