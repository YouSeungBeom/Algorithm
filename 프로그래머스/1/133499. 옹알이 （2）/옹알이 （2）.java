class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String s : babbling) {
            boolean overlap = false;
            
            s = s.replace("aya", "1");
            s = s.replace("ye", "2");
            s = s.replace("woo", "3");
            s = s.replace("ma", "4");
            
            for(int i = 0; i < s.length() - 1; i++) {
                if(s.charAt(i) == s.charAt(i + 1)) {
                    overlap = true;
                    break;
                }
            }
            if(overlap) continue;
            if(s.matches("\\d+")) answer++;
        }
        return answer;
    }
}