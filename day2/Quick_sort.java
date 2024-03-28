import java.util.*;
class Quick_sort{
	int partition(int array[], int left, int right){
		int temp;
		int pivot = array[right];
		int i = (left - 1);
		for(int j = left;j<= right-1;j++){
			if(array[j]<pivot){
				i++;
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		temp = array[i+1];
		array[i+1] = array[right];
		array[right] = temp;
		return (i+1);
	}
	
	void quick(int array[], int left, int right){
		if (left<right){
			int p = partition(array,left,right);
			quick(array,left,p-1);
			quick(array,p+1,right);
		}
	}
	
	public static void main(String[] args){
		int i,n,j,key;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int[] array = new int[n];
		for(i=0;i<n;i++){
			array[i] = input.nextInt();			
		}
		Quick_sort qs = new Quick_sort();
		System.out.println("The sorted array: ");
		qs.quick(array,0,n-1);
		System.out.println(Arrays.toString(array));
	}
}