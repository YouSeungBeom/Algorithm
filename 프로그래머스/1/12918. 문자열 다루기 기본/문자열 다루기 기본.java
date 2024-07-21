class Solution {
    public boolean solution(String s) {
        char[] ch = s.toCharArray();
        for(char c : ch) {
            if(!((c >= 48 && c <= 57) && (ch.length == 4 || ch.length == 6)))
                return false;
        }
        return true;
    }
}