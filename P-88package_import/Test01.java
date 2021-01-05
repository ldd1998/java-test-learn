//1、为了解决命名冲突问题，Java语言引用了包机制
//2、在Java语言中采用package定义单包复包
//3、package只能存在Java文件中的第一行
//4、package的定义形式采用公司域名的倒叙方式，例如com.bjpowernode.oa.User
//5、完整的类时带有包名的
//6、必须这样进心编译 Javac -d 输出路径 文件路径 例如 Javac -d c:/ Test01.java

//注意如果直接Javac Test01.java编译的话会在当前路径下生成一个class类，但是由于类里面含有下面的一句话因此这个类不能直接使用，必须放在下面这就要话的文件夹里面
//并且文件夹属于类的一部分因此在运行的时候也要加上文件夹名称
//7、运行java com.bjpowernode.Test01.Test01
//8、import可以引用其他包，但是只能存在在package语句之下，class语句之上
package com.bjpowernode.oa.Test01;
import com.bjpowernode.oa.Test01.*;
public class Test01{
	public static void main(String[] args){
		System.out.println("运行成功");
	}
}