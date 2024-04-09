import java.util.*;
class BinaryAdd{
	public static void main(String[] args)
	{
		int carry = 0;
		Scanner input = new Scanner(System.in);
		String binary_num_1 = input.nextLine();
		String binary_num_2 = input.nextLine();
		int i = binary_num_1.length() - 1;
		int j = binary_num_2.length() - 1;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += binary_num_1.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += binary_num_2.charAt(j) - '0';
            }
            if (sum == 0 || sum == 1) {
                result.append(sum);
                carry = 0;
            }
            else if (sum == 2) {
                result.append("0");
                carry = 1;
            }
            else {
                result.append("1");
                carry = 1;
            }
            i--;
            j--;
        }
        if (carry == 1) {
            result.append("1");
        }
        System.out.println(result.reverse().toString());
	}
}