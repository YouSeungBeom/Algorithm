class Solution {
    public String solution(String s) {
        int[] charCount = new int[26];
        
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        StringBuilder answer = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            if (charCount[c - 'a'] == 1) {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}