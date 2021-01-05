//传统的方法进行接收用户输入，但是它是以空格和回车符进行分割的
/*import java.util.*;
public class Test01{
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		System.out.println(s.next());
	}
}*/
import java.util.*;
import java.io.*;
public class Test01{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());//采用这个方法可以读取一行
	}
}