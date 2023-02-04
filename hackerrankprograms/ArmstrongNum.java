package hackerrankprograms;
import java.util.*;
public class ArmstrongNum{//1^3+5^3+5^3 //
	 /*public static void main(String args[]) {
		 int i=0,num=1635;//4096
		 
		 String armNum = String.valueOf(num);
		 System.out.println(armNum);
		 int temp=num;
		 int len= armNum.length();
		 int[] mid = new int[len-1] ;
		 int midterm=0;
		 int firstDigit;
		 int lastDigit= num%10;
		 int finalArm=0;
		 System.out.println("last digit:"+lastDigit);
		 while(i<len-1) {
			 temp=temp/10;
			 if(String.valueOf(temp).length()!=1) {
				 mid[i]=temp%10;
			 }
			 if(String.valueOf(temp).length()==1) {
				 break;
			 }
			 i++;
		 }
		 firstDigit=temp;
		 System.out.println("firstDigit:"+firstDigit);
		 for(int j=0;j<=i;j++) {
			 System.out.println("Midterm:"+mid[j]);
			midterm=midterm+power(mid[j],len);
		 }
		 finalArm = power(firstDigit,len)+midterm+power(lastDigit,len);
		 System.out.println(finalArm);
		 if(finalArm==num) {
			 System.out.println("Its Armstrong");
		 }else
		 {
			 System.out.println("Its not an Armstrong");
		 }
	 }*/
	 public static int power(int Num,int len) {
		 int tempFinal = 1;
		 for(int j=0;j<len;j++) {
			 tempFinal = tempFinal*Num;
		 }
		 return(tempFinal);
	 }
	 public static void main(String args[]) {
		 Scanner s = new Scanner(System.in);
		 int num = s.nextInt();
		 int digit = s.nextInt();
		 int temp = armstrongNumberRec(num,digit,0);
		 if(temp==num) System.out.println("Its armstrong");
		 else System.out.println("Its not armstrong");
	 }
	 public static int armstrongNumberRec(int num,int digit,int temp) {
		 if(num==0)
			 return temp;
		 else {
				 temp = temp+power(num%10,digit);
				 return armstrongNumberRec(num/10, digit, temp);
		 }
	 }
}