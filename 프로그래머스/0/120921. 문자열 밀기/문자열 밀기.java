class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int n = A.length();
        boolean passible = false;
        
        for(int i = 0; i < n; i++) {
            if(A.equals(B)) {
                passible = true;
                break;
            }
            A = A.substring(n - 1, n) + A.substring(0, n - 1);
            answer++;
        }
        
        if(passible)
            return answer;
        return -1;
    }
}