public class Test01{
	public static void main(String[] args){
		Star a =new Star("����",100);
		Star b =new Star("����",100);
		System.out.println(a.equals(b));//��дequls������Ҫ����ʵ�����������String��equals�����Ѿ�����д���ˣ�����==�Ƚϵ�ʱ�ڴ��ַ
	}
}
class Star{
	String name;
	int nomber;
	public Star(String name,int nomber){
		this.name=name;
		this.nomber=nomber;
	}
	public boolean equals(Object o){
		if (this == o)return true;//�����ַһ����һ����ͬһ������
			if(o instanceof Star){
				Star s =(Star) o;
				if(this.name.equals(s.name) && this.nomber==s.nomber);
					return true;
			}
		return false;
	}
}