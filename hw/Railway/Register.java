package Railway;
import java.util.*;
import java.io.*;
class Register{
	public static void account_register() throws IOException{
		Scanner sc = new Scanner(System.in);
		FileWriter Writer = null;
		FileWriter Writer_login = null;
		Writer = new FileWriter("Account_details.txt",true);
		Writer_login = new FileWriter("Login.txt",true);
		System.out.println("Account Registation:");
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		Writer.write("Name: "+ name);
		System.out.println("Enter your Phone no: ");
		int phone_no = sc.nextInt();
		Writer.write("\nPhone no: "+ String.valueOf(phone_no));
		System.out.println("The password should be of length 8 - 20 characters,1 special character,1 uppercase,1 lowercase,1 digit,no space");
		System.out.println("Enter your password:");
		String password = sc.nextLine();
		System.out.println("Re-enter your password:");
		String re_password = sc.nextLine();
		if(password.equals(re_password)){
			if (password != null) {
				String MIN_LENGTH = "8";
				String MAX_LENGTH = "20";
				boolean SPECIAL_CHAR_NEEDED = true;

				String ONE_DIGIT = "(?=.*[0-9])";
				String LOWER_CASE = "(?=.*[a-z])";
				String UPPER_CASE = "(?=.*[A-Z])";
				String SPECIAL_CHAR = SPECIAL_CHAR_NEEDED ? "(?=.*[@#$%^&+=])" : "";
				String NO_SPACE = "(?=\\S+$)";

				String MIN_MAX_CHAR = ".{" + MIN_LENGTH + "," + MAX_LENGTH + "}";
				String PATTERN = ONE_DIGIT + LOWER_CASE + UPPER_CASE + SPECIAL_CHAR + NO_SPACE + MIN_MAX_CHAR;

				if(password.matches(PATTERN)){
					System.out.println("Account created successfully!!");
					Writer.write("\nPassword: "+ password+"\n");
					Writer_login.write(phone_no+","+password+"\n");
				}
				else{
					System.out.println("password doesnt meet the requirement");
				}
				
			}
			
		}
		else{
			System.out.println("Password mismatch!");
			Writer.write("\nAccount creation error\n");
			return;
		}
		Writer.write("\n");
		Writer.close();
		Writer_login.close();
		return;
	}
}