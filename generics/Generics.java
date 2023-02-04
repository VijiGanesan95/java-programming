package generics;
import java.util.*;
import globalconcept.*;
public class Generics<T,S> {
	T obj1;
	S obj2;
	

	public Generics(T obj1, S obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public T getObj1() {
			return obj1;
		}

	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}
	public S getObj2() {
		return obj2;
	}
	public void setObj2(S obj2) {
		this.obj2 = obj2;
	}
	public void changeVal() {
		FirstClass.statVar=7;
		System.out.println("FirstClass.statVar: "+FirstClass.statVar);
	}


	public static void main(String args[]) {
		Generics<Integer,String> integer = new Generics<Integer,String>(10,"Hello");
		System.out.println(integer.getObj1());
		System.out.println(integer.getObj2());
		
		System.out.println();
		integer.changeVal();
		//FirstClass.statMethod();
		//FirstClass.nonStatMethod();
		//parameterized types
		List<String> message = new ArrayList<>();
		message.add("abc");
		message.add("def");
		Generics<Integer, List<String>> parameter = new Generics(1,message);
		System.out.println(parameter.getObj1());
		System.out.println(parameter.getObj2());
		
		System.out.println();
		
		//Raw types
		Generics gen = new Generics(12,"Hello World");
		System.out.println(gen.getObj1());
		System.out.println(gen.getObj2());
		
		System.out.println();
		
		gen = integer;
		System.out.println(integer==gen);
		
		System.out.println();
		
		integer=gen;
		System.out.println(integer.getObj1());
		System.out.println(integer.getObj2());
		
		
		
		
		
	}


}
