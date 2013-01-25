/*	Programmed by: David, John Cyrus L.
	Program Title: Quarter.java
	Program Date: June 26, 2011 */

import java.io.*;

public class Quarter2 {
	public static void main (String[] args)throws NumberFormatException, IOException{
		int day;
		String input="";
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input a number from 1 to 12: ");
		
		
		day = Integer.parseInt(input=in.readLine());
		
		if(day>=1 && day<=3){
			System.out.println("1st Quarter");
		}else
		if(day>=4 && day<=6){
			System.out.println("2nd Quarter");
		}else
		if(day>=7 && day<=9){
			System.out.println("3rd Quarter");
		}else
		if(day>=10 && day<=12){
			System.out.println("4th Quarter");
		}else{
			System.out.println("Error!");
		}
	}
}