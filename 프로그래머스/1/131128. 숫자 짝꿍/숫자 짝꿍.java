class Solution {
    public String solution(String X, String Y) {
        int[] K_x = new int[10];
        int[] K_y = new int[10];
        StringBuilder sb = new StringBuilder();
        
        for(char c : X.toCharArray()) {
            K_x[c - '0']++;
        }
        for(char c : Y.toCharArray()) {
            K_y[c - '0']++;
        }
        
        for(int i = 9; i >= 0; i--) {
            if(K_x[i] == 0 || K_y[i] == 0) 
                continue;
            for(int j = 0; j < Math.min(K_x[i], K_y[i]); j++) {
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "-1" : 
               sb.toString().charAt(0) == '0' ? "0" : sb.toString();
    }
}