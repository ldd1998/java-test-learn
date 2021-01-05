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
	public void register(String name)throws NameException{//继往上抛出自定义异常
		if(name.length()<6){
			throw new NameException("用户名小于6位");//抛出自定义异常//抛出异常之后程序退出
		}
		System.out.println("注册成功");
	}
}
class NameException extends Exception{//定义编译时异常，如果是定义运行时异常就继承RunException
	public NameException(){}//无参数构造方法
	public NameException(String msg){
		super(msg);//将异常信息传递给父类，以便显示
	}
}
//注意：子类不能不父类抛出更广泛的异常
		//重写的方法不能比被重写的方法抛出更广泛的异常