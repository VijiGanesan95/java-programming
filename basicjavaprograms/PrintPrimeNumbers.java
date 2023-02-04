package basicjavaprograms;
import java.util.Scanner;
public class PrintPrimeNumbers {
	public static void main(String args[]) {
		System.out.println("Enter the numbers of prime numbers:");
		Scanner obj = new Scanner(System.in);
		int n= obj.nextInt();
		for(int i=2;i<=n;i++) {
			if(i==2) {
				System.out.println(i);
			}
			if((i%i==0) && (i%2!=0)) {
				System.out.println(i);
			}
			if((i>7)&&(i%3!=0)&&(i%5!=0)&&(i%7!=0)&&(i%i==0)) {
				System.out.println(i);
			}
		}
	}
}
