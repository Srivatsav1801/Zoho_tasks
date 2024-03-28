import java.util.*;
class Binary_search{
	public static int bisearch(int array[],int left,int right,int target){
		while(left<=right){
			int mid = ((left+right)/2);
			if(array[mid] == target){
				return mid;
			}
			else if(array[mid]>target){
				right = mid - 1;			
			}
			else{
				left = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int i,j,n,target,temp,result = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of elements in the array: ");
		n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the array elements: ");
		for(i=0;i<n;i++){
			array[i]= input.nextInt();
		}
		for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
		System.out.println("Enter the target value: ");
		target = input.nextInt();	
		result = bisearch(array,0,n-1,target);
		if(result == -1){
			System.out.println("Target value was not found in the array");
		}
		else
		{
			System.out.println("Target is present in the array at the index:" + result);
		}
	}
}