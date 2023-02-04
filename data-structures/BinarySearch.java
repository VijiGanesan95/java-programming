package com.myprogram.datastructures.data_structures;
import java.util.*;
public class BinarySearch {//Time complexity - O(log n  base 2)
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
				for(int i=0;i<len;i++) {
					System.out.printf("%d ",arr[i]);
				}
				System.out.println("Enter the element to be searched:");
				int[] num = new int[len];
				for(int i=0;i<len;i++) {
					num[i]=s.nextInt();
					
					System.out.println("regular binary search");
					int index_1 = binarySearch(num[i],arr);
					if(index_1!=-1) System.out.printf("the element %d is at the index :%d and at position :%d",num[i],index_1,index_1+1);
					else System.out.println("The element not found");
					
					System.out.println();
					
					System.out.println("binary search mid");
					int index_2 = binarySearchMid(num[i],arr,0,arr.length-1);
					if(index_2!=-1) System.out.printf("the element %d is at the index :%d and at position :%d",num[i],index_2,index_2+1);
					else System.out.println("The element not found");
					
					System.out.println();
					
					System.out.println("BinarySearch Recursion");
					int index_3 = binarySearchRecursion(num[i],arr,0,arr.length-1);
					if(index_3!=-1) System.out.printf("the element %d is at the index :%d and at position :%d",num[i],index_2,index_2+1);
					else System.out.println("The element not found");
				}
			
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		
			
		
		
	}
	
	public static int binarySearch(int num,int[] arr) { //5->2 0,1||3,4  6->3 0,1,2||3,4,5
		if(arr[arr.length/2]!=num) {
			int index =-1;
			for(int i=0;i<arr.length/2;i++) {
				if(arr[i]==num) {
					index= i;
				}
			}
			for(int i=arr.length/2;i<arr.length;i++) {
				if(arr[i]==num) {
					index= i;
				}
			}
			return index;
		}
		else {
			return arr.length/2;
		}
	}
	
	public static int binarySearchMid(int num,int[] arr,int low,int high) {
		while(low<=high) {
			//int mid = (low+high)/2;
			int mid = low+(high-low)/2;
			if(arr[mid]==num) {
				return mid;
			}else {
				if(num>arr[mid]) {
					low = mid+1;
				}
				else {
					high = mid-1;
				}
			}
		}return -1;
		
	}
	
	public static int binarySearchRecursion(int num,int[] arr,int low,int high) {
		if(low<=high) {
			//int mid=(low+high)/2;
			int mid = low+(high-low)/2;
			if(arr[mid]==num) {
				return mid;
			}
				if(num>arr[mid]) {
					low=mid+1;
					}
				if(num<arr[mid]) {
					high = mid-1;
					}
				return binarySearchRecursion(num, arr, low, high);
			
		}
		return -1;
	}
	
	
}
/*That is, it fails for larger values of int variables low and high. Specifically, it fails if the sum of low and high is greater than the maximum positive int value(2^31 – 1 ).

The sum overflows to a negative value and the value stays negative when divided by 2. 
In java, it throws ArrayIndexOutOfBoundException.

*/