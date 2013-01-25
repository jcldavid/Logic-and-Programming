/*	Programmed by: David, John Cyrus L.
	Program Title: PerformArithmetic.java
	Program Date:  */
	
import java.io.*;

public class PerformArithmetic {
	public static void main (String[] args){
		String number1="";
		String number2="";
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.print("Enter first number: ");
			number1=input.readLine();
			
			System.out.print("Enter second number: ");
			number2=input.readLine();
		}catch(IOException e){
			System.out.println("Error!");
		}
		
		int first=Integer.parseInt(number1);
		int second=Integer.parseInt(number2);
		
		int sum=first+second;
		System.out.println("Sum = "+sum);
		
		int difference=first-second;
		System.out.println("Difference = "+difference);
		
		int Product=first*second;
		System.out.println("Product = "+Product);
		
		float Quotient=first/second;
		System.out.println("Quotient = "+Quotient);
		
		int Remainder=first%second;
		System.out.println("Remainder = "+Remainder);
	}
}