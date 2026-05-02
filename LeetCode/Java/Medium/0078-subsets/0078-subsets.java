import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return dfs(nums, 0, new ArrayList<>());
    }
    private List<List<Integer>> dfs(int[] nums, int start, List<Integer> curr) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(curr));
        for(int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            answer.addAll(dfs(nums, i+1, curr));
            curr.remove(curr.size() - 1);
        }
        return answer;
    }
}