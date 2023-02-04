package com.myprogram.datastructures.data_structures;
import java.util.Scanner;
public class OddEvenArrays {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int evenCount=0;
		int oddCount=0;
		int[][] a = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=s.nextInt();
				if(a[i][j]%2==0)
					evenCount++;
				else
					oddCount++;
			}
		}
		System.out.println("even numbers:"+evenCount+" "+"odd numbers:"+oddCount);
	}

}
