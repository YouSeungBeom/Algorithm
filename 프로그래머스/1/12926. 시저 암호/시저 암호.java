class Solution {
    public String solution(String s, int n) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) ((ch[i] - 'a' + n) % 26 + 'a');
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) ((ch[i] - 'A' + n) % 26 + 'A');
            }
        }
        return new String(ch);
    }
}