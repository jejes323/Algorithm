class Solution {
    public int solution(int n, int m, int[] section) {
        int paintCount = 0;
        int paintPoint = 0;
        
        for(int i = 0; i < section.length; i++) {
            if(section[i] > paintPoint) {
                paintCount++;
                paintPoint = section[i] + m - 1;
            }
        }
        
        return paintCount;
    }
}