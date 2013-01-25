/*	Programmed by: David, John Cyrus L.
	Program Title: Days.java
	Program Date: June 26, 2011 */

import java.io.*;

public class Days {
	public static void main (String[] args){
		int day;
		String input="";
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input a number from 1 to 7: ");
		
		try{
			input=in.readLine();
		}catch(IOException e){
			System.out.println("Error!");
		}
		
		day = Integer.parseInt(input);
		
		switch(day){
			case 1: System.out.println("The day is a Monday!"); break;
			case 2: System.out.println("The day is a Tuesday!"); break;
			case 3: System.out.println("The day is a Wednesday!"); break;
			case 4: System.out.println("The day is a Thursday!"); break;
			case 5: System.out.println("The day is a Friday!"); break;
			case 6: System.out.println("The day is a Saturday!"); break;
			case 7: System.out.println("The day is a Sunday!"); break;
		}
		System.out.println("Have a nice day.");
	}
}