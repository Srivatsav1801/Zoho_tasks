import java.util.*;
class Image{
	
	public static void fill_color(int[][] grid,int i,int j,int color,int nc){
		if(i < 0||i>=grid.length||j<0||j>=grid[0].length){
			return;
		}
		if (grid[i][j] != nc) {
                return;
        }
        if (grid[i][j] == color) {
                return;
        }		
		grid[i][j] = color;
		fill_color(grid,i-1,j,color,nc);
		fill_color(grid,i,j-1,color,nc);
		fill_color(grid,i,j+1,color,nc);
		fill_color(grid,i+1,j,color,nc);
		
	}
	
	public static void main(String[] args){
		int i,j,n,m,sr,sc,color;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of grid elements n:");
		n = input.nextInt();
		System.out.println("Enter the no of grid elements m:");
		m = input.nextInt();
		int[][] grid = new int[n][m];
		System.out.println("Enter the grid color: ");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				grid[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter the sr value:");
		sr = input.nextInt();
		System.out.println("Enter the sc value:");
		sc = input.nextInt();
		System.out.println("Enter the color value:");
		color = input.nextInt();
		int nc= grid[sr][sc];
		fill_color(grid,sr,sc,color,nc);
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.println(grid[i][j]);
			}
		}
	}
}