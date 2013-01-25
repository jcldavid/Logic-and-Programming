/*	Programmed By: David, John Cyrus L.
	Program Title: List2_found.java
	Program Date: August 24, 2011 */

import javax.swing.*;

public class List2_found {
	public static void main(String[] args) {
		int list1[]=new int[10];
		int list2[]=new int[10];
		int list3[]=new int[10];
		int i, num=0, b=0, c=0, d=1;
		Boolean found = false;
		Boolean located = false;
		
		
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
		System.out.println();
		int search = Integer.parseInt(JOptionPane.showInputDialog("Input a value to search in List3: "));
		for(i=0; i<10; i++){
			if(list3[i]==search){
				found = true;
				b++;
			}
		}
		if(found==true){
			System.out.println("\nThe value "+search+" is in List3!");
			System.out.println("There are "+b+" of it in List3.");
			System.out.print("Located at: ");
		}
		for(i=0; i<10; i++){
			if(list3[i]==search){
				if(d<b){
					System.out.print("List3["+c+"], ");
				}else{
					System.out.print("List3["+c+"]");
				}
				d++;
			}
			c++;
		}
	}
}
	