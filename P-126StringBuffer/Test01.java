public class Test01{
	public static void main(String[] args){
		StringBuffer s = new StringBuffer();//Ĭ�ϴ�С��16
		//�����Ƶ�����ַ���ƴ�Ӳ���StringBuffer,������һ���ַ�����������ԭ����char�������飬�Զ����ݣ�����Ԥ��StringBuffer��С�������ַ�������
		//��String��������String�Ǵ洢���ַ����������У���StringBuffer��char���飬�Զ�����
		//StringBuffer��StringBuilder������  
		//StringBuffer���̰߳�ȫ�ģ����̻߳������������
		//StringBuilder�Ƿ��̰߳�ȫ��
		String[] ss={"111","222","333"};
		for(int i = 0;i<ss.length;i++){
			s.append(ss[i]);
		}
		System.out.println(s);
	}
}