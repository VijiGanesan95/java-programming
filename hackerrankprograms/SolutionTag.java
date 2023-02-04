package hackerrankprograms;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SolutionTag {
	public static void main(String args[]) {/*
		//String regex = "^<([^>]+)>.*</\\1>$";
		//String regex="\\b<[^>]+>\\b";
		//Pattern p = Pattern.compile("<(.+)>.*</(.+)>");
		Pattern p = Pattern.compile("<([^>]+)>.*</\\1>");
		//Pattern p1 = Pattern.compile("^(?![<.*>]$|[</.*>]$).*");
		Scanner scan = new Scanner(System.in);
		String s =scan.nextLine();
		Matcher m = p.matcher(s);
		if(m.find()){
			System.out.println(m.group());
		}
		else
			System.out.println("None");*/


		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			Pattern p = Pattern.compile("<([^>]+)>([^<>]+)</\\1>");
            Matcher m = p.matcher(line);
            boolean match =false;
                while(m.find()) {
                	if(m.group(2).indexOf(">")==-1){
	                	System.out.println(m.group(2));
	                }else {
	                	line=m.group(2).substring(m.group().indexOf(">")+1, m.group(2).indexOf("</"));
	                	while(line.indexOf(">")!=-1) {
	                		line=line.substring(line.indexOf(">")+1);
	                	}
	                	System.out.println(line);	                	
	                }
                	match=true;
                }
                if(match==false)
                System.out.println("None");
			testCases--;
		}

		
	}
}
/*4
<SA premium>Imtiaz has a secret crush</SA premium>
Imtiaz has a secret crush
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
Sanjay has no watch
<Amee>safat codes like a ninja</amee
None
<SA premium>Imtiaz has a secret crush</SA premium>
Imtiaz has a secret crush*/
