package basicjavaprograms;
import java.util.Scanner;
public class StringReversal{
	public static void main(String args[]) {
		System.out.println("Enter the String to be reversed:");
		Scanner obj = new Scanner(System.in);
		String str=obj.nextLine();
		int len = str.length()/2;
		int hLen = (str.length()%2==0)?len:(len+1);
		char[] strArr = str.toCharArray();
		char[] revStr =new char[len];
		char temp=0;
		int d=0;
		d=hLen;
		for(int i=0;i<hLen;i++) {//apple
			temp=strArr[i];
			strArr[i]=strArr[i+d+1];
			strArr[i+d+1]=temp;
			d=d-2;
			
		}
		System.out.println(String.valueOf(strArr));
		
	}
}




/*package javasampleprogramming;
import java.util.Scanner;
 public class StringReversal{
	public static void main(String args[]) {
		System.out.println("Enter the String to be reversed:");
		Scanner obj = new Scanner(System.in);
		String str=obj.nextLine();
		int len = str.length();
		int l=0;
		char[] revStr=new char[len];
		for(int i=len-1;i>=0;i--) {
			revStr[i]=str.charAt(l);
			l++;
		}
		String revString = String.valueOf(revStr);
		System.out.println(revString);
	}
}*/





/*package javasampleprogramming;
public class StringReversal {
	public static void main(String args[]) {
		String str="abc",revStr=null;
		String[] strArr=str.split("");
		int len=strArr.length;
		for(int i=0;i<=len-1;i++) {
			System.out.println(strArr[i]);
		}
		int h=len,l=0,j;
		for(j=h-1;j<=0;j--) {
			strArr[j]=strArr[l];
			l++;
		}
		for(int i=0;i<=len-1;i++) {
			System.out.println(strArr[i]);
		}
	}
	
}
*/