public class Test01{
	public static void main(String[] args){
		//Integer i = new Integer(10);
		Integer i1 =10;//这个可以用，自动装箱相，只有在值不在常量池的范围内时才相当于上一句
		
		//判断以下程序
		Integer i2=127;
		Integer i3=127;
		System.out.println(i2==i3);//按道理Integer i = new Integer(10);相当于创建了两个对象，但是这里的内存地址是一样的,证明没有创建对象
		//是因为sun公司定义了一个整型常量池存储范围为【-128，127】区间的整形数据。因为这些数据比较常用
		
		//判断以下程序
		Integer i8=new Integer(127);
		Integer i9=new Integer(127);
		System.out.println(i8==i9);//为什么这个是false
		
		Integer i4=-128;
		Integer i5=-128;
		System.out.println(i4==i5);//true
		
		Integer i6=128;
		Integer i7=128;
		System.out.println(i6==i7);//false
	}
}