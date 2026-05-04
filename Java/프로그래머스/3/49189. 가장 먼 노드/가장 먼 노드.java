import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        List<List<Integer>> bfs = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            bfs.add(new ArrayList<>());
        }
        for(int[] e : edge) {
            bfs.get(e[0]).add(e[1]);
            bfs.get(e[1]).add(e[0]);
        }
        
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n + 1];
        int[] dict = new int[n + 1];
        queue.add(1);
        visited[1] = true;
        dict[1] = 0;
        
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            for(int nxt : bfs.get(cur)) {
                if(!visited[nxt]) {
                    visited[nxt] = true;
                    dict[nxt] = dict[cur] + 1;
                    queue.add(nxt);
                }
            }
        }
        
        int max = 0;
        for(int i = 1; i <= n; i++) {
            max = Math.max(max, dict[i]);
        }
        
        for(int i = 1; i <= n; i++) {
            if(dict[i] == max) {
                answer++;
            }
        }
        
        return answer;
    }
}