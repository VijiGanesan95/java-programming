package generics;

public class GenericsMap<K,V>{
	K key;
	V value;
	
	public GenericsMap(K key,V value){
		this.key= key;
		this.value= value;
	}
	
	public void setKey(K key) {
		this.key= key;
	}
	
	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Generics Map: [Key: "+key+" Value: "+value+"]";
	}
	public static <K,V> boolean compare(GenericsMap<K, V> m1, GenericsMap<K, V> m2){
		return(m1.getKey().equals(m2.getKey()) && m1.getValue().equals(m2.getValue()));
	}
	
	public static void main(String args[]) {
		GenericsMap<Integer, String> gen = new GenericsMap<Integer, String>(1, "MONDAY");
		System.out.println(gen.getKey());
		System.out.println(gen.getValue());
		System.out.println(gen);
		
		GenericsMap<Integer, String> gen1 = new GenericsMap<Integer, String>(1, "MONDAY");
		System.out.println(gen1.getKey());
		System.out.println(gen1.getValue());
		System.out.println(gen1);
		
		boolean value = compare(gen, gen1);
		System.out.println(value);
		
	}

}
