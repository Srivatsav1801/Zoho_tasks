import java.util.*;
class Insort{
	public static void main(String[] args){
		int i,n,j,key;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int[] array = new int[n];
		for(i=0;i<n;i++){
			array[i] = input.nextInt();			
		}
		for(i=1;i<n;i++){
			key = array[i];
			j = i-1;
			while(j>=0 && array[j]>key){
				array[j+1] = array[j];
				j = j - 1;
			}
			array[j+1]= key;
		}
		System.out.println(Arrays.toString(array));
	}
}