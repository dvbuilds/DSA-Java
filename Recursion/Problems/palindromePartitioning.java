import  java.util.*;

public class palindromePartitioning {
    public List<List<String>> palindromePartitioning (String s) {
        List<List<String>> result = new ArrayList<>();

        backtrack(s, result, new ArrayList<>(), 0);

        return result;
    }

    private void backtrack(String s, List<List<String>> result, List<String> current, int idx) {
        if(idx == s.length()) {
            result.add(new ArrayList<>(current));
        }

        for (int i = idx; i < s.length(); i++) {
            String sub = s.substring(idx, i+1);

            String rev = new StringBuilder(sub).reverse().toString();

            if(sub.equals(rev)) {
                current.add(sub);

                backtrack(s, result, current, i+1);

                current.remove(current.size() - 1);

            }


        }

    }

    public static void main(String[] args) {
        String s = "ball";

        palindromePartitioning obj = new palindromePartitioning();

        List<List<String>> result = obj.palindromePartitioning(s);

        for(List<String> list : result) {
            System.out.println(list);
        }
    }

}


