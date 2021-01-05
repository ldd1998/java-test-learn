public class Test01{
	public static void main(String[] args){
		StringBuffer s = new StringBuffer();//默认大小是16
		//如果做频繁的字符串拼接采用StringBuffer,，她是一个字符串缓冲区，原理是char类型数组，自动扩容，采用预测StringBuffer大小来避免字符串扩容
		//和String最大的区别：String是存储在字符串常量池中，而StringBuffer是char数组，自动扩容
		//StringBuffer和StringBuilder的区别  
		//StringBuffer是线程安全的，多线程环境不会出问题
		//StringBuilder是非线程安全的
		String[] ss={"111","222","333"};
		for(int i = 0;i<ss.length;i++){
			s.append(ss[i]);
		}
		System.out.println(s);
	}
}