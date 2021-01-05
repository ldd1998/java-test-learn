import java.util.*;
public class Test01{
	public static void main(String[] args){
		Hotel h = new Hotel();
		h.print();
		while(true){
			Scanner s = new Scanner(System.in);
			int no=Integer.parseInt(s.next());
			//int no1=int(no);//不可以强制转换
			h.order(no);
			h.print();
		}
	}
}