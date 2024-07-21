class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int p_len = p.length();
        for(int i = 0; i <= t.length() - p.length(); i++) {
            String sub = t.substring(i, i + p_len);
            if(sub.compareTo(p) <= 0)
                answer++;
        }
        return answer;
    }
}