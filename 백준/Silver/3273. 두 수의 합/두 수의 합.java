import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int tcase = Integer.parseInt(br.readLine());
        int[] nums = new int[tcase];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < tcase; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        int target = Integer.parseInt(br.readLine());
        
        int answer = 0;
        Set<Integer> memo = new HashSet<>();
        for(int i = 0; i < tcase; i++) {
            if(memo.contains(target - nums[i])) {
                answer++;
            }
            memo.add(nums[i]);
        }
        
        System.out.print(answer);
    }
}