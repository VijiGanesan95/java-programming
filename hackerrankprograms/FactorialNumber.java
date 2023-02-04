package hackerrankprograms;
import java.util.*;
public class FactorialNumber {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		factorial(num);
		int res = factorialRec(num);
		System.out.println(res);
	}
	//normal method
	public static void factorial(int num) {
		int res =1;
		for(int i=1;i<=num;i++) {
			res = res*i;
		}
		System.out.printf("%d ",res);
	}
	//recursive method
	public static int factorialRec(int num) {
		int res =1;
		if(num==1) {
			return num;
		}
		else {
			return num*factorialRec(num-1);
		}
			
	}
}
