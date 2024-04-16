import java.util.*;
class Matrix_rotate{
	public static void main(String[] args){
		int i,j,n,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Matrix size: ");
		n = sc.nextInt();
		int[][] matrix = new int[n][n];
		System.out.println("Enter the matrix elements:");
		for(i = 0;i<n;i++){
			for(j = 0;j<n;j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < n / 2; i++) {
			for (j = i; j < n - i - 1; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[n - j - 1][i];
				matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
				matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
				matrix[j][n - i - 1] = temp;
			}
		}
		for(i = 0;i<n;i++){
			for(j = 0;j<n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}