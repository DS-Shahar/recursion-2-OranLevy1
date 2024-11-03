public class Main {
	public static void main(String[] args) {
		int [] arr= {6,8,12,34};
		System.out.println(ex18(arr,arr.length-1));
	}
	public static int ex14(int [] arr, int i) {
		if (i == 0) {
			return arr[0];
	     }
		return arr[i] + ex14(arr, i - 1);
	}
	public static int ex15(int [] arr, int i) {
		if (i==-1)
			return 0;
		else if (arr[i]<=0) {
			return ex15(arr,i-1);
		}
		return 1+ex15(arr,i-1);
	}
	public static int ex16(int[] arr, int n,int i) {
		if (i==0) {
			return -1;
		}
		if (arr[i]==n)
			return i;
		return  ex16(arr,n,i-1);
	}
	public static boolean ex17(int [] arr,int i) {
		if (i==0)
			return true;
		if (arr[i]<=arr[i-1]){
			return false;
		}
		return ex17(arr,i-1);	
	}

	public static boolean ex18(int [] arr,int i) {
		if (i==0) {
			return true;
		}
		if (ex8(arr[i],2)==true)
			return false;
		return ex18(arr,i-1);
	}
	
	
	public static boolean ex8(int n,int i) {
		if (i>(n/2)+1){
			return true;
		}
		if (n%i==0) {
			return false;
		}
		return ex8(n,i+1);
	}
}	
