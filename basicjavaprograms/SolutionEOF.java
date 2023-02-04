package basicjavaprograms;
import java.util.*;

public class SolutionEOF {
	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0;
        String[] str = new String[] {};
        while(scan.hasNext()){
        	i++;
            System.out.printf("%d %s%n",i,scan.nextLine());
        }
    }
}
