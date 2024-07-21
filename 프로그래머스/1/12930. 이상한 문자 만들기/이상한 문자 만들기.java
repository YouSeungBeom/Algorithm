class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean even = true;
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(c);
                even = true;
            } else {
                if (even) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                even = !even;
            }
        }
        
        return answer.toString();
    }
}