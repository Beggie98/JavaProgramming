package Methods;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};
        uniqueNumbers(nums);
    }

    public static void uniqueNumbers(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int each = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                int each1 = nums[j];
                if (each1 == each){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }
    }

}
