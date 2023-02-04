package hackerrankprograms;
import java.util.*;
public class FibonacciRecursion {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int n1=0,n2=1;
		System.out.printf("%d %d ",n1,n2);
		fibonacci(count,n1,n2);
	}
	public static void fibonacci(int count,int n1,int n2) {
		if(count>0) {
			int n3 = n1+n2;
			System.out.printf("%d ",n3);
			n1=n2;
			n2=n3;
			count--;
			fibonacci(count, n1, n2);
		}
	}
}
