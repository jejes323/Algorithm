import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return dfs(candidates, target, 0, 0, new ArrayList<>());
    }

    private List<List<Integer>> dfs(int[] candidates, int target, int sum, int start, List<Integer> curr) {
        List<List<Integer>> answer = new ArrayList<>();
        if(sum == target) {
            answer.add(new ArrayList<>(curr));
            return answer;
        }
        if(sum > target) return answer;

        for(int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            curr.add(candidates[i]);
            answer.addAll(dfs(candidates, target, sum + candidates[i], i + 1, curr));
            curr.remove(curr.size() - 1);
        }

        return answer;
    }
}