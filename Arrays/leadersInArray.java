import java.util.ArrayList;

public class leadersInArray {
    public static void leadersInArray(int[] nums) {
        int n = nums.length;
        int max = nums[n-1];
        
        ArrayList<Integer> leaders = new ArrayList<>();

        for (int i = n-1; i >= 0; i--) {
            if(nums[i] >= max) {
                leaders.add(nums[i]);
                max = nums[i];
            }
        }

        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.print(leaders.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 7, 1, 0};

        leadersInArray(nums);
    }
}
