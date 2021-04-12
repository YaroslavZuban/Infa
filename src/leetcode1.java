import java.util.ArrayList;
import java.util.Arrays;

class leetcode1 {
    public static void main(String[] args) {
        int[] array = {2,6,4,8,10,9,15};
        int mass = findUnsortedSubarray(array);
        System.out.println(mass);
    }

    public static int findUnsortedSubarray(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {

                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;

                }else{
                     
                }
            }
        }
        System.out.println(Arrays.toString(nums));

        return count;
    }
}
