package basicjavaprograms;

class Singleton {
	private Singleton() {
		
	}
	public int i=10;
	private static class Bp{
		private static Singleton s = new Singleton();
	}
	public static Singleton getInstance() {
		return Bp.s;
	}
}
public class SoultionSingleton {
	public static void main(String args[]) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.i =x.i+50;
		System.out.println(x.i);
		System.out.println(y.i);
		System.out.println(z.i);
	}
}
