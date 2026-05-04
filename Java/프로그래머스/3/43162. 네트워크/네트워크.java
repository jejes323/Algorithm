import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                bfs(computers, visited, i);
                answer++;
            }
        }
        return answer;
    }
    private void bfs(int[][] computers, boolean[] visited, int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = true;
        
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            for(int i = 0; i < computers.length; i++) {
                if(computers[cur][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}