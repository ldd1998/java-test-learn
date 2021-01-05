import java.io.*;
public class Test01{
	public static void main(String[] args) throws Exception{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\MyFile\\learn\\java\\Test\\P-196DataInputStream\\temp"));
		byte b = 1;
		int i = 2;
		float f = 0.1f;
		double d = 0.01;
		char c = 'c';
		short s = 3;
		long l = 123;
		boolean bo = true;
		//写入
		dos.writeByte(b);
		dos.writeInt(i);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeChar(c);
		dos.writeShort(s);
		dos.writeLong(l);
		dos.writeBoolean(bo);
		
		//强制刷新
		dos.flush();
		//关闭
		dos.close();
		
		//读取
		DataInputStream dis = new DataInputStream(new FileInputStream("E:\\MyFile\\learn\\java\\Test\\P-196DataInputStream\\temp"));
		
		byte b1 = dis.readByte();
		int i1 = dis.readInt();
		float f1 = dis.readFloat();
		double d1 = dis.readDouble();
		char c1 = dis.readChar();
		short s1 = dis.readShort();
		long l1 = dis.readLong();
		boolean bo1 = dis.readBoolean();
		
		System.out.println(b1);
		System.out.println(i1);
		System.out.println(f1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(s1);
		System.out.println(l1);
		System.out.println(bo1);
		
		
		//关闭连接
		dis.close();
	}
}