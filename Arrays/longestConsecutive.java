import java.util.*;

public class longestConsecutive {
    public int longestConsecutiveSequence(int[] nums) {
        int count = 0;
        int maxCount = 0;
        int lastSmallest = Integer.MIN_VALUE;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] - 1 == lastSmallest) {
                count++;
                lastSmallest = nums[i];
            }
            else if(nums[i] != lastSmallest) {
                count = 1;
                lastSmallest = nums[1];
            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
}
