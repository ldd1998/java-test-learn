public class Test01{
	public static void main(String[] args){
		String s1="aaa";
		String s2="aaa";
		System.out.println(s1==s2);//结果为true，证明有字符串常量池存在
		
		String s3=new String("111");
		String s4=new String("111");
		System.out.println(s3==s4);//结果为false，证明创建了两个对象
		System.out.println(s3.equals(s4));//结果为true证明了重写了equals方法，可以比较两个字符串是否相等
	}
}