import java.util.Scanner;

public class Hatch {
	
	public static void main(String [ ] args){
		
		
		int reloop = 0;
		do{
		try{
		int choice;
    	Scanner scanner2 = new Scanner(System.in);
    	System.out.print("Enter a number:\t");
    	choice = scanner2.nextInt();
    	reloop = choice;
		} catch (Exception e){
			
			System.out.println (" Not a number; Please enter a number!");
			
		}}while (reloop == 0);
		
		
		
		
		
	}
	
	

}
