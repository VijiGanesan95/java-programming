package reflection;

public class MainClass {
	public static void main(String args[]) {
		MainClass mc = new MainClass();
		FirstClass.statVar=9;
		FirstClass fc = new FirstClass("Viji");
		System.out.println(changeName());
		//System.out.println(fc.getName());
		FirstClass.statMethod();
		FirstClass.nonStatMethod();
		System.out.println(mc.changeValue());
	}
	
	public int changeValue() {
		FirstClass.statVar=8;
		return FirstClass.statVar;
	}
	
	public static String changeName() {
		FirstClass fclass = new FirstClass("Sara");
		return fclass.getName();
	}
}
