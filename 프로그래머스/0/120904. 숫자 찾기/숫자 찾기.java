class Solution {
    public int solution(int num, int k) {
        String numStr = Integer.toString(num);
        String kStr = Integer.toString(k);
        
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == kStr.charAt(0)) {
                return i + 1;
            }
        }
        return -1;
    }
}