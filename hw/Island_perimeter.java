import java.util.Scanner;

public class Island_perimeter {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of rows in the array");
            int rows = sc.nextInt();
            System.out.println("Enter the size of cols in the array");
            int cols = sc.nextInt();
            int[][] area = new int[rows][cols];
            for (int i = 0 ; i < rows ; i++){
                for (int j = 0 ; j < cols; j++){
                    area[i][j] = sc.nextInt();
                    }
                }
            for(int i = 0 ; i < rows; i++){
                for (int j = 0 ; j < cols; j++){
                    if (area[i][j] == 1) {
                        System.out.println(getPerimeter(area,i,j));
                    }
                }
            }
        }

        public static int getPerimeter(int[][] area, int i, int j){
            if (i < 0 || i >= area.length || j < 0 || j >= area[0].length){
                return 1;
            }
            if (area[i][j] == 0) {
                return 1;
            }
            if (area[i][j] == -1) {
                return 0;
            }
            int count = 0;
            area[i][j] = -1;
            count += getPerimeter(area, i-1, j);
            count += getPerimeter(area, i, j-1);
            count += getPerimeter(area, i, j+1);
            count += getPerimeter(area, i+1, j);

            return count;

        }
}

