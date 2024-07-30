class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(char c : my_string.toLowerCase().toCharArray()) {
            if(c >= 97 && c <= 122) {
                sb.append(" ");
            }
            else {
                sb.append(c);
            }
        }
        String[] s = sb.toString().split(" ");
        for(int i = 0; i < s.length; i++) {
            if(!s[i].isEmpty()) {
                answer += Integer.parseInt(s[i]);
            }
        }
        return answer;
    }
}