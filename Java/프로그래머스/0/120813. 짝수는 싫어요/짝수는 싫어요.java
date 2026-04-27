class Solution {
    public int[] solution(int n) {
        int count = (n + 1) / 2;
        
        int answer[] = new int[count];
        
        int index = 0;
        for(int i = 1; i <= n; i += 2) {
            answer[index++] = i;
        }
        
        return answer;
    }
}