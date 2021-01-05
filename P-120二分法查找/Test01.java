public class Test01{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9};
		System.out.println(Binary.binary(a,8));
	}
}
class Binary{
	public static int binary(int[] a,int v){
		int low=0;
		int high=a.length;
		int middle=0;
		while(low<high){
			middle = (low + high)/2;
			if(v == a[middle]){
				return middle;
			}
			if(v < a[middle]){
				high = middle-1;
			}
			if(v > a[middle]){
				low=middle + 1;
			}
		}
		return -1;
	}
}