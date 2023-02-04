package basicjavaprograms;
import java.util.*;
public class StringReversalRecursive {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(str);
		stringReversalRecursion(str);
	}
	public static void stringReversalRecursion(String str) {
		if(str.length()-1>=0) {
			System.out.printf("%s",str.charAt(str.length()-1));
			stringReversalRecursion(str.substring(0, str.length()-1));
		}
		else
			System.out.println();
	}
}
