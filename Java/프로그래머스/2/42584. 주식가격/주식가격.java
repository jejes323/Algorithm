import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        
        Deque<int[]> stack = new ArrayDeque<>();
        for(int cur = 0; cur < n; cur++) {
            int w = prices[cur];
            while(!stack.isEmpty() && stack.peek()[1] > w) {
                int[] prevInfo = stack.pop();
                int prev = prevInfo[0];
                answer[prev] = cur - prev; 
            }
            stack.push(new int[] {cur, w});
        }
        
        while(!stack.isEmpty()) {
            int[] prevInfo = stack.pop();
            int prev = prevInfo[0];
            answer[prev] = n - prev - 1;
        }
        
        return answer;
    }
}