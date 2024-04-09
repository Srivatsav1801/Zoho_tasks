import java.util.Scanner;

public class Array_size_check{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arrSize = scanner.nextInt();

        try {
            if (arrSize < 0) {
                throw new IllegalArgumentException("Array size cannot be negative");
            } 
			else {
                System.out.println("Array size " + arrSize + " is valid.");
            }
        }
		catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
