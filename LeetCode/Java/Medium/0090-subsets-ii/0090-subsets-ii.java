import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        return dfs(nums, 0, new ArrayList<>(), visited);
    }
    private List<List<Integer>> dfs(int[] nums, int start, List<Integer> curr, boolean[] visited) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(curr));
        for(int i = start; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1] && !visited[i-1]) continue;
            if(visited[i]) continue;
            visited[i] = true;
            curr.add(nums[i]);
            answer.addAll(dfs(nums, i+1, curr, visited));
            visited[i] = false;
            curr.remove(curr.size() - 1);
        }
        return answer;
    }
}