package TypErasureTypeCase;
import java.util.*;
public class Stack<E> {
	E[] stackContent;
	public Stack(int capacity) {
		this.stackContent = (E[])new Object[capacity];
	}
	
	public void push(E value,int size) throws Exception {
		int len=0;
		for(int i=0;i<size;i++) {
			if(stackContent[i]!=null) {
				//System.out.println("element: "+stackContent[i]);
				len++;
			}
				
		}
		//System.out.println("len: "+len+" value: "+value);
			if(len<=size-1) {
				stackContent[len]=value;
			}
			else
				System.out.println("the stack is full");
			
				
		///System.out.println("the element is pushed");
	}
	
	public void pop() {
		int index = -1;
		for(int i=0;i<stackContent.length;i++) {
			if(stackContent[i]!=null) {
				index++;
			}
		}
		System.out.println("index: "+index);
		if(index!=-1) {
			System.out.println("The popped element: "+stackContent[index]);
			stackContent[index]=null;
		}else {
			System.out.println("the stack is empty");
		}
		
	}
	
	public void display(int size) throws Exception {
		int index=-1;
		for(int i=0;i<size;i++) {
			if(stackContent[i]!=null) {
				System.out.println("element: "+stackContent[i]);
				index++;
			}	
		}
		if(index==-1)
			System.out.println("The stack is empty");
	}
}
