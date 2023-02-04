package hackerrankprograms;
import java.util.*;
public class SolutionFormat {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			String str = scan.next();
			int num= scan.nextInt();
			System.out.println(str+" "+num);
			System.out.printf("%-15s",str);
			System.out.printf("%03d", num);
			
			
		}
		
	}
}
