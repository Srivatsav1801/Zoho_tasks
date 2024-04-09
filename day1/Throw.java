import java.util.*;
public class Throw {    
    public static void validate_marks(int marks) {  
        if(marks<60) {  
            throw new ArithmeticException("Person has not passed the exam");    
        }  
        else {  
            System.out.println("Person has passed the exam! :"+marks);  
        }  
    }   
    public static void main(String args[]){  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks obtained: ");
        validate_marks(sc.nextInt());  
  }    
}    