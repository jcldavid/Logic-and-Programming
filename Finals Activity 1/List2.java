/*	Programmed By: David, John Cyrus L.
	Program Title: List2.java
	Program Date: August 24, 2011 */

import javax.swing.*;

public class List2 {
	public static void main(String[] args) {
		int list1[]=new int[10];
		int list2[]=new int[10];
		int list3[]=new int[10];
		int i, num=0;
		
		
		System.out.print("List1: ");
		for(i=0; i<10; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Input value for list1["+i+"] = "));
			list1[i]=num;			
			System.out.print(list1[i]+" ");
		}
		System.out.print("\nList2: ");
		for(i=0; i<10; i++){
			num = Integer.parseInt(JOptionPane.showInputDialog("Input value for list2["+i+"] = "));
			list2[i]=num;			
			System.out.print(list2[i]+" ");
		}
		System.out.print("\nList3: ");
		for(i=0; i<10; i++){
			list3[i]=list1[i]+list2[i];
			System.out.print(list3[i]+" ");
		}
	}
}
	