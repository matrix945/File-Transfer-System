import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
	
	
	//list and pick file 
	public static void listFilesForFolder() {
        
		String sentence = null;
		
        while(true){
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter a sentence:\t");
            sentence = scanner.nextLine();
            if(!sentence.equals("exit")){
            System.out.print("Folder location :");}
            
            System.out.println(sentence);
            File folder = new File(sentence);
            if(sentence.equals("exit")){
            	System.out.print("Program terminate");
            	System.exit(0);}
            
            if(folder.exists()){ break;}
            else{System.out.println("sorry do not "
            		+ "exist try again or \"exit\" ");}
        }
        
		File folder = new File(sentence);
		
		File[] listOfFiles = folder.listFiles();
		ArrayList<File> filelist = new ArrayList<File>(); 
		
		for (int i = 0; i < listOfFiles.length; i++) {
	        if (listOfFiles[i].isFile()) {
	        	filelist.add(listOfFiles[i]);
	        }
	      }
		
		for(int i =0;i<filelist.size();i++){
			System.out.print("[" + (i+1) + "]" + "\t");
			System.out.println(filelist.get(i).getName());
		}
		
		
		int choice = 0;
		do{
		try{
    	Scanner scanner2 = new Scanner(System.in);
    	System.out.print("Enter a number:\t");
    	choice = scanner2.nextInt();
    	if(choice> filelist.size()){ System.out.println("out of bounty");}
    	
    	
		} catch (Exception e){
			
			System.out.println (" Not a number; Please enter a number!");
			
		}}while (choice <= 0 || ( choice > filelist.size()));
		
		System.out.println("the file you selected is" + filelist.get(choice-1));
		

	    
	}

	
	
	public static void main(String [ ] args){
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}
	
	
	
	
	
	

}
