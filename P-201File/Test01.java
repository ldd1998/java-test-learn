import java.io.*;
public class Test01{
	public static void main(String[] args)throws Exception{
		File f = new File("E:\\MyFile\\learn\\java\\Test\\P-201File\\Test01.java");
		File f1 = new File("E:\\MyFile\\learn\\java\\Test\\P-201File\\Test02");
		System.out.println(f);//E:\MyFile\learn\java\Test\P-201File\Test01.java会自动将里面的转义符去掉
		System.out.println(f.exists());
		System.out.println(f1);//
		System.out.println(f1.exists());
		if(!f1.exists()){
			f1.mkdir();//创建文件夹
			f1.createNewFile();//创建文件//文件文件夹不能同名
			f1.mkdirs();//创建多重文件夹
		}
		
	}
}