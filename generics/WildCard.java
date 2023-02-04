package generics;
import java.util.*;
class Animal{
	
}
class Cat extends Animal{
}
class RedCat extends Cat{
}
class Tiger extends RedCat{	
}
public class WildCard {
	public static Double sumOfNumbers(List<? extends Number> list) {
		Double sum =0.0;
		for(Number n: list) {
			sum=sum+n.intValue();
		}
		return sum;
	}
	
	public static void printNamesOfList(List<?> list) {
		for(Object o: list) {
			System.out.println(o);
		}
	}
	
	public static void sum(List<? super Integer> list) {
		for(Object n: list) {
			System.out.println(n);
		}
	}
	public static void AddCatsLowerBound(List<? super Tiger> list) {
		System.out.println("Cats added");
	}
	
	public static void AddCatsUpperBound(List<? extends Animal> list) {
		System.out.println("Cats added");
	}
	
	
	public static void main(String args[]) {
		//upper bound wildcard
		System.out.println("upper bound wildcard");
		System.out.println(sumOfNumbers(new ArrayList<Double>(Arrays.asList(2.0D,3.5D,5.6D))));
		System.out.println(sumOfNumbers(new ArrayList<Integer>(Arrays.asList(2,3,5))));
		System.out.println(sumOfNumbers(new ArrayList<Float>(Arrays.asList(2.0F,3.5F,5.6F))));
		System.out.println(sumOfNumbers(new ArrayList<Long>(Arrays.asList(245L,333L,455L))));
		
		System.out.println();
		//unbounded wildcard
		System.out.println("unbounded wildcard");
		printNamesOfList(new ArrayList<String>(Arrays.asList("a","b","c")));
		printNamesOfList(new ArrayList<Integer>(Arrays.asList(2,3,5)));
		printNamesOfList(new ArrayList<Double>(Arrays.asList(2.0D,3.5D,5.6D)));
		
		//lower bound wild card
		System.out.println();
		System.out.println("lower bound wild card");
		sum(new ArrayList<Integer>(Arrays.asList(2,3,5)));
		sum(new ArrayList<Number>(Arrays.asList(2D,3D,5D)));
		
		System.out.println();
		
		AddCatsLowerBound(new ArrayList<Animal>());
		AddCatsLowerBound(new ArrayList<Cat>());
		AddCatsLowerBound(new ArrayList<RedCat>());
		AddCatsLowerBound(new ArrayList<Tiger>());
		
		AddCatsUpperBound(new ArrayList<Animal>());
		AddCatsUpperBound(new ArrayList<Cat>());
		AddCatsUpperBound(new ArrayList<RedCat>());
		AddCatsUpperBound(new ArrayList<Tiger>());
	}
}
