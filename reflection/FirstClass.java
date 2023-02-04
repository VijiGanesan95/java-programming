package reflection;

public class FirstClass {
	public static int statVar = 10;
	private String name;
	public FirstClass(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	protected static void statMethod() {
		System.out.println("First class static variable in static method: "+statVar);
	}
	
	static void nonStatMethod() {
		System.out.println("First class non static variable in static method: "+statVar);
	}
}
