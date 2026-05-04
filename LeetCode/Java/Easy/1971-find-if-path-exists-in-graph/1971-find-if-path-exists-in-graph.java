class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        visited[source] = true;
        queue.add(source);

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            for(int nxt : graph.get(cur)) {
                if(!visited[nxt]) {
                    visited[nxt] = true;
                    queue.add(nxt);
                }
            }
        }

        return visited[destination];
    }
}