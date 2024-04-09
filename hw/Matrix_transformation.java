import java.util.Arrays;
import java.util.Scanner;

public class Matrix_transformation {
    public static void main(String[] args) {
        int rows,cols,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows in the matrix");
        rows = sc.nextInt();
        System.out.println("Enter the no of cols in the matrix");
        cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements: ");
        for(i = 0;i<rows;i++){
            for (j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the new no of rows");
        int new_rows = sc.nextInt();
        System.out.println("Enter the new no of cols");
        int new_cols = sc.nextInt();
        if(rows*cols != new_rows*new_cols){
            System.out.println(Arrays.deepToString(matrix));
        }
        else{
            int result_row = 0, result_col = 0;
            int[][] result = new int[new_rows][new_cols];
            for(i = 0;i<rows;i++){
                for(j=0;j<cols;j++){
                    result[result_row][result_col] = matrix[i][j];
					result_col++;
                    if(result_col == new_cols){
                        result_col = 0;
                        result_row++;
                    }
                }
            }
            System.out.println(Arrays.deepToString(result));
        }

    }
}
