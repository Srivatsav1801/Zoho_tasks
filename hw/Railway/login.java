package Railway;
import java.util.*;
import java.io.*;
class Login{
	public static void logging_in() throws IOException{
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Account Registation:");
		System.out.println("Enter your Phone no: ");
		String phone_no = sc.nextLine();
		System.out.println("Enter your password:");
		String input_password = sc.nextLine();
		
		try(Scanner reader = new Scanner(new File("login.txt"))){
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				String[] parts = line.split(",");
				String username = parts[0];
				String password = parts[1];

				if (username.equals(phone_no) && password.equals(input_password)) {
					System.out.println("Login Successful!!");
					flag = 1;
				}
			}
		}catch(Exception e){
			System.out.println("No user found");
		}
		if(flag ==0){
			System.out.println("Login unsuccessful!!");
			return;
		}
	}
}