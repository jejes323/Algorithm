class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for(int i = 1; i <= n; i++) {
            nums[i-1] = i;
        }
        return dfs(nums, k, 0, new ArrayList<>());
    }
    private List<List<Integer>> dfs(int[] nums, int k, int start, List<Integer> curr) {
        List<List<Integer>> answer = new ArrayList<>();
        if(curr.size() == k) {
            answer.add(new ArrayList<>(curr));
            return answer;
        }
        for(int i = start; i < nums.length; i++) {
            if(!curr.contains(nums[i])) {
                curr.add(nums[i]);
                answer.addAll(dfs(nums, k, i+1, curr));
                curr.remove(curr.size() - 1);
            }
        }
        return answer;
    }
}