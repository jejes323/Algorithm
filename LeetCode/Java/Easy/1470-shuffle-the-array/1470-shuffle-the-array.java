class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] num1 = new int[nums.length / 2];
        int[] num2 = new int[nums.length / 2];
        int[] answer = new int[nums.length];

        for(int i = 0 ; i < nums.length / 2; i++) {
            num1[i] = nums[i];
        }

        for(int i = nums.length / 2 ; i < nums.length; i++) {
            num2[i - n] = nums[i];
        }

        int idx = 0;
        for(int i = 0; i < nums.length / 2; i++) {
            answer[idx++] = num1[i];
            answer[idx++] = num2[i];
        }

        return answer;
    }

}