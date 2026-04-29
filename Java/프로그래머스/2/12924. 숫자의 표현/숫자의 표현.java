class Solution {
    public int solution(int n) {
        int answer = 0;
        int l = 1;
        int r = 1;
        int sum = 1;
        
        while(r <= n) {
            if (sum == n){
                sum -= l;
                l++;
                answer++;
            } else if(sum < n) {
                r++;
                sum += r;
            } else {
                sum -= l;
                l++;
            }
        }
        return answer;
    }
}