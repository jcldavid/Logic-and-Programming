import java.io.*;
public class Test {
	public static void main(String[] args)throws IOException{
		int day;
		String input="";
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input a number from 1-12 corresponding to its month:");
		
		day=Integer.parseInt(input=in.readLine());
		
		if(day>=1&&day<=3){
			System.out.println("1st Quarter");
		}else
		if(day>=4&&day<=6){
			System.out.println("2nd Quarter");
		}else
		if(day>=7&&day<=9){
			System.out.println("3rd Quarter");
		}else
		if(day>=10&&day<=12){
			System.out.println("4th Quarter");
		}else{
			System.out.println("Error!");
		}
	}
}