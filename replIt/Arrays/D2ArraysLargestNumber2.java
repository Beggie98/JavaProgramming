package Arrays;

import java.util.Arrays;

public class D2ArraysLargestNumber2 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{5,33,9}};

        int max = nums[0][0];

        for (int[] nums1D : nums) {
            for (int element : nums1D) {
                if (element > max){
                    max = element;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = max;
            }
        }

        System.out.println(Arrays.deepToString(nums));
    }
}
