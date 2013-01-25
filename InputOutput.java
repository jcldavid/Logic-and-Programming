/* Programmed by: David, John Cyrus L.
   Program Title: InputOutput.java
   Program Date: July 14, 2011 */

import java.io.*;

public class InputOutput {
	public static void main(String[] args) {
	String name="";

	BufferedReader input = new BufferedReader (
		new InputStreamReader (System.in));
	try {
		System.out.print("What's your name: ");
		name = input.readLine();
	}catch(IOException e) {
		System.out.println("Error");
	}

	System.out.println("Hello " + name);

	}
}