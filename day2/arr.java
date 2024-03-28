import java.util.*;
class arr{
	public static void main(String[] args){
		int i ,j,flag=0,count =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of element in the array:");
		int n = input.nextInt();
		String[] str_array = new String[n+1];
		System.out.println("Enter the array elements");
		for(i = 0;i < n;i++){
			str_array[i] = input.nextLine();
		}
		System.out.println("Enter the pref:");
		String pref = input.nextLine();
		for(i=0;i<n;i++){
			if(str_array[i].charAt(0)==pref.charAt(0)){
				for(j=0;j<pref.length();j++){
					if(str_array[i+j].charAt(j) != pref.charAt(j)){
						flag = 1;
						break;
					}
				}
				if(flag != 1){
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}