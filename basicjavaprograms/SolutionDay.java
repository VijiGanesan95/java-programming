package basicjavaprograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.*;
import java.util.GregorianCalendar;

public class SolutionDay {
	public enum dayValue{
		SUNDAY(0,"SUNDAY"),MONDAY(1,"MONDAY"),TUESDAY(2,"TUESDAY"),WEDNESDAY(3,"WEDNESDAY"),THURSDAY(4,"THURSDAY"),FRIDAY(5,"FRIDAY"),SATURDAY(6,"SATURDAY");
		
		private final int value;
		private final String key;
		
		dayValue(int value,String key){
			this.value=value;
			this.key=key;
		}
		private int getValue() {
			return value;
		}
		
		private String getKey() {
			return key;
		}
	}
	public static void main(String args[]) {
		//BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);		
		//System.out.println(scan.nextLine());
		//String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		String[] str = scan.nextLine().split(" ");
		int month = Integer.parseInt(str[0]);
		int dayDate = Integer.parseInt(str[1]);
		int year = Integer.parseInt(str[2]);
		
	Map<Integer,String> calDay = new HashMap<Integer,String>();
    calDay.put(0,"SUNDAY");
    calDay.put(1,"MONDAY");
    calDay.put(2,"TUESDAY");
    calDay.put(3,"WEDNESDAY");
    calDay.put(4,"THURSDAY");
    calDay.put(5,"FRIDAY");
    calDay.put(6,"SATURDAY");
    Calendar cal = new GregorianCalendar(year,month-1,dayDate);
    int num = cal.getTime().getDay();
    System.out.println(num);
    //System.out.println(calDay.get(num));
	for (dayValue val:dayValue.values()) {
		if(num==val.getValue()) {
			System.out.println(val.getKey());
		}
	}
	}
}/*
Date dt = new Date();
dt.setDate(14);
dt.setMonth(0);
dt.setYear(89);
System.out.println(dt.getDay());*/
