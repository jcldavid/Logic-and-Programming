import javax.swing.*;

public class Number10 {
	public static void main(String[] args){
		String in="";
		int start=0, end=0, step=0;
		
		in=JOptionPane.showInputDialog("Enter starting number: ");
		start=Integer.parseInt(in);
		in=JOptionPane.showInputDialog("Enter ending number: ");
		end=Integer.parseInt(in);
		in=JOptionPane.showInputDialog("Enter step number: ");
		step=Integer.parseInt(in);
		
		
		if(start>=end){
			JOptionPane.showMessageDialog(null,"The starting number should be lesser than the ending number");
			System.exit(0);
		}else
		if(step<=0){
			JOptionPane.showMessageDialog(null,"The step number should always be greater than zero.");
			System.exit(0);
		}
		
		for(start=start;start<=end;start=start+step){
			System.out.println(start);
		}		
		
		System.out.println("Do you want to try again (Y/N)?");
	}
}