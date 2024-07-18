class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++) {
            String s = babbling[i];
            
            s = s.replace("aya", " ");
            s = s.replace("ye", " ");
            s = s.replace("woo", " ");
            s = s.replace("ma", " ");
            s = s.replace(" ", "");
            
            if(s.equals(""))
                answer++;
        }
        return answer;
    }
}