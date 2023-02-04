//used in sorted arays and improved variant of bst where the midpoint is found by probing position near the target value
package com.myprogram.datastructures.data_structures;
import java.util.*;
public class InterpolationSearch {//time complexity = O(log(log n))
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
					
					int index_1 = interpolationSearch(num[i],arr,0,arr.length-1);
					if(index_1!=-1) System.out.printf("the element %d is in index %d at the position %d",num[i],index_1,index_1+1);
					else System.out.println("the element not found");
					
					int index_2 = interpolationSearchRecursion(num[i],arr,0,arr.length-1);
					if(index_2!=-1) System.out.printf("the element %d is in index %d at the position %d",num[i],index_2,index_2+1);
					else System.out.println("the element not found");
					
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static int interpolationSearch(int num,int[] arr,int low,int high) {
		if(high-low==0)
			return -1;
		while(low<=high && num>=arr[low] && num<=arr[high]) {
			int mid = low +((high-low)/(arr[high]-arr[low])*(num-arr[low]));
			System.out.println("mid point:"+mid);
			if(num==arr[mid])
				return mid;
			if(num<arr[mid])
				high = mid-1;
			if(num>arr[mid])
				low= mid+1;
			}
		return -1;
	}
	//10 12 13 16 18 19 20 21 22 23 24 33 35 42 47
	public static int interpolationSearchRecursion(int num,int[] arr,int low,int high) {
		if(high-low==0)
			return -1;
		if(low<=high && num>=arr[low] && num<=arr[high]) {
			int mid = low+((high-low)/(arr[high]-arr[low])*(num-arr[low]));
			System.out.println("midpoint:"+mid);
			if(num==arr[mid])
				return mid;
			if(num>arr[mid])
				low = mid+1;
			if(num<arr[mid])
				high = mid-1;
			return interpolationSearchRecursion(num, arr, low, high);
		}
		return -1;
	}
	
	
}
