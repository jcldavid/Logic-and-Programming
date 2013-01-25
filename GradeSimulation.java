/*	Programmed by: David, John Cyrus L.
	Program Title: GradeSimulation.java
	Program Date:  */
	
import java.io.*;

public class GradeSimulation{
	public static void main(String[] args)throws IOException{
		String grade="";
		int number;
		BufferedReader gr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your grade: ");
		number=Integer.parseInt(gr.readLine());
		if(number>=95 && number<=99){
			System.out.print("1");
		}else
		if(number>=94 && number<=90){
			System.out.print("1.5");
		}else
		if(number>=85 && number<=89){
			System.out.print("2");
		}else
		if(number>=80 && number<=84){
			System.out.print("2.5");
		}else
		if(number>=75 && number<=79){
			System.out.print("3");
		}else
		if(number>=70 && number<=74){
			System.out.print("3.5");
		}else
		if(number<=69){
			System.out.print("4");
		}else{
			System.out.println("Error!");
		}
	}
}
		