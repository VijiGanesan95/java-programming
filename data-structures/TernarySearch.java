package data-structures;
import java.util.*;
public class TernarySearch {//time complexity - O(log n base3)
	public static void main(String args[]) {
		try {
			Scanner s = new Scanner(System.in);
			int len = s.nextInt();
			if(len==0)System.out.println("The array is empty");
			else {
				int arr[]= new int[len];
				for(int i=0;i<len;i++) {
					arr[i]=s.nextInt();
				}
				System.out.println();
				System.out.println("Array:");
				for(int i=0;i<len;i++) {
					System.out.printf("%d ",arr[i]);
				}
				System.out.println();
				System.out.println("Enter th element to be searched:");
				int num[] = new int[len];
				for(int i=0;i<len;i++) {
					num[i]=s.nextInt();
					
					System.out.println();
					System.out.println("Ternary Search");
					int index_1= ternarySearch(num[i],arr,0,arr.length-1);
					if(index_1!=-1) System.out.printf("the element %d is in index %d at the position %d",num[i],index_1,index_1+1);
					else System.out.println("the element not found");
					
					System.out.println();
					System.out.println("Ternary Search Recursion");
					int index_2= ternarySearchRecursion(num[i],arr,0,arr.length-1);
					if(index_2!=-1) System.out.printf("the element %d is in index %d at the position %d",num[i],index_2,index_2+1);
					else System.out.println("the element not found");
				}
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
	
	public static int ternarySearch(int num,int[] arr,int low,int high) {
		int mid1=0,mid2=0;
		while (low<=high && mid1<=mid2) {
			mid1= low+(high-low)/3;
			mid2=high-(high-low)/3;
			if(arr[mid1]==num)
				return mid1;
			if(arr[mid2]==num)
				return mid2;
			if(arr[mid1]==num && arr[mid2]==num)
				return mid1;
			if(num<arr[mid1])
				high=mid1-1;
			if(num>arr[mid2])
				low=mid2+1;
			if(num>arr[mid1] && num<arr[mid2]) {
				low= mid1+1;
				high=mid2-1;
			}
		}
		return -1;
	}
	
	public static int ternarySearchRecursion(int num,int[] arr,int low,int high) {
		int mid1=0,mid2=0;
		if(low<=high && mid1<=mid2) {
			mid1 = low+(high-low)/3;
			mid2 = high-(high-low)/3;
			if(arr[mid1]==num)
				return mid1;
			if(arr[mid2]==num)
				return mid2;
			if(arr[mid1]==num && arr[mid2]==num)
				return mid1;
			if(num<arr[mid1])
				high = mid1-1;
			if(num>arr[mid2])
				low = mid2+1;
			if(num>arr[mid1] && num<arr[mid2]) {
				low=mid1+1;
				high = mid2-1;
			}
			return ternarySearchRecursion(num, arr, low, high);
		}
		return -1;
	}
}
/*Binary search Vs Ternary Search
The time complexity of the binary search is more than  the ternary search but it does not mean that ternary search is better. In reality, the number of comparisons in ternary search much more which makes it slower than binary search.*/
