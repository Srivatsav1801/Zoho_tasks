import java.util.*;
class Selection_sort{
	public static void main(String[] args){
		int i,n,j,key,temp;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int[] array = new int[n];
		for(i=0;i<n;i++){
			array[i] = input.nextInt();			
		}
		for(i=1;i<n;i++){
			key = i;
			for(j= i+1;j<n;j++){
				if(array[j]<array[key]){
					key = j;
				}
			}
			temp = array[key];
			array[key] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}