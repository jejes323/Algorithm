class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        boolean answer = true;

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        visited[0] = true;
        while(!queue.isEmpty()) {
            int cur = queue.remove();
            for(int nxt : rooms.get(cur)) {
                if(!visited[nxt]) {
                    queue.add(nxt);
                    visited[nxt] = true;
                }
            }
        }
        for(boolean isVisited : visited) {
            if(!isVisited) answer = false;
        }

        return answer;
    }
}