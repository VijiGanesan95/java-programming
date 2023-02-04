package pojoclass;
import pojoclass.*;
public class Student{
	private String name;
	private int age;
	private Address address;
	private static String School="HSS CO";
	
	public Student(String name,int age,Address address) {
		this.name = name;
		this.age= age;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		 return "Student: [ Name: "+name+" Age: "+age+" Address: "+address+"]";
	}
}
