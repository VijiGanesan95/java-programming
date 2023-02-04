package TypErasureTypeCase;

public class ExtendedStack extends Stack<Integer>{
	public ExtendedStack(int capacity) {
		super(capacity);
	}
	 public void push(Integer value,int size) throws Exception {
		 super.push(value,size);
	 }
	 public void pop() {
		 super.pop();
	 }
	 public void display(int size) throws Exception {
		 super.display(size);
	 }
}
