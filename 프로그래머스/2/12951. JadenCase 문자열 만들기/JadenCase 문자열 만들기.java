class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder answer = new StringBuilder();
        
        if(48 <= s.charAt(0) && s.charAt(0) <= 57) {
            answer.append(s.charAt(0));
        } else {
            answer.append(Character.toUpperCase(s.charAt(0)));
        }
        
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) == ' ') {
                answer.append(Character.toUpperCase(s.charAt(i)));
            }
            else {
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }
}