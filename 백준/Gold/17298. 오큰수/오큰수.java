import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] nums = new int[tcase];
        for(int i = 0 ; i < tcase; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        Deque<int[]> stack = new ArrayDeque<>();
        int[] answer = new int[tcase];
        
        for(int cur = 0 ; cur < nums.length; cur++) {
            int w = nums[cur];
            while(!stack.isEmpty() && stack.peek()[1] < w) {
                int[] prevInfo = stack.pop();
                int prev = prevInfo[0];
                answer[prev] = w;
            }
            stack.push(new int[] {cur, w});
            
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < answer.length; i++) {
            if(answer[i] == 0) sb.append(-1).append(" ");
            else sb.append(answer[i]).append(" ");
        }
        System.out.println(sb);
    }
    
}