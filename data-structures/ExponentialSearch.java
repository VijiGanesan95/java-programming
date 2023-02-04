package data-structures;
import java.util.*;
public class ExponentialSearch {
	public static void main(String args[]) {

		try {
			Scanner s = new Scanner(System.in);
			int len = s.nextInt();
			if(len==0) System.out.println("the array is empty");
			else {
				int[] arr = new int[len];
				for(int i=0;i<len;i++) {
					arr[i]=s.nextInt();
				}
				System.out.println();
				System.out.println("The array:");
				for(int i=0;i<len;i++) {
					System.out.printf("%d ",arr[i]);
				}
				System.out.println();
				System.out.println("enter the element to be searched:");
				int[] num = new int[len];
				for(int i=0;i<len;i++) {
 					num[i]=s.nextInt();
					int index_1 = exponentialSearch(num[i],arr,0,arr.length-1);
					if(index_1!=-1) System.out.printf("the element %d is in index %d at the position %d",num[i],index_1,index_1+1);
					else System.out.println("the element not found");
					
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	
	}
	/*public static int exponentialSearch(int num,int[] arr,int low,int high) {
		if(high-low<=0)
			return -1;
		int exp=1;
		while(exp<=(high-low) && high<=arr.length-1) {
			if(num==arr[exp])
				return exp;
			if(num>arr[exp]) {
				for(int j=low;j<=high;j++) {
					if(num==arr[j])
						return j;
				}
				low=exp/2;
				exp=exp*2;
				high=exp;
			}
			if(num<arr[exp]) {
				for(int j=low;j<=high;j++) {
					if(num==arr[j])
						return j;
				}
			}
		}
		return -1;
	}*/
	public static int exponentialSearch(int num,int[] arr,int low,int high) {
		if(high-low<=0)
			return -1;
		int exp=1;
		while(exp<=arr.length-1) {
			if(num==arr[exp])
				return exp;
			if(num<arr[exp])
				high=exp-1;
			if(num>arr[exp]) {
				low=exp/2;
				exp=exp*2;
				high = exp-1;
			}
			for(int i=low;i<=high&&high<=arr.length-1;i++) {
				if(num==arr[i])
					return i;
			}
		}
		return -1;
	}
}
