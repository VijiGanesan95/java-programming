package hackerrankprograms;

public class SolutionPalindrome {
	public static void main(String args[]) {
		
	        String A="mashfdsam";
	        char[] rev =new char[A.length()]; 
	        /*int j=0;
	        for(int i=A.length()-1;i>=0;i--){
	            rev[j]=A.charAt(i);
	            j++;
	        }
	        if(A.equals(String.valueOf(rev)))
	            System.out.println("Yes");
	        else
	            System.out.println("No");*/
	        boolean valid=true;
	        for(int i=0;i<A.length()/2;i++){
	            if(A.charAt(i)!=A.charAt((A.length()-1)-i)){
	                valid = false;
	                break;
	            }
	        }
	        if(valid) System.out.println("Yes");
	        else System.out.println("No");
	}
}
