public class Test01{
	public static void main(String[] args){
		int[] a = {3,2,1,5,6};
		//对数组a进行冒泡排序
		for(int i = 0;i<a.length-1;i++){
			for (int j = i+1;j < a.length-1;j++){
				if (a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}
}