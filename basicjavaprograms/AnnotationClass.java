package basicjavaprograms;
import java.lang.reflect.*;

@CustomAnnotation(value=5)
public class AnnotationClass {
	public String strVal="HELLO";
	public void myMethod() throws Exception{
		System.out.println("Annotation called");
		AnnotationClass an = new AnnotationClass();
		Method m = an.getClass().getMethod("myMethod");
		/*CustomAnnotation cus = m.getAnnotation(CustomAnnotation.class);
		System.out.println("Method annotation value = "+cus.value());*/
		System.out.println("Class annotation value = "+an.getClass().getAnnotation(CustomAnnotation.class).value());
		
		Method[] methods =an.getClass().getMethods();
		for(Method m1:methods) {
			
			if(m1.getName().equals("myMethodInt")) {
				System.out.println(m1.getName());
				System.out.println(m1.getReturnType());
				System.out.println(m1.getParameterCount());
				m1.setAccessible(true);
				System.out.println(m1.isAccessible());
			}
		}
		Field[] fields=an.getClass().getFields();
		for(Field f: fields) {
			System.out.println(f.getName());
			f.setAccessible(true);
		}
		Field field=an.getClass().getField("strVal");
		System.out.println((String)field.get(an));
		field.setAccessible(true);
		field.set(an, "HELLO WORLD");
		System.out.println((String)field.get(an));
		System.out.println(field.isAccessible());
	}
	public static void main(String args[]) throws Exception{
		AnnotationClass anclass = new AnnotationClass();
		anclass.myMethod();
	}
	
	public int myMethodInt(int a,int b) {
		a=10;b=10;
		return a+b;
	}
}
