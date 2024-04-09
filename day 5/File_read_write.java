import java.io.*;
import java.util.*;
class File_read_write{
	public static void main(String[] args){
		try{
			File fp = new File("notepad.docx");
			FileWriter fw = new FileWriter("notepad.docx");
			if(fp.createNewFile()){
				System.out.println("File created: "+ fp.getName());
			}
			else{
				System.out.println("File already exist");
			}
			fw.write("Whats going on!!");
			fw.close();
			Scanner Reader = new Scanner(fp);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }	
            Reader.close();
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
	}
}