class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();
        int[] answer = new int[temperatures.length];

        for(int cur = 0; cur < temperatures.length; cur++) {
            int w = temperatures[cur];

            while(!stack.isEmpty() && stack.peek()[1] < w) {
                int[] prevInfo = stack.pop();
                int prev = prevInfo[0];
                answer[prev] = cur - prev;
            }

            stack.push(new int[] {cur, w});
            
        }

        return answer;
    }
}