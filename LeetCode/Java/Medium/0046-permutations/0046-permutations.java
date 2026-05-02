class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int m = nums.length;
        return dfs(nums, new ArrayList<>(), m);
    }

    private List<List<Integer>> dfs(int[] nums, List<Integer> curr, int m) {
        List<List<Integer>> answer = new ArrayList<>();
        if(curr.size() == m) {
            answer.add(new ArrayList<>(curr));
            return answer;
        }
        for(int i = 0; i < nums.length; i++) {
            if(!curr.contains(nums[i])) {
                curr.add(nums[i]);
                answer.addAll(dfs(nums, curr, m));
                curr.remove(curr.size() - 1);
            }
        }
        
        return answer;
    }
}