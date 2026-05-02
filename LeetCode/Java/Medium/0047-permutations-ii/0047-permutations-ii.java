import java.util.*;
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int m = nums.length;
        Arrays.sort(nums);
        boolean[] visited = new boolean[m];
        return dfs(nums, new ArrayList<>(), m, visited);
    }

    private List<List<Integer>> dfs(int[] nums, List<Integer> curr, int m, boolean[] visited) {
        List<List<Integer>> answer = new ArrayList<>();
        if(curr.size() == m) {
            answer.add(new ArrayList<>(curr));
            return answer;
        }
        for(int i = 0; i < nums.length; i++) {

            if(i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
            if(visited[i]) continue;

            visited[i] = true;
            curr.add(nums[i]);
            answer.addAll(dfs(nums, curr, m, visited));
            visited[i] = false;
            curr.remove(curr.size() - 1);
        }

        return answer;
    }
}