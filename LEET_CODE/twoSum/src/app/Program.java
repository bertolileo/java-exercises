package app;

public class Program {

	public static void main(String[] args) {
		int[] nums = new int[4];
		nums[0] = 2;
		nums[1] = 5;
		nums[2] = 5;
		nums[3] = 11;
		
		int[] result = Program.twoSum(nums, 10);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		
	}

	public static int[] twoSum(int[] nums, int target) {
	    int[] arr = new int[2];
	    for (int i = 0; i < nums.length - 1; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            int sum = nums[i] + nums[j];
	            if (sum == target) {
	                arr[0] = i;
	                arr[1] = j;
	                return arr;
	            }
	        }
	    }

	    return arr;
	}


}
