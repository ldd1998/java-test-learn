public class Custom{
	
	private int age;
	
	public void setAge(int _age){
		if(age<100 || age>0){
			System.out.println("���䲻�Ϸ�");
		}
		else{
			age=_age;			
		}
	}
	public int getAge(){
		return age;
	}
}