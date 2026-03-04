import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        int max = 0;
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        
        int left = 1;
        int right = max;
        int answer = 0;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            long count = 0;
            
            for(int i = 0; i < N; i++) {
                if(arr[i] - mid > 0) count += (arr[i] - mid);
            }
            
            if(count >= M) {
                answer = mid;
                left = mid + 1;
            }
            else right = mid - 1;
            
        }
            
        System.out.println(answer);
    }
}