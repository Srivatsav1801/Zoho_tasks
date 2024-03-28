import java.util.*;
class Matrix_diagonals{
	public static void main(String[] args){
		int i,j,n,sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the dimension of array: ");
		n = input.nextInt();
		int[][] array = new int[n][n];
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				array[i][j] = input.nextInt();
			}
		}
		for(i = 0; i<n;i++){
			for(j = 0;j<n;j++){
				if(i==j){
					sum+= array[i][j];
				}
				else if(i+j == n-1){
					sum+= array[i][j];
				}
				
			}
		}
		System.out.println("Sum="+sum);
	}
}