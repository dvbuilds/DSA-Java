
import java.util.*;

class combination {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), 0, candidates, target, 0);

        return result;
    }

    private void backtrack(List<List<Integer>> result,
                           List<Integer> current,
                           int index,
                           int[] candidates,
                           int target,
                           int sum) {

        if (sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (sum > target) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            current.add(candidates[i]);

            backtrack(result, current, i, candidates,
                      target, sum + candidates[i]);

            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 7, 9, 6, 3, 1};
        int target = 5;

        combination obj = new combination();

        List<List<Integer>> result = obj.combinationSum(candidates, target);

        System.out.println(result);
    }
}
