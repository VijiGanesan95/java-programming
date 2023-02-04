//jump search is used in sorted arrays where we search element by jumping ahead with a block size and if the key is present in a block we traverse back with a linear search
package com.myprogram.datastructures.data_structures;
import java.util.*;
/*public class JumpSearch {//performance=linear search<jump search<binary search
	public static void main(String args[]) {//Time complexity=O(sqrt(n))
		try {
			Scanner s = new Scanner(System.in);
			int len = s.nextInt();
			if(len==0) System.out.println("The array is empty");
			else {
				int[] arr = new int[len];
				for(int i=0;i<len;i++) {
					arr[i]=s.nextInt();
				}
				System.out.println();
				System.out.println("Array :");
				for(int i=0;i<len;i++) {
					System.out.printf("%d ",arr[i]);
				}
				System.out.println();
				System.out.println("enter the element to be searched");
				int[] num = new int[len];
				for(int i=0;i<len;i++) {
					num[i]=s.nextInt();
					
					System.out.println();
					int index_1=jumpSearch(num[i],arr,0,arr.length-1);
					if(index_1!=-1) System.out.printf("the element %d is in index %d at position %d",num[i],index_1,index_1+1);
					else System.out.println("the element not found");
					
					System.out.println();
					int m = (int)Math.sqrt(Double.valueOf(arr.length));
					int index_2=jumpSearchRecursion(num[i],arr,0,arr.length-1,m);
					if(index_2!=-1) System.out.printf("the element %d is in index %d at position %d",num[i],index_2,index_2+1);
					else System.out.println("the element not found");
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static int jumpSearch(int num,int[] arr,int low,int high) {
		int m = (int)Math.sqrt(Double.valueOf(arr.length));
		while(m<arr.length) {
			if(num==arr[m])
				return m;
			if(num<arr[m])
				high = m-1;
			if(num>arr[m]) {
				low=m+1;
				m=m+m;
				high =m-1;
			}
			for(int i=low;i<=high;i++) {
				if(num==arr[i])
					return i;
			}
		}
		return -1;
	}
	public static int jumpSearchRecursion(int num,int[] arr,int low,int high,int m) {
		if(m<arr.length) {
			if(num==arr[m])
				return m;
			if(num<arr[m])
				high = m-1;
			if(num>arr[m]) {
				low=m+1;
				m=m+m;
				high =m-1;
			}
			for(int i=low;i<=high;i++) {
				if(num==arr[i])
					return i;
			}

			jumpSearchRecursion(num, arr, low, high, m);
		}
		return -1;
	}
}
Works only with sorted arrays.
The optimal size of a block to be jumped is (√ n). This makes the time complexity of Jump Search O(√ n).
The time complexity of Jump Search is between Linear Search ((O(n)) and Binary Search (O(Log n)).
Binary Search is better than Jump Search, but Jump Search has the advantage that we traverse back only once (Binary Search may require up to O(Log n) jumps, consider a situation where the element to be searched is the smallest element or just bigger than the smallest). So, in a system where binary search is costly, we use Jump Search.
*/
// Java program to implement Jump Search.
public class JumpSearch
{
    public static int jumpSearch(int[] arr, int x)
    {
        int n = arr.length;
  
        // Finding block size to be jumped
        int step = (int)Math.floor(Math.sqrt(n));
  
        // Finding the block where element is
        // present (if it is present)
        int prev = 0;
        while (arr[Math.min(step, n)-1] < x)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
  
        // Doing a linear search for x in block
        // beginning with prev.
        while (arr[prev] < x)
        {
            prev++;
  
            // If we reached next block or end of
            // array, element is not present.
            if (prev == Math.min(step, n))
                return -1;
        }
  
        // If element is found
        if (arr[prev] == x)
            return prev;
  
        return -1;
    }
  
    // Driver program to test function
    public static void main(String [ ] args)
    {
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                    34, 55, 89, 144, 233, 377, 610};
        int x = 85;
  
        // Find the index of 'x' using Jump Search
        int index = jumpSearch(arr, x);
  
        // Print the index where 'x' is located
        System.out.println("\nNumber " + x +
                            " is at index " + index);
    }
}