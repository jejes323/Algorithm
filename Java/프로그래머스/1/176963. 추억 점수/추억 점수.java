class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++) {
            // photo의 행
            for(int j = 0; j < photo[i].length; j++) {
                // photo의 열
                for(int k = 0; k < name.length; k++) {
                    // name
                    if (photo[i][j].equals(name[k])) {
                        if(yearning[k] != 0) {
                            answer[i] += yearning[k];
                        }
                    }
                }
            }
        }
            
        return answer;
    }
}