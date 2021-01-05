public class Test01{
	public static void main(String[] args){//mian方法的参数是一个数组，用来接收命令行参数，以空格的方式分割，比如java Test01 user 123;
		if(args.length!=2){
			System.out.println("请正确输入参数");
		}
		//else if(args[0].equals("user") && args[1].equals.("123")){
		else if("user".equals(args[0]) && "123".equals(args[1])){///这个方法比上一个好，//可以避免空指针异常，因为equals（）如果传入的是空也不会报错
			System.out.println("登陆成功");
		}
		else{
			System.out.println("登陆失败");
		}
	}
}