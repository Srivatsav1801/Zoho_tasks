import java.util.*;
class Pow_3{
	public static int pow3(int n){
		n = n/3;
		if (n == 3){
			return 1;
		}
		else if (n > 3){
			pow3(n/3);
		}
		else{
			return 0;
		}
		return 0;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = pow3(n);
		if(h == 0){
			System.out.println("false");
		}
		else{
			System.out.println("true");
		}
	}
	}