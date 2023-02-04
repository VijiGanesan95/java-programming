package data-structures;
import java.util.*;
//Jagged arrays are array of arrays in which member arrays are of different length
public class JaggedArrays {
	public static void main(String args[]) {
		/*int[][] arr=new int[][] {
			new int[] {1,2,3},
			new int[] {1,2,3,4},
			new int[] {1,2,3,4,5}
		};*/
		
		/*int[][] arr = {
				new int[] {1,2,3},
				new int[] {1,2,3,4},
				new int[] {1,2,3,4,5}
		};
		int[][] arr= {
				{1,3},
				{1,2,3},
				{1,2,4,5}
		};*/

		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int[][] arr = new int[row][];
		for(int i=0;i<row;i++) {
			int col=s.nextInt();
			arr[i]=new int[col];
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
		int evencount=0;
		int oddCount=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%2==0)
					evencount++;
				else
					oddCount++;
			}
		}
		System.out.println("evencount:"+evencount+"||oddCount:"+oddCount);
		
	}
}
