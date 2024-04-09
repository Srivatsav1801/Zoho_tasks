import java.io.*;
import java.util.*;
class File_read_write{
	public static void main(String[] args){
		try{
			File fp = new File("c:\\java\\abc.txt");
			if(fp.createNewFile()){
				System.out.println("File created: "+ fp.getName()+" File exist: "+ fp.exists()+" Directory: "+ fp.isDirectory()+" File: "+fp.isFile()+" Absolute path: "+fp.getAbsolutePath());
			}
			else{
				System.out.println("File already exist");
			}
			
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
	}
}