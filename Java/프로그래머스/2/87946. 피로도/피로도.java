class Solution {
    int answer;
    public int solution(int k, int[][] dungeons) {
        int n = dungeons.length;
        boolean[] visited = new boolean[n];
        answer = 0;
        dfs(k, dungeons, 0, visited);
        return answer;
    }
    
    private void dfs(int k, int[][] dungeons, int count, boolean[] visited) {
        answer = Math.max(answer, count);
        for(int i = 0; i < dungeons.length; i++) {
            if(!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, count + 1, visited);
                visited[i] = false;
            }
        }
    }
}