package hackerrankprograms;
import java.util.*;
import java.util.stream.IntStream;
public class SecondHighestNumber{
	public static void main(String args[]) {
		System.out.println("Enter the numbers in an array");
		Scanner obj = new Scanner(System.in);
		String str= obj.nextLine();
		String[] strArr = str.split(" ");
		int[] num = new int[strArr.length];
		Set<Integer> numSet = new HashSet<Integer>();
		for(int i=0;i<=strArr.length-1;i++) {
			num[i]=Integer.valueOf(strArr[i]);
			numSet.add(num[i]);
		}
		//System.out.println(numSet.size()-1);
		int len =numSet.size();
		Object[] numArr=new Object[len];
		numSet.toArray(numArr);
		System.out.println("Highest second number in an array:"+numArr[len-2]);
		
		}
}

/*package javasampleprogramming;
import java.util.Scanner;
public class SecondHighestNumber {
	public static void main(String args[]) {
		System.out.println("Enter the numbers in an array");
		Scanner obj = new Scanner(System.in);
		String str= obj.nextLine();
		String[] strArr = str.split(" ");
		int len = strArr.length;
		int hLen=(len%2==0)?len:len+1;
		int[] num= new int[len];
		int higNum=0;
		int temp=0;
		for(int i=0;i<=len-1;i++) {
			num[i]=Integer.valueOf(strArr[i]);
			System.out.println(num[i]);
		}                          //0 1 2 3 4
		for(int i=0;i<len-1;i++) {//2 1 5 1 4
			if(num[i]>num[i+1]) {
				temp = num[i];
				num[i]=num[i+1];
				higNum = num[i+1];
				num[i+1]=temp;
			}
			else {
				higNum=num[i];
			}
		}
		System.out.println("Highest number order:"+higNum);
		
	}
}
*/