import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int range = array.length / 2;
        
        int answer = array[range];
        return answer;
    }
}