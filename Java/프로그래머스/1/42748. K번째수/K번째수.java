import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int m = 0; m < commands.length; m++) {
            int i = commands[m][0]; // 자르기 시작
            int j = commands[m][1]; // 자르기 종료
            int k = commands[m][2]; // 찾기
            
            int[] sliceArr = Arrays.copyOfRange(array, i-1, j);
            
            Arrays.sort(sliceArr);
            answer[m] = sliceArr[k - 1];
        }
        return answer;
    }
}