public class Test01{
	public static void main(String[] args){
		Custom c=new Custom(10,"С��");
		System.out.println(c.name);
		}
}
//this�ؼ��Ӵ���ǰ������ڴ��ַ����дĬ��Ҳ���У��������ڳ�Ա�����ͳ�Ա������
//���ǲ������ھ�̬�����У���Ϊ��̬��������������
class Custom{
	int age;
	String name;
	
	Custom(int age, String name){
		this.age=age;
		this.name=name;
	}
}
class MyData{
	int year;
	int month;
	int day;
	
	MyData(){
		/*
		year=2020;
		month=1;
		day=1;
		*/
		//�൱��
		this(2020,1,1);//��ֹ�����ظ�����������ڹ��췽���ĵ�һ��
	}
	MyData(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
}