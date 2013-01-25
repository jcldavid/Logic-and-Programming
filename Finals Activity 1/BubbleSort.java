import javax.swing.*;
import java.util.Arrays;

public class BubbleSort{
	public static void main(String[] args){
		int a,b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the list: "));
		int list[] = new int[a];
		
		for(b=0; b<list.length; b++){
			list[b]=Integer.parseInt(JOptionPane.showInputDialog("Input a value for index "+b));
		}
		Arrays.sort(list);
		System.out.print("List: ");
		for(b=0; b<a; b++){
			System.out.print(list[b]+" ");
		}
	}
}