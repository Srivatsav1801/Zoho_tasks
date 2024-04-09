import java.io.*;
class File_up_de{
	public static void main(String[] args){
		File file = new File("notepad");
		File file2 = new File("world");
		file.renameTo(file2);
		System.out.println(file.getName());
		if (file.delete()) {
            System.out.println("The deleted file is : "+ file.getName());
        }
        else {
            System.out.println("Failed in deleting the file");
        }
	}
}