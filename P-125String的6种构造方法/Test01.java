public class Test01{
	public static void main(String[] args){
		//1
		String s1="1";
		
		//2
		String s2=new String("1");
		
		//3
		byte[] bytes1= {1,2,3};
		String s3=new String(bytes1);
		
		//4
		byte[] bytes2= {1,2,3};
		String s4=new String(bytes2,1,2);//³õÊ¼Î»ÖÃ£¬Æ«ÒÆÁ¿
		
		//5
		char[] c1= {'1','2','3'};
		String s5=new String(c1);
		
		//6
		char[] c2= {'1','2','3'};
		String s6=new String(c2,1,2);

	}
}