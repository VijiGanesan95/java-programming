package generics;
import javasampleprogramming.*;
import java.util.*;

import PojoClass.Address;
import PojoClass.Student;
public class GenericsBoundedType {//with muliple bounds
	public static <T extends Number & Comparable<T>> T maximum(T x,T y, T z) {
		T max = x;                    
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		return max;
	}
	
	public static <T extends Comparable<T>> String compareAge(Student x, Student y) {
		Integer s1 = x.getAge();
		Integer s2 = y.getAge();
		if(s1.compareTo(s2)>0) {
			return x.getName();
		}
		else if(s1.compareTo(s2)<0) {
			return y.getName();
		}
		else
			return "SameAge";
	}
	
	public static <T extends Comparable<T>> String[] printNames(List<? extends Student> list) {
		String name[]=new String[list.size()];
		int i=0;
		for(Student s: list) {
			name[i]=s.getName();
			i++;
		}
		return name;
	}
	public static void main(String args[]) {
		System.out.println(maximum(7, 10, 15));
		System.out.println(maximum(2.5, 5.6, 9.0));
		//System.out.println(maximum("Apple", "Mango", "Orange"));
		
		//multiple bound types
		String name = compareAge(new Student("Viji",27,new Address("8316", "Russet Court", "CO", "80126")), new Student("Sara",33,new Address("8316", "Russet Court", "CO", "80126")));
		System.out.println(name +" is elder");
		
		//upper bound wildcard
		List<Student> namesList = new ArrayList<>();
		namesList.add(new Student("Viji",27,new Address("8316", "Russet Court", "CO", "80126")));
		namesList.add(new Student("Sara",33,new Address("8316", "Russet Court", "CO", "80126")));
		
		String[] names = printNames(namesList);
		for(String str:names) {
			System.out.println("Name of the Students: "+str);
		}
	}
}
