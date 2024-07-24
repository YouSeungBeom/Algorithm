class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i < emergency.length; i++) {
            int m = emergency[i];
            for(int j = 0; j < answer.length; j++) {
                if(emergency[j] <= m) {
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}