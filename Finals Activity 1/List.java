/*	Programmed By: David, John Cyrus L.
	Program Title: List.java
	Program Date: August 24, 2011 */

import java.io.*;

public class List {
	public static void main(String[] args)throws IOException{
		int list[]=new int[10];
		int i, num=0;
		String input="";
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for(i=0; i<10; i++) {
			list[i] = 0;
		}
		for(i=0; i<10; i++) {
			System.out.print("Input value for list["+i+"] = ");
			num = Integer.parseInt(in.readLine());
			list[i]=num;
		}
		for(i=0; i<10; i++){
			System.out.println("list["+i+"] = "+list[i]);
		}
	}
}
	