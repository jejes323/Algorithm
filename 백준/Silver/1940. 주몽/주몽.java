import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());
        int[] nums = new int[tcase];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < tcase; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(nums);
        int answer = 0;
        int l = 0;
        int r = nums.length - 1;
        while(l < r) {
            if(nums[l] + nums[r] < target) {
                l++;
            } else if (nums[l] + nums[r] > target) {
                r--;
            } else {
                answer++;
                l++;
            }
        }
        System.out.print(answer);
    }
}