/*	Programmed by: David, John Cyrus L.
	Program Title: Quarter.java
	Program Date: June 26, 2011 */

import java.io.*;

public class A {
	public static void main (String[] args){
		String a="";
		String input="";
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input a number from 1 to 12: ");
		
		a=(input=in.readLine());
		
		switch("a"){
			case "a": System.out.println("1st Quarter"); break;
			case "b":case 5:case 6: System.out.println("2nd Quarter"); break;
			
			default: System.out.println("Error!");
		}
	}
}