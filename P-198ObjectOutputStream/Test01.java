import java.io.*;

public class Test01{
	public static void main(String[] args)throws Exception{
		User u =new User("xiaoming");
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("E:\\MyFile\\learn\\java\\Test\\P-198ObjectOutputStream\\User"));
		o.writeObject(u);
		o.flush();
		o.close();
		
		//反序列化
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\MyFile\\learn\\java\\Test\\P-198ObjectOutputStream\\User"));
		Object o1 = ois.readObject();
		System.out.println(((User)o1).name);
		ois.close();
	}
}
class User implements Serializable{//java.io.NotSerializableException: User如果不实现这个接口将会报错,这个接口没有一个方法是一个标志性接口，、在遇到这个接口的类会进行特殊待遇：产生一个版本
									//在遇到这个接口的类会进行特殊待遇：产生一个版本号属性static final long serialVersionUID=xxxxxxL;
	static final long serialVersionUID = 123L;//如果我们定义的了版本号，系统则不会再生成一个版本号
	String name;
	public User(String name){
		this.name = name;
	}
}