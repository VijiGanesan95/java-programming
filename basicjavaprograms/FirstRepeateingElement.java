package basicjavaprograms;//1 2 5 4 5 5 1 2
import java.util.*;
public class FirstRepeateingElement{
	public static void main(String args[]) {
		System.out.println("enter the number array");
		Scanner obj = new Scanner(System.in);
		String str=obj.nextLine();
		String[] strArr=str.split(" ");
		int len =strArr.length;
		int repNum=-1;
		Integer[] numArr=new Integer[len];
		int j=0;
		for (String i:strArr) {
			numArr[j]=Integer.valueOf(i);
			j++;
		}
		Set numSet=new HashSet();
		for(int i=len-1;i>=0;i--) {
			if(numSet.contains(numArr[i])) {
				repNum=i;
			}
			else {
				numSet.add(i);
			}
		}
		if(repNum!=-1)
			System.out.println("The repeating number:"+numArr[repNum]);
		else
			System.out.println("no repeating element");
	}
}

/*package javasampleprogramming;
import java.util.Scanner;
public class FirstRepeateingElement {
	public static void main(String args[]) {
		System.out.println("enter the number array");
		Scanner obj = new Scanner(System.in);
		String str=obj.nextLine();
		String[] strArr=str.split(" ");
		int[] numArr = new int[strArr.length];
		int j=0,repNum=0,firstNum=0;
		for(String i:strArr) {
			numArr[j]=Integer.valueOf(i);
			j++;
		}
		int len = strArr.length;
		a:for(int i=0;i<len-1;i++){
			firstNum = numArr[i];
			for(int k=0;k<len-1;k++) {
				if(firstNum==numArr[k+1]) {
					break a;
				}
				else
					continue;
			}
			
		}
		System.out.println("Repeating Number:"+firstNum);
	}
}*/