import java.util.*;
class Solution {
    public int solution(int n) {
        int num = lcm(n, 6);
        int answer = num / 6;
        return answer;
    }
    
    public int gcd(int a, int b) {
        while (b != 0) {
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