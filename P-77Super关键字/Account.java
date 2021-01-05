public class Account{
	private String accountNo;
	private double balance;
	public Account(){
		System.out.println("Account的无参数构造方法执行");
	}//无参数构造方法
	public Account(String accountNo,double balance){//有参数构造方法
		this.accountNo=accountNo;
		this.balance=balance;
	}
	public void setAccountNo(String AccountNo){
		this.accountNo=accountNo;
	}
	public String getAccountNo(){
		return accountNo;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	
}