import java.util.*;
class Sum_of_no_exception{
	public static void main(String[] args){
		try{
			Class.forName("Sum");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found: " + e.toString());
		}
		
	}
}