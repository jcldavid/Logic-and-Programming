import java.io.*;

public class Num10 {
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
				System.exit(0);
			}else
			if(step<=0){
				System.out.println("The step number should always be greater than zero.");
				System.exit(0);
			}
			
			for(start=start;start<=end;start=start+step){
				System.out.println(start);
			}		
		}while(answer.equalsIgnoreCase("y")	
			System.out.println("\nDo you want to try again (Y/N)?");
	}
}