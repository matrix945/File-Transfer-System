import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

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
	
	public static void main(String [ ] args) throws IOException{
		File file = new File("D:\\test.txt");
//		System.out.println(file.exists());
		File file2 = new File("E:\\c.txt");
		System.out.println(file2.exists());
		System.out.println(file2.getAbsolutePath());
		
		copyFile(file,file2);
//		 FileChannel destination = null;
//		 destination = new FileOutputStream(file2).getChannel();
		
		
		
		
		
		
	}
	
	
	

}
