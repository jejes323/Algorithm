class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return dfs(candidates, target, 0, 0, new ArrayList<>());
    }

    private List<List<Integer>> dfs(int[] candidates, int target, int sum, int start, List<Integer> curr) {
        List<List<Integer>> answer = new ArrayList<>();
        if(target == sum) {
            answer.add(new ArrayList<>(curr));
            return answer;
        }
        if (sum > target) return answer;
        for(int i = start; i < candidates.length; i++) {
            sum += candidates[i];
            curr.add(candidates[i]);
            answer.addAll(dfs(candidates, target, sum, i, curr));
            sum -= candidates[i];
            curr.remove(curr.size() - 1);
        }

        return answer;
    }
}