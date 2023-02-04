package data-structures;
import java.util.*;

public class MultiDArray {

	public static void main(String[] args) {
		//2-D array
		//type 1
		/*int[][] arr= new int[][]{
				{1,2},
				{3,4}
		};*/
		//type 2
		int[][] arr = {
				{1,2},
				{3,4}
		};
		//type 3
		//int[][] arr= new int[2][2];
		Scanner s= new Scanner(System.in);
		/*
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=s.nextInt();
			}
		}*/

		System.out.println("2-D array");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();
		}
		//3-D array
		//type 1
		/*int[][][] ar = {
				{{1,2,3},{3,4,5},{5,6,7}},
				{{3,4,5},{5,6,7},{7,8,9}},
				{{5,6,7},{7,8,9},{10,11,12}}
		};*/
		//type 2
		int[][][] ar = new int[][][] {
			{{1,2,3},{3,4,5},{5,6,7}},
			{{3,4,5},{5,6,7},{7,8,9}},
			{{5,6,7},{7,8,9},{10,11,12}}
		};
		/*int[][][] ar=new int[3][3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					ar[i][j][k]=s.nextInt();
				}
			}
		}*/
		
		System.out.println("3-D array");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					System.out.printf("%d ",ar[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("N-D array");
		//2-D or 3-D array
		int row=s.nextInt();
		if(row==2) {
			int col=s.nextInt();
			System.out.println();
			System.out.println("row="+row+" column="+col);
			System.out.println();
			int[][] a = new int[row][col];
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					a[i][j]=s.nextInt();
					System.out.println("a["+i+"]["+j+"]="+a[i][j]);
				}
			}
			System.out.println();
			System.out.println("2-D array");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.printf("%d ",a[i][j]);
				}
				System.out.println();
			}
		}else if(row==3) {
			int col=s.nextInt();
			int h=s.nextInt();
			System.out.println();
			System.out.println("row="+row+" column="+col+" height="+h);
			System.out.println();
			int[][][] a = new int[row][col][h];
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					for(int k=0;k<h;k++) {
						a[i][j][k]=s.nextInt();
						System.out.println("a["+i+"]["+j+"]["+h+"]="+a[i][j]);
					}
				}
			}
			System.out.println("3-D array");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					for(int k=0;k<h;k++) {	
						System.out.printf("%d ",a[i][j][k]);
					}
					System.out.println();
				}
				System.out.println();
			}
		
		}
		

	}

}
