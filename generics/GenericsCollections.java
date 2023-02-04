package generics;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

import org.omg.PortableInterceptor.ObjectIdHelper;
public class GenericsCollections {
	public static void main(String args[]) {
		//GenericSet
		
		Set<String> stringList = new HashSet<String>(Arrays.asList("A","B","C","A","a"));
		System.out.println(stringList);
		
		System.out.println();
		
		Iterator<String> strIterator = stringList.iterator();
		while(strIterator.hasNext()) {
			System.out.println("String list: "+strIterator.next());
		}
		
		//Generics List
		
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(1,2,3));
		System.out.println(intList);
		
		System.out.print("int list:");
		for(int i:intList) {
			System.out.printf(" %s ",i);
		}
		System.out.println();
		//Generics Map
		System.out.println();
		System.out.println("Generic Map");
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(2, "b");
		map.put(1, "a");
		map.put(3, "c");
		//using Key Set
		Set<Integer> key = map.keySet();
		for(Integer i:key) {
			System.out.println("key: "+i+" Value: "+map.get(i));
		}
		//using entry set
		Set<Entry<Integer,String>> entry = map.entrySet();
		for(Entry<Integer,String> e: entry) {
			System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
		}
		//upper bound wildcard
		List<? extends Integer> objList = new ArrayList<>();
		/*objList.add(3);
		objList.add(1);
		*/
		
		List<Integer> intListObj = new ArrayList<>();
		intListObj.add(5);
		
		objList = intListObj;
		System.out.println(objList);
		
		Integer[] intArr = new Integer[5];
		Number[] numArr = intArr; 
		numArr[1]=1;
		System.out.println(numArr);
		//arrays of parameterized types are not allowed
		//Integer[] arr = new Array<Integer>(5);
		
	}
}
