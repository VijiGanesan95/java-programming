package data-structures;
import java.util.*;
import java.util.Map.Entry;
enum matrix{
	a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
}
public class EnumMap {
	public static void main(String args[]) {
		java.util.Map<String,Integer> map = new java.util.HashMap<String,Integer>();
		for(matrix m:matrix.values()) {
			map.put(m.toString(),matrix.valueOf(m.toString()).ordinal()+1);
		}
		Iterator itr = map.entrySet().iterator();
		for(Entry<String, Integer> s:map.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
		
	}
}
