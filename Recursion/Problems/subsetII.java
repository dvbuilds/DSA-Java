import java.util.Arrays;
import java.util.*;

class subsetI {
    public List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); 
        backtrack(result, new ArrayList<>(), 0, nums);

        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int index, int[] nums) {
        
        result.add(new ArrayList<>(current));

        for(int i = index;i < nums.length; i++) {

            if(i > index && nums[i] == nums[i-1]) {
                continue;
            }
            current.add(nums[i]);

            backtrack(result, current, i+1, nums);

            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};

        subsetI obj = new subsetI();

        List<List<Integer>> result = obj.subset(nums);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}