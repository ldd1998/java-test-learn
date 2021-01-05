import java.util.*;
import java.text.*;
public class Test01{
	public static void main(String[] args){
		Date d = new Date();
		System.out.println(d);		
		SimpleDateFormat f = new SimpleDateFormat("y-M-d H:m:s S");
		/*
		这一行代码确立了转换的格式，其中 yyyy 是完整的公元年，MM 是月份，dd 是日期，HH:mm:ss 是时、分、秒。
		注意:有的格式大写，有的格式小写，例如 MM 是月份，mm 是分；HH 是 24 小时制，而 hh 是 12 小时制。
		*/
		System.out.println(f.format(d));
	}
}