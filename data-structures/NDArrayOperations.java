package data-structures;
import java.util.*;
public class NDArrayOperations {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int[][] arr = new int[row][];
		for(int i=0;i<row;i++) {
			int col = s.nextInt();
			arr[i] = new int[col];
			for(int j=0;j<col;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();
		}
		//searching an element
		System.out.println("Enter the element to search:");
		int search = s.nextInt();
		boolean searchValue = arraySearch(search,arr);
		System.out.printf("The element %d is found: %b",search,searchValue);
		
	}
	
	public static boolean arraySearch(int num,int[][] array) {
		boolean value = false;
		int count=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]==num) {
					value = true;
					count++;
				}
			}
		}
		System.out.println("Number of counts:"+count);
		return value;
	}
}
