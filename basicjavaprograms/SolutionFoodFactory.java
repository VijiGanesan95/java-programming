package basicjavaprograms;
import static java.lang.System.*;
import java.util.*;
interface Food{
	public abstract void getType();
}
class Pizza implements Food{
	public void getType() {
		System.out.println("Someone ordered Fast Food!");
	}
}
class Cake implements Food{
	public void getType() {
		System.out.println("Someone ordered a Dessert!");	
	}
}
public class SolutionFoodFactory{
	public static void main(String args[]) {
		Scanner scan = new Scanner(in);
		String str = scan.nextLine();
		SolutionFoodFactory fd = new SolutionFoodFactory();
		Food obj = fd.getFood(str);
		System.out.println("The factory returned "+obj.getClass());
		obj.getType();
		
	}
	public Food getFood(String s) {
		if(s.equals("Cake")) {
			return new Cake();
		}
		else
			return new Pizza();
	}
}
