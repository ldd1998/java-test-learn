public class Test01{
	public static void main(String[] args){
		Stack s = new Stack();
		try{
			s.push(1);
			s.push(1);
			s.push(1);
			s.push(1);
			s.push(1);		//数组默认大小是5会产生数组越界错误因此要自定义异常
			s.push(1);		//数组默认大小是5会产生数组越界错误因此要自定义异常
		}catch(StackOutOfBoundsException e){
			System.out.println(e);
		}
		try{
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			
		}catch(StackOutOfBoundsException e){
			System.out.println(e);
		}

	}
}