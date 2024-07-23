class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            int temp = 0;
            
            for(int j = 0; j < i; j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                }
            }
            if(answer[i] == 0) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}