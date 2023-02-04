package hackerrankprograms;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.regex.*;
/*Goodbye bye bye world world world
Sam went went to to to his business
Reya is is the the best player in eye eye game
in inthe
Hello hello Ab aB*/
public class SolutionRegex {
	public static void main(String args[]) {
		//String pattern ="^[a-zA-z\\s]{4}$";
		//String pattern = "^([a-zA-Z\\s]{2,7})?([a-zA-Z\\s]{2,5})?\\1([a-zA-Z\\s]{2,5})?\\2([a-zA-Z\\s]{0,})?(\\w{3})?\\3[a-zA-z]{0,}$";
		//String pattern ="\\b(\\w+)\\s+(\\1\\s*)+\\b";
		//([a-zA-Z]{0,})?\\s*--first parts
		//\\s*([a-zA-Z]{0,})?--last part


        //String regex = "\\b(\\w+)\\s+(\\1\\s*)+\\b";
        String regex ="\\b(\\w+)(\\s+\\1\\b)+";//to remove the duplucate words in a sentence
        //String regex="\\b[^(<.*>)]\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0),m.group(1)+" ");
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
		
	}
}
