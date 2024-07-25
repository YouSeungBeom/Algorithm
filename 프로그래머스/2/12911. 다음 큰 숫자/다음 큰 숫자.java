class Solution {
    public int solution(int n) {
        String s = Integer.toBinaryString(n);
        int one_count = s.length() - s.replace("1", "").length();
        boolean check = true;
        int answer = 0;
        int next = n+1;
        
        while(check) {
            String str = Integer.toBinaryString(next);
            int count = str.length() - str.replace("1", "").length();
            
            if(count == one_count) {
                answer = next;
                check = false;
            }
            next++;
        }
        
        return answer;
    }
}