import java.util.*;

public class Closest_sum {
	public static void main(String[] args){
		int i,temp;
		Scanner sc = new Scanner(System.in);
		
		for(i = 0;i<n;i++){
			if(nums[i]<nums[i+1]){
				temp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = temp;
			}
		}
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(closestSum);
    }   
}
