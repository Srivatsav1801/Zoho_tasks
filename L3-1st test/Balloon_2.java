import java.util.*;
class Balloons_2{
	public static void main(String[] args){
		int i,j,m,n,column,k,count = 0,old=0;
		boolean flag = true;
		String color = "";
		String choice = "Y";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		m = sc.nextInt();
		System.out.println("Enter the no of columns:");
		n = sc.nextInt();
		String[][] mat = new String[m][n];
		for(i = 0;i<m;i++){
			for(j = 0;j<n;j++){
				mat[i][j] = "-";
			}
		}
		while(choice.equals("Y")){
			System.out.println("Enter the column to throw the balloon:");
			column = sc.nextInt();
			if(column>=n){
				System.out.println("Column given is out of bounds");
				continue;
			}
			if(old != column){
				i = m-1;
			}
			System.out.println("Enter the color of the balloon:");
			color = sc.next();
			if(mat[i][column].equals("-")){
				mat[i][column] = color;
				old = column;
			}
			else{
				if(i-->0){
					mat[i][column] = color;
					System.out.println("i= "+ i);
				}
				else{
					
					break;
				}
			}
			for(j = 0;j<m;j++){
				for(k = 0;k<n;k++){
					System.out.print(mat[j][k]+ " ");
					if(mat[j][k].equals("-"))
					{
						count++;
					}
				}
				System.out.println();
			}
			i--;
			if(i<0){
				break;
			}
			i++;
			if(count == 0){
				break;
			}
			else{
				count = 0;
			}
			System.out.println("Do you wish to Continue(Y/N)");
			choice = sc.next();
		}
		
	}
}