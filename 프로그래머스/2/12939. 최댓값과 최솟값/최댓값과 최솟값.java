class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] s_arr = s.split(" ");
        int m = Integer.parseInt(s_arr[0]);
        int M = Integer.parseInt(s_arr[0]);
        
        for(int i = 0; i < s_arr.length; i++) {
            if(m > Integer.parseInt(s_arr[i])) {
                m = Integer.parseInt(s_arr[i]);
            }
            if(M < Integer.parseInt(s_arr[i])) {
                M = Integer.parseInt(s_arr[i]);
            }
        }
        answer.append(m + " " + M);
        return answer.toString();
    }
}