package basicjavaprograms;

import java.util.Collection;

//import java.util.*;
public class SolutionStrSubstring {
	public static void main(String args[]) {
		String smallest = "";
        String largest = "";
        String s ="welcometojava";
        int k=3;
        //System.out.println(s.length()+" "+s.length()/k);
        //int j=k,b=s.length()-1-3;
       
        java.util.ArrayList<String> strList=new java.util.ArrayList<String>();
        java.util.ArrayList<String> str=new java.util.ArrayList<String>();
       
        for(int i=0;i<=s.length();i++) {
        	for(int j=k;j<=s.length();j++) {
        		if(j<=s.length() && i<=s.length() && Math.abs(i-j)==Math.abs(k) && i<j) {
        			//System.out.println(i+" "+j);
        			str.add(s.substring(i,j));
        		}
        	}
        }
        
       
       
       
       // System.out.println(str.size());
       /* String temp=null;
        for(int a=0;a<str.size();a++) {
        	for(int b=a+1;b<str.size();b++) {
        		if(str.get(a).compareTo(str.get(a+1))>0) {
        			temp = str.get(b);
                    str.get(b).replace(str.get(b), str.get(a));
                    str.get(a).replace(str.get(a), temp);
                   // System.out.println(str.get(a+1)+" "+str.get(a));
                    //System.out.println((a+1)+" "+(a));
        		}
        	}
        }*/
        java.util.Collections.sort(str);
        //System.out.println(str.size());
        for(String strEach:str) {
        	System.out.println(strEach);
        }
        /*int l=0;
        String[] str = new String[s.length()];
        System.out.println(str.length);
        for(int i=0;i<=s.length();i++) {
            for(int j=k;j<=s.length();j++) {
                if(j<=s.length() && i<s.length() && Math.abs(i-j)==Math.abs(k) && i<j) {
                    System.out.println(i+" "+j);
                    str[l]=(s.substring(i,j));
                    l++;
                }
                
            }
        }
        for(int a=0;a<str.length;a++) {
        	for(int b=a+1;b<str.length;b++) {
        		if(str[a]!=null && str[b]!=null && str[a].compareTo(str[b])>0) {
        			String temp = str[b];
        			str[b]=str[a];
        			str[a]=temp;
        		}
        	}
        }
        for(String sArr:str) {
        	if(sArr!=null)
        		strList.add(sArr);
        }*/
        /*for(String sAr:strList) {
        	System.out.println(sAr);
        }*/
        
        	
	}
}
