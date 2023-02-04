package hackerrankprograms;
import java.lang.*;
public class TwoElementSum{
	public static void main(String args[]) {
		int[] arr= {1, 60, -10, 70, -80, 85};
		twoElementSum(arr,arr.length);
	}
	public static void twoElementSum(int[] arr,int n) {
		int min_l=0;
		int min_r=0;
		int minSum=0;
		int sum=0;
		 if(arr.length <2) {
			 System.out.println("Invalid Array");
		 }
		 min_l=0;
		 min_r=0;
		 minSum=arr[0]+arr[1];
		 for(int i=0;i<n-1;i++) {
			 for(int j=i+1;j<n;j++) {
				 sum=arr[i]+arr[j];
				 if(Math.abs(minSum)>Math.abs(sum)){
					 minSum = sum;
					 min_l=i;
					 min_r=j;
				 }
			 }
		 }
		 System.out.println("two element sum near to zero:"+arr[min_l]+","+arr[min_r]);
	}
}