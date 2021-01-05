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
	Node node;//节点
	
	//构造函数
	public Linked(){
		node=null;
	}
	
	//增加数据
	public void add(Object data){
	}
	//节点类
	static class Node{
		Object data;//存放的数据
		Node next;//下一个节点的地址
		
		//构造函数
		public Node(Object data,Node next){
			this.data=data;
			this.next=next;
		}
	}
}