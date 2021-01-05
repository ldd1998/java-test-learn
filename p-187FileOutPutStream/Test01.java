import java.io.*;
public class Test01{
	public static void main(String[] args){
		FileOutputStream fos = null;
		try{
			//fos = new FileOutputStream("E:\\MyFile\\learn\\java\\Test\\p-187FileOutPutStream\\Temp001.txt");//文件不知道去了哪里
			fos = new FileOutputStream("E:\\MyFile\\learn\\java\\Test\\p-187FileOutPutStream\\Temp001.txt",true);//以追加的方式写入
			String str = "HelloWorld";
			byte[] bytes = str.getBytes();
			fos.write(bytes);//文件不存在会自动创建
			fos.write(bytes,0,3);//将数组里的一部分写入文件
			fos.flush();//推荐最后为了保障数据全部写入，则刷新一下
		}catch(FileNotFoundException e ){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fos != null){
				try{
					fos.close();
				}catch(IOException e ){
					e.printStackTrace();
				}
				
			}
		}
	}
}