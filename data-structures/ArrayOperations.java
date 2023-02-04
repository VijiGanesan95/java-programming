package data-structures;
import java.util.*;
public class ArrayOperations {
	public static int countForDelete =0;
	public static final  String SEARCH="S";
	public static final  String INSERT="I";
	public static final  String DELETE="D";
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int arrLen = s.nextInt();
		int[] arr = new int[arrLen];
		for(int i=0;i<arrLen;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Array Operation:");
		String arOp=s.next();
		System.out.println(arOp);
		System.out.println("Array : ");
		for(int i=0;i<arrLen;i++) {
			System.out.printf("%d ",arr[i]);
		}
		if(arOp.equalsIgnoreCase(SEARCH)) {
			System.out.println();
			System.out.println("Enter the element to be searched:");
			int search = s.nextInt();
			boolean searchSuccess = arraySearch(search,arr,arOp);
			System.out.println("search is success: "+searchSuccess);
		}
		else if(arOp.equalsIgnoreCase(INSERT)) {
			System.out.println("Enter the element to be inserted:");
			int insert = s.nextInt();
			int[] arrInsert=Arrays.copyOf(arr, 20);
			boolean insertSuccess = arrayInsertion(insert,arrInsert,arr.length);
			System.out.println("insertion is success:"+insertSuccess);
			for(int i=0;i<=arrLen;i++) {
				System.out.printf("%d ",arrInsert[i]);
			}
		}else if(arOp.equalsIgnoreCase(DELETE)) {
			System.out.println();
			System.out.println("Enter the element to be deleted:");
			int delete = s.nextInt();
			boolean deleteSuccess = arrayElementDeletion(delete,arr);
		}else
			System.out.println("No operation");
		
	}
	//Linear search
	public static boolean arraySearch(int num,int[] a,String flag) {
		boolean value= false;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				value=true;
				count++;
			}
		}
		System.out.println("number of counts:"+count);
		if(flag.equalsIgnoreCase(DELETE)) {countForDelete=count;}
		return value;
	}
	
	public static boolean arrayInsertion(int num,int[] a,int position) {
		if(a.length<=position) {
			return false;
		}		
		a[position]=num;
		return true;
	}
	
	public static boolean arrayElementDeletion(int num,int[] a) {
	boolean value = false;	
	if(arraySearch(num, a,DELETE)) {
		while(countForDelete>0) {//to find if the deleting element is repeated in the ARRAY
			a:for(int i=0;i<a.length;i++) {
				if(a[i]==num) {//to find the position of the deleting element
					if(i==a.length-1) {//to delete the last element
						a[i]=0;
						countForDelete--;
						value = true;
					}
					else {
						for(int k=i;k<a.length;k++) {//to delete the element in the rest of the position
							if(k<a.length-1) a[k]=a[k+1];
							else {
								a[k] =0; //to make the position after the deleted element to zero
								value = true; 
								countForDelete--; 
								break a;}
						}
					}
				}
				else {
					for(int j=i;j<a.length;) {//to copy the array element if the deleting element is in the last position
						a[j]=a[j];
						continue a;
					}
				}
			}
		}
		for(int i=0;i<a.length-1;i++) {
			System.out.printf("%d ",a[i]);
		}
		}else {
			System.out.println("No element found");
		}
			
		return value;
	}
}
