public class Test01{
	public static void main(String[] args){
		int[] a={3,2,1,5,4};
		int pos;
		int temp;
		for(int i=0;i<a.length;i++){//这里最好减去1
			pos=i;
			for(int j=i;j<a.length;j++){
				if(a[j]<a[pos]){
					pos=j;
				}
				temp = a[i];
				a[i]=a[pos];
				a[pos]=temp;
			}
		}
		for(int k = 0;k < a.length;k++){
			System.out.println(a[k]);
		}
	}
}