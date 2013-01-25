/*	Programmed By: David, John Cyrus L.
	Program Title: Number10_while.java
	Program Date:	*/

import java.io.*;

public class Number10_while {
    public static void main(String[] args){
        String in="";
        int start=0, end=0, step=0;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		do{
			try{
				System.out.print("Input START value = ");
				in=input.readLine();
				start=Integer.parseInt(in);
				System.out.print("Input END value = ");
				in=input.readLine();
				end=Integer.parseInt(in);
				System.out.print("Input STEP value = ");
				in=input.readLine();
				step=Integer.parseInt(in);
			}catch(IOException e){
				System.out.println("Error!");
			}

			if(start>=end){
				System.out.println("The starting number should be lesser than the ending number");
			}else if(step<=0){
				System.out.println("The step number should always be greater than zero.");
			}

			while(start<=end){
				System.out.println(start);
				start=start+step;
			}

			try{
				while (!in.equalsIgnoreCase("y") && !in.equalsIgnoreCase("n")) {
					System.out.print("\nDo you want to try again (Y/N)?");
					in=input.readLine();
				}
			}catch(IOException e){
				System.out.println("Error!");
			}
		}while(in.equalsIgnoreCase("Y"));
        
    }
}