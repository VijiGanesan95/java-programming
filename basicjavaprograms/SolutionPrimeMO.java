package basicjavaprograms;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.lang.annotation.*;

class Prime extends Solution{
	 boolean f = Solution.class.equals("in");
   public void checkPrime(int... nums){
	   int len = nums.length;
        for(int i=0;i<len;i++) {
        	if(nums[i]!=0 && nums[i]!=1) {
        		if(nums[i]<=10 && (nums[i]==2 || nums[i]==3 || nums[i]==5 || nums[i]==7)) {
        			if(i==len-1) System.out.printf("%d%n",nums[i]);
        			else System.out.printf("%d ",nums[i]);
        		}else if(nums[i]%2!=0 && nums[i]%3!=0) {
        			if(i==len-1) System.out.printf("%d%n",nums[i]);
        			else System.out.printf("%d ",nums[i]);
        		}else {
        			if(i==len-1) System.out.printf("%n");
        			else System.out.printf("");
        		}
        	}
        	else {
        		if(i==len-1) System.out.printf("%n");
        		else System.out.printf("");
        	}
        }
    
   }
}
/*@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnnotation{
	String in();}
@MyAnnotation(in = "System.in")*/
/*@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.PARAMETER})
@interface MyAnnotation{InputStream in=System.in;}*/
public class SolutionPrimeMO {


	public static void main(String[] args) {
		try{
		InputStream in=System.in;
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

