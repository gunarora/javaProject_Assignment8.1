
package javaProject_Assignment8; //Package declaration is mandatory
/*Write a program for file copy.
Note: Destination file should have same contents as Source file.*/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 

public class FileHandlingCopy {

	//Main method started
	  public static void main(String[] args) {
		  //declare variables
	      FileInputStream ins = null;
	      FileOutputStream outs = null;
		  //try catch- exception handling
	      try {
		      //path for input file
	         File infile =new File("C:\\Users\\tcs\\eclipse-workspace\\javaProject_Assignment8.1\\input.txt");
		      //path for output file
	         File outfile =new File("C:\\Users\\tcs\\eclipse-workspace\\javaProject_Assignment8.1\\output.txt");
		      //file streams
	         ins = new FileInputStream(infile);
	         outs = new FileOutputStream(outfile);
	         byte[] buffer = new byte[1024];
	         int length;
	         //logic to write file 
	         while ((length = ins.read(buffer)) > 0) {
	            outs.write(buffer, 0, length);
	         } 
		      //close 
	         ins.close();
	         outs.close();
		      //message - to save copy file
	         System.out.println("File copied successfully!!");
	      } 
		  //catch declared
		  catch(IOException ioe) {
	         ioe.printStackTrace();
	      } 
	   }
	}
