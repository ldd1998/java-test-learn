import java.io.*;
public class Test01{
	public static void main(String[] args){
		FileReader fr = null;
		FileWriter fw = null;
		try{
			fr = new FileReader("E:\\MyFile\\learn\\java\\Test\\P-190字符流复制文件\\Test01.java");
			fw = new FileWriter("E:\\MyFile\\learn\\java\\Test\\P-190字符流复制文件\\Test01_副本.java");	

			char[] bytes = new char[512];
			int temp = 0;
			while((temp = fr.read(bytes))!=-1){
				fw.write(bytes,0,temp);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fr!=null&&fw!=null){
				try{
					fr.close();
					fw.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}