import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        
        return answer;
    }
    
    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        
        return a;
    }
    
    public int lcm(int a, int b) {
        return Math.abs(a / gcd(a, b) * b);
    }
}