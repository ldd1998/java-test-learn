public class Test01{
	public static void main(String[] args){
		Stack s = new Stack();
		try{
			s.push(1);
			s.push(1);
			s.push(1);
			s.push(1);
			s.push(1);		//����Ĭ�ϴ�С��5���������Խ��������Ҫ�Զ����쳣
			s.push(1);		//����Ĭ�ϴ�С��5���������Խ��������Ҫ�Զ����쳣
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