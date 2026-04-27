import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] nums = new int[tcase];
        for(int i = 0; i < tcase; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] answer = new int[tcase];
        Deque<int[]> stack = new ArrayDeque<>();
        for(int cur = 0; cur < nums.length; cur++) {
            int w = nums[cur];
            
            while(!stack.isEmpty() && stack.peek()[1] < w) {
                stack.pop();
            }
            
            if(stack.isEmpty()) {
                answer[cur] = 0;
            } else {
                answer[cur] = stack.peek()[0] + 1;
            }
            
            stack.push(new int[] {cur, w});
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tcase; i++) {
            sb.append(answer[i] + " "); 
        }
        System.out.println(sb);
    }
    
}