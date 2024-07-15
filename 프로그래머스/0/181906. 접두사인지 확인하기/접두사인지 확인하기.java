class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] ms = my_string.split("");
        String[] ip = is_prefix.split("");
        
        if(ms.length < ip.length)
            return answer;
        
        for(int i = 0; i < ip.length; i++) {
            if(ms[i].equals(ip[i]))
                answer = 1;
            else {
                answer = 0;
                break;
            }
        }
        return answer;
    }
}