import java.util.*;
public class Largest_subarray {
    public static void main(String[] args) {
		int n,i;
		Scanner input = new Scanner(System.in);
		n = input.nextInt(); 
		int[] nums = new int[n];
		for(i=0;i<n;i++){
			nums[i] = input.nextInt();			
		}
		/* nums = { 2, 5, 0, 2, 1, 4, 3, 6, 1, 0 }; */
        findLargestSubArray(nums);
    }

    public static void findLargestSubArray(int[] nums) {
        int maxLength = 0;
        int maxStart = -1;
        int maxEnd = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int[] subArray = new int[j - i + 1];
                for (int k = i; k <= j; k++) {
                    subArray[k - i] = nums[k];
                }
                if (isConsecutive(subArray) && subArray.length > maxLength) {
                    maxLength = subArray.length;
                    maxStart = i;
                    maxEnd = j;
                }
            }
        }

        System.out.println("The largest sub-array is [" + maxStart + ", " + maxEnd + "]");
        System.out.print("Elements of the sub-array: ");
        for (int i = maxStart; i <= maxEnd; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static boolean isConsecutive(int[] nums) {
        int min = findMin(nums);
        int max = findMax(nums);

        if (max - min + 1 != nums.length) {
            return false;
        }

        boolean[] visited = new boolean[nums.length];
        for (int num : nums) {
            if (num - min >= nums.length || visited[num - min]) {
                return false;
            }
            visited[num - min] = true;
        }

        return true;
    }

    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
