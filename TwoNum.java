/*	Programmed by: David, John Cyrus L.
	Program Title: TwoNum.java
	Program Date:  */
	
import java.io.*;
public class TwoNum{
	public static void main(String[] args){
		int number;
		int number2;
		String input1="";
		String input2="";
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input a number: ");
		
		try{
			input1=in.readLine();
		}catch(IOException e){
			System.out.println("Error!");
		}
		
		number = Integer.parseInt(input1);
		
		System.out.println("Input a number: ");
		
		try{
			input2=in.readLine();
		}catch(IOException e){
			System.out.println("Error!");
		}
		
		number2 = Integer.parseInt(input2);
		
		if(number==number2)
		{
			System.out.println("EQUIVALENT");
		}
		if(number>number2)
		{
			System.out.println("GREATER THAN");
		}
		if(number<number2)
		{
			System.out.println("LESSER THAN");
		}
	}
}