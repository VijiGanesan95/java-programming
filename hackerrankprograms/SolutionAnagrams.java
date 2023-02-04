package hackerrankprograms;

public class SolutionAnagrams {
	public static void main(String[] args) throws Exception{
		 String a="anagramm";
		 String b="marganaa";
		 /*boolean isAnagram = true;
		 if(a.equalsIgnoreCase(b)) {
			 System.out.println("Anagram");
			 return;
		 }
		 for(int i=0;i<a.length();i++) {
			 int occur=0;
			 for(int j=0;j<a.length();j++) {
				 System.out.println("comparing "+a.charAt(i)+" and "+a.charAt(j));
				 if(a.charAt(i)==a.charAt(j)) {
					 occur++;
				 }
			 }
			 	int compare2=0;
				 for(int k=0;k<b.length();k++) {
					 if(a.charAt(i)==b.charAt(k)) {
						 compare2++;
					 }
				 }
				 if(compare2 ==0 || compare2 != occur) {
					 System.out.println(String.valueOf(occur));
					 System.out.println(String.valueOf(compare2));
					 isAnagram = false;
				 }
		 }
		 if(isAnagram) {
			 System.out.println("It's Anagram");
			 return;
		 }
		 System.out.println("Not a Anagram");*/
		 String[] d =new String[] {a,b};
	        @SuppressWarnings("unchecked")
			java.util.List<String>[] l=new java.util.ArrayList[2];
	         for(int i=0;i<d.length;i++) {
	             java.util.List<String> list= java.util.Arrays.asList(d[i].split(""));
	             java.util.Collections.sort(list);
	             l[i] = new java.util.ArrayList<String>();
	             l[i].addAll(list);
	         }
	         for(int j=0;j<l.length-1;j++){
	        	 if(l[j].toString().equalsIgnoreCase(l[j+1].toString())) 
		        	 System.out.println("t");
		         else 
		        	 System.out.println("f");
	         }

	        
	         
	         
	}
	
}
