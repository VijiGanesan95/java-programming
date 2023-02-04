package hackerrankprograms;
import java.util.*;
import java.io.*;

class solutionLoop{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int series=0;
            int midTerm=0;
            for(int j=0;j<n;j++){
                midTerm = midTerm+((int)(Math.pow(2, j))*b);
                series = a+midTerm;
                System.out.printf("%d ",series);  
            }
            System.out.printf("%n"); 
    }in.close();
}
}
