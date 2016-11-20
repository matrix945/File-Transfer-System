import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.CREATE_NEW;
public class Copyfile {
	
	
	
	public static  void copyFile(File sourceFile, File destFile) throws IOException {
	    if(!destFile.exists()) {
	        destFile.createNewFile();
	    }

	    FileChannel source = null;
	    FileChannel destination = null;

	    try {
	        source = new FileInputStream(sourceFile).getChannel();
	        destination = new FileOutputStream(destFile).getChannel();
	        destination.transferFrom(source, 0, source.size());
	    }
	    finally {
	        if(source != null) {
	            source.close();
	        }
	        if(destination != null) {
	            destination.close();
	        }
	    }
	}
	
	  // put the path in the name to creat a file in taht directory append the dependecent as well
//	createFile("E:\\testtttt");
//	
//	File file = new File("D:\\test.txt");
//	File file2 = new File("E:\\testtttt");
//	copyFile(file,file2);

	
	  //TODO: new exception
	  public static void createFile(String filename) {
		  
//		  	String filename = "test";
		    File file = new File(filename);

		    if (file.exists()) {
//		      throw new FileAlreadyExistsException(filename + " already exists.");
		    }
		    
		    try {
		      file.createNewFile();
		    } catch (IOException e) {
//		      throw new AccessDeniedException("Insufficient permissions to create " + filename);
		    }
		    
		    // this is highly unlikely since we were able to create the file,
		    // but doesn't hurt to check.
		    if (!file.exists() || !file.canWrite()) {
		      file.delete();
//		      throw new AccessDeniedException("Insufficient permissions to write to " + filename);
		    }
		  }
	
	

	
	
	
	public static void main(String [ ] args) throws IOException{

		
		
		
		
		
		
	}
	
	
	

}
