public class DebitAccount extends Account{
	private double debit;
	
	public DebitAccount(){
		//����super();���������û���κ�����Ĭ�ϵ���suoer();�����һ����super(...)�򲻻����super()����super()ֻ�ܴ��ڵ�һ��
		//��Ϊ������ԣ���˸���������޲ι��췽��
	}
	public DebitAccount(double debit,String accountNo,double balance){//�����Ҫ��������������Ը�ֵ����Ҫsuper
		super(accountNo,balance);//��Ȼ�����˹��췽�����ǲ��ᴴ������Ķ���
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