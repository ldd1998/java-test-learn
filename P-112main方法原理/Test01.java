public class Test01{
	public static void main(String[] args){//mian�����Ĳ�����һ�����飬�������������в������Կո�ķ�ʽ�ָ����java Test01 user 123;
		if(args.length!=2){
			System.out.println("����ȷ�������");
		}
		//else if(args[0].equals("user") && args[1].equals.("123")){
		else if("user".equals(args[0]) && "123".equals(args[1])){///�����������һ���ã�//���Ա����ָ���쳣����Ϊequals�������������ǿ�Ҳ���ᱨ��
			System.out.println("��½�ɹ�");
		}
		else{
			System.out.println("��½ʧ��");
		}
	}
}