class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        int cards1Point = 0;
        int cards2Point = 0;
        String answer = "";
        
        for(int k = 0; k < goal.length; k++) {
            if(cards1Point <= cards1.length - 1 && goal[k].equals(cards1[cards1Point])) {
                cards1Point++;
            } else if(cards2Point <= cards2.length - 1 && goal[k].equals(cards2[cards2Point])) {
                cards2Point++;
            } else {
                answer = "No";
                break;
            }
            
            answer = "Yes";
        }
        
        return answer;
    }
}