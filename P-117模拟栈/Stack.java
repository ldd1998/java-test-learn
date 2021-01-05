public class Stack{
	
	Object[] element;//�洢���ݵ�����
	int index;
	//���췽��
	public Stack(){
		this(5);//�������ã�Ĭ�ϴ�С��5
	}
	public Stack(int max){
		element = new Object[max];
		index = 0;
	}
	//ѹջ����
	public void push(Object e)throws StackOutOfBoundsException{
		if(index==element.length){
			throw new StackOutOfBoundsException("ջ����"+index);
		}
		
		element[index++] = e;//index++�ȸ�ֵ������	
		
	}
	//��ջ����
	public Object pop()throws StackOutOfBoundsException{
		if(index == 0 ){
			throw new StackOutOfBoundsException("ջ�ѿ�"+index);
		}
		return element[--index];//���Լ��ٸ�ֵ
	}
}