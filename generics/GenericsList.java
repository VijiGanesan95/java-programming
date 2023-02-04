package generics;
import java.util.*;

import PojoClass.Address;
import PojoClass.Student;
public class GenericsList<E> {
	List<E> list= new ArrayList<E>();
	//getter and setter
	public void setList(List<E> list) {
		this.list = list;
	}
	
	public List<E> getList(){
		return list;
	}
	//adding individually
	public void addVal(E value) {
		list.add(value);
	}
	//getting the index
	public int getIndex(E value) {
		return list.indexOf(value);
	}
	//printing the arrays
	public static <E> void listValues(List<E> list) {
		for(E e: list) {
			System.out.println("Array using generics: "+e);
		}
	}
	//bounded type parameters
	public static <E extends Student> int listValuesOfStudent(List<E> list) {
		int count=0;
		for(E e: list) {
			System.out.println("Array using generics: "+e);
			count++;
		}
		return count;
	}
	
	
	public static void main(String args[]) {
		List<String> l = new ArrayList<String>();
		l.add("abc");
		l.add("def");
		GenericsList<String> list = new GenericsList<String>();
		list.setList(l);
		list.addVal("ghi");
		System.out.println(list.getList());
		System.out.println("Index: "+list.getIndex("ghi"));
		
		
		List<Integer> lInt = new ArrayList<Integer>();
		lInt.add(1);
		lInt.add(2);
		
		GenericsList<Integer> list1 = new GenericsList<Integer>();
		list1.setList(lInt);
		System.out.println(list1.getList());
		
		//generic method
		listValues(lInt);
		listValues(l);
		
		//Bounded Type parameters
		List<Student> studentList = new ArrayList();
		GenericsList<Student> sl = new GenericsList<Student>();
		studentList.add(new Student("Viji",27,new Address("8316", "Russet Court", "CO", "80126")));
		studentList.add(new Student("Sara",33,new Address("8316", "Russet Court", "CO", "80126")));
		studentList.add(new Student("Kavi",3,new Address("8316", "Russet Court", "CO", "80126")));
		System.out.println("Number of students: "+listValuesOfStudent(studentList));
		
	}
}

