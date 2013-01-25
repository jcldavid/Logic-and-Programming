/*	Programmed by: David, John Cyrus L.
	Program Title: PosNeg.java
	Program Date:  */
	
import java.io.*;

public class PosNeg {
	public static void main (String[] args){
	
		String number = "";
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.print("Input a number: ");
			number = in.readLine();
		} catch(IOException e){
			System.out.println("Error!");
		}
		
		int num = Integer.parseInt(number);
		
		if(num>0){
			System.out.println("The number "+number+" is POSITIVE");
		}else{
			System.out.println("The number "+number+" is NEGATIVE");
		}
	}
}