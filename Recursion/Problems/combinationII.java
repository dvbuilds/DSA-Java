import java.util.*;

public class combinationII {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(candidates, target, 0, result, new ArrayList<>(), 0);

        return result;
    }

    private void backtrack(int[] candidates, int target, int idx, List<List<Integer>> result, List<Integer> current,
            int sum) {
        if (sum == target) {
            result.add(new ArrayList<>(current));
        }

        if(sum > target) {
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] > candidates[i - 1]) {
                continue;
            }

            current.add(candidates[i]);

            backtrack(candidates, target, i+1 , result, current, sum + candidates[i]);

            current.remove(current.size() - 1);
        }

    }
}
