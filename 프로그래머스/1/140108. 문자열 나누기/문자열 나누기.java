class Solution {
    public int solution(String s) {
        int answer = 0;
        int x = 0;
        int not_x = 0;
        int idx = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(idx);
            
            if(s.charAt(i) == c) {
                x++;
            }
            else {
                not_x++;
            }
            
            if(x == not_x) {
                idx = i + 1;
                answer++;
                x = 0;
                not_x = 0;
            }
        }
        if(x != 0) {
            answer++;
        }
        return answer;
    }
}