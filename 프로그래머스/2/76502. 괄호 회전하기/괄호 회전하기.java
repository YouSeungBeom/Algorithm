class Solution {
    public int solution(String s) {
        int answer = 0;
        String tmp = s;
        
        for(int i = 0; i < s.length(); i++) {
            while(tmp.contains("()") || tmp.contains("{}") || tmp.contains("[]")) {
                tmp = tmp.replace("()", "");
                tmp = tmp.replace("[]", "");
                tmp = tmp.replace("{}", "");
            }
            if(tmp.equals("")) {
                answer++;
            }
            tmp = s.substring(i + 1, s.length()) + s.substring(0, i + 1);
        }
        return answer;
    }
}