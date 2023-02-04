package hackerrankprograms;
import java.io.*;
import java.util.*;
import java.util.function.Predicate;
public class SolutionLambda {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =Integer.parseInt(scan.nextLine()) ;
        for(int i=0;i<num;i++){
            String str = scan.nextLine();
            String[] sep = str.split(" ");
            int testCase = Integer.valueOf(sep[0]);
            int number = Integer.valueOf(sep[1]);
            switch(testCase) {
            case 1:
                if(isOdd(number,n -> n%2==0))
                    System.out.println("EVEN");
                else
                    System.out.println("ODD");
                break;
            case 2:
            	java.util.List<Integer> a = Arrays.asList(2,3,5,7,11);            	
                if(number!=0 && number!=1) {
                	if(a.contains(number)) {
                		System.out.println("PRIME");
                	}
                	else if(isPrime(number, n ->(n%2!=0 && n%3!=0 && n%5!=0&& n%7!=0 && n%11!=0) ))
                		System.out.println("PRIME");
                	else
                		System.out.println("COMPOSITE");
                }break;
            case 3:
            	if(number<10) {
            		System.out.println("PALINDROME");
            	}else {
            		StringBuilder s = new StringBuilder(String.valueOf(number));
            		StringBuilder rev = new StringBuilder(s).reverse();
            		System.out.println(s+" "+rev);
            		if(isPalindrome(s.toString(),n -> n.toString().equals(rev.toString())))
            			System.out.println("PALINDROME");
            		else
            			System.out.println("NOT A PALINDROME");
            	}break;
            default:
            	System.out.println("No Service");
        }
        
    }
    }
    public static boolean isOdd(int num, Predicate<Integer> p){
        if(p.test(num)){
            return true;
        }
        else
            return false;
    }
     public static boolean isPrime(int num, Predicate<Integer> p){
    	 if(p.test(num)){
             return true;
         }
         else
             return false;
    }
     public static boolean isPalindrome(String num, Predicate<String> p){
    	 if(p.test(num)){
             return true;
         }
         else
             return false;
    }
}