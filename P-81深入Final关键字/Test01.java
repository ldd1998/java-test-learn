public class Test01{
	public static void main(String[] args){
		final Custom c=new Custom("����",15);
		//c = new Custom("����",16);//���ܶ�c�������¸�ֵ����Ϊfinal�ؼ�������
		c.name="����";
		System.out.println(c.name);//���ǿ����޸ĸĶ���ָ���ֵ������Ϊc�洢���Ƕ���ĵ�ַ����˲��ܶԵ�ַ�����޸ģ����õ�ַָ��Ķ�������Կ����޸�
	}
}
class Custom{
	String name;
	int age;
	public Custom(String name,int age){
		this.name=name;
		this.age=age;
	}
}