public class Test01{
	public static void main(String[] args){
		Linked link=new Linked();
		link.add(1);
		while(link.node.next!=null){
			System.out.println(link.node.data);
		}
	}
}
class Linked{
	Node node;//�ڵ�
	
	//���캯��
	public Linked(){
		node=null;
	}
	
	//��������
	public void add(Object data){
	}
	//�ڵ���
	static class Node{
		Object data;//��ŵ�����
		Node next;//��һ���ڵ�ĵ�ַ
		
		//���캯��
		public Node(Object data,Node next){
			this.data=data;
			this.next=next;
		}
	}
}