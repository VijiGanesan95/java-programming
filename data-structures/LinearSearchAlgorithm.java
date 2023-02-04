package com.myprogram.datastructures.data_structures;
import java.util.*;
public class LinearSearchAlgorithm {//Time complexity - O(n)
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("length of the array:");
		int len = scan.nextInt();
		int[] arr = new int[len];
		//getting element in the array
		for(int i=0;i<len;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println();
		System.out.println("Array:");
		System.out.println();
		for(int i=0;i<len;i++) {
			System.out.printf("%d ",arr[i]);
		}
		//regular linear search
		System.out.println();
		System.out.println("Enter the element to be searched:");
		int num = scan.nextInt();
		boolean successType_1 = arraySearch(num,arr);
		if(successType_1) System.out.println("The element is found");
		else System.out.println("The element not found");
		
		
		//from left to right
		boolean successType_2 = arraySearchLR(num,arr);
		if(successType_2) System.out.println("The element is found");
		else System.out.println("The element not found");
		
		//Recursive Approach
		int index = arraySearchRecursion(num,arr,len);
		if(index==-1) System.out.println("The element not found");
		else System.out.println("The element is found at index:"+index);
	}
	
	public static boolean arraySearch(int num,int[] arr) {
		boolean value = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.printf("the element %d is in the index: %d ",num,i);
				value = true;
			}
		}
		return value;
	}
	
	public static boolean arraySearchLR(int num,int[] arr) {
		int left =0;
		int right = arr.length-1;
		boolean value =false;
		for(left=0;left<arr.length;) {
			if(arr[left]==num) {
				System.out.printf("the element %d is in the index: %d ",num,left);
				value = true;
				break;
			}
			if(arr[right]==num) {
				System.out.printf("the element %d is in the index: %d ",num,right);
				value = true;
				break;
			}
			left++;
			right--;
		}
		return value;
	}
	
	public static int arraySearchRecursion(int num,int[] arr,int len) {
		int index=0;
		if(len==0)
			return -1;
		if(arr[len-1]==num) {
			return len-1;
		}else {
			index=arraySearchRecursion(num, arr, len-1);
			return index;
		}
	}
}
