package hackerrankprograms;

public class AutoboxingUnboxing {
	public static void main(String args[]) {
		//unboxing
		Integer i = new Integer(5);
		int j=i;
		System.out.println("Unboxing: Integer->"+i +" int-> "+j);
		
		int k= 10;
		Integer l = k; 
		System.out.println("Autoboxing: int->"+k+" Integer->"+l);
		
		
	}
}
