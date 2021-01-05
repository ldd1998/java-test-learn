public class Test01{
	public static void main(String[] args){
		
		CustomerService c = new CustomerImpl();//多态方法，不用多态也可以，但是因为我们为了实现程序的低耦合性，因此我们应该面向接口编程，因此要使用多态方便换另一个类，而不需要修改代码
		c.logout();
	}
}