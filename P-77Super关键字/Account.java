public class Account{
	private String accountNo;
	private double balance;
	public Account(){
		System.out.println("Account���޲������췽��ִ��");
	}//�޲������췽��
	public Account(String accountNo,double balance){//�в������췽��
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