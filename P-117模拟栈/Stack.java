public class Stack{
	
	Object[] element;//存储数据的数组
	int index;
	//构造方法
	public Stack(){
		this(5);//代码重用，默认大小是5
	}
	public Stack(int max){
		element = new Object[max];
		index = 0;
	}
	//压栈方法
	public void push(Object e)throws StackOutOfBoundsException{
		if(index==element.length){
			throw new StackOutOfBoundsException("栈已满"+index);
		}
		
		element[index++] = e;//index++先赋值再自增	
		
	}
	//弹栈方法
	public Object pop()throws StackOutOfBoundsException{
		if(index == 0 ){
			throw new StackOutOfBoundsException("栈已空"+index);
		}
		return element[--index];//先自减再赋值
	}
}