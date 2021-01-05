public class Single{
	
	private static Single s;
	private Single(){
		
	}
	public static Single m1(){
		if(s==null){
			s=new Single();
			return s;
		}
		return s;
	}
}