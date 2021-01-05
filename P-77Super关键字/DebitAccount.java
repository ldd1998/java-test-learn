public class DebitAccount extends Account{
	private double debit;
	
	public DebitAccount(){
		//隐藏super();如果本语句块没有任何语句会默认调用suoer();如果第一句有super(...)则不会调用super()，且super()只能存在第一句
		//因为这个特性，因此父类必须有无参构造方法
	}
	public DebitAccount(double debit,String accountNo,double balance){//如果想要在这里给父类属性赋值则需要super
		super(accountNo,balance);//虽然调用了构造方法但是不会创建父类的对象
		this.debit=debit;

	}
	public void setDebite(double debit){
		this.debit=debit;
	}
	public double getDebit(){
		return debit;
	}
	public String toString(){
		return getAccountNo()+debit+getBalance();
	}
}