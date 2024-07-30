class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char k_ch = (char) (k + 48);
        
        for(int a = i; a <= j; a++) {
            String a_str = Integer.toString(a);
            for(int b = 0; b < a_str.length(); b++) {
               if(a_str.charAt(b) == k_ch) answer++;
            }
        }
        
        return answer;
    }
}