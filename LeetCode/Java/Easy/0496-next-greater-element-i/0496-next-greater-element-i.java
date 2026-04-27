import java.io.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<int[]> stack = new ArrayDeque<>();
        int[] tcase = new int[10001];

        for(int cur = 0; cur < nums2.length; cur++) {
            int w = nums2[cur];
            while(!stack.isEmpty() && stack.peek()[1] < w) {
                int[] prevInfo = stack.pop();
                int prev = prevInfo[1];
                tcase[prev] = w;
            }
            stack.push(new int[] {cur, w});
        }

        while(!stack.isEmpty()) {
            int[] prevInfo = stack.pop();
            int prev = prevInfo[1];
            tcase[prev] = -1;
        }

        int[] answer = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            int a = nums1[i];
            answer[i] = tcase[a];
        }
        return answer;
    }
}