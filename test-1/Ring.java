import java.util.*;
class Ring{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,n,count=0;
		System.out.println("Enter the no of elements in the array: ");
		n = sc.nextInt();
		String[] array = new String[n];
		System.out.println("Enter the elements in the array: ");
		for(i = 0;i<n;i++){
			array[i]=sc.next();
		}
		for(i=0;i<n-1;i++){
			int n1 = array[i].length()-1;
			if(array[i].charAt(n1)==array[i+1].charAt(0)){
				count++;
			}
		}
		if(count == 0){
			System.out.println("-1");
		}
		else{
			System.out.println(count+1);
		}
	}
}