import java.util.*;
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int r = 0;
        int l = numbers.length - 1;
        int[] answer = new int[2];
        while(r < l) {
            if(numbers[r] + numbers[l] > target) {
                l--;
            } else if (numbers[r] + numbers[l] < target) {
                r++;
            } else if (numbers[r] + numbers[l] == target) {
                answer[0] = r + 1;
                answer[1] = l + 1;
                break;
            }
        }
        return answer;
    }
}