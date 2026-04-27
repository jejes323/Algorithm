class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n < 7) answer++;
        answer += n / 7;
        if(n > 7 && n % 7 != 0) answer++;
        
        return answer;
    }
}