package TypErasureTypeCase;

public class TypErasure {
	public static void main(String args[]) throws Exception {
		int size =5;
		ExtendedStack eStack = new ExtendedStack(size);
		System.out.println("Element Insertion");
		eStack.push(new Integer(1),size);
		eStack.push(new Integer(2),size);
		eStack.push(new Integer(3),size);
		eStack.push(new Integer(4),size);
		eStack.push(new Integer(5),size);
		eStack.push(new Integer(6),size);//full
		
		System.out.println("Element Display");
		eStack.display(size);
		
		System.out.println("Element Deletion");
		eStack.pop();//5
		eStack.pop();//4
		eStack.pop();//3
		eStack.pop();//2
		eStack.pop();//1
		eStack.pop();//empty
		
		System.out.println("Element Display");
		eStack.display(size);
		
		
	}
}
