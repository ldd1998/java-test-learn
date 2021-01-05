public class Test01{
	
	public static void main(String[] args){
		User u = new User();
		User u2 = new User(10);
		System.out.println(u2.age);
		u2.print();
	}
}