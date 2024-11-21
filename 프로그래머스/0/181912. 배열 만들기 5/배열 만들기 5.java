class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        
        for(int i = 0; i < intStrs.length; i++) {
            int tmp = Integer.parseInt(intStrs[i].substring(s, s + l));
            
            if(tmp > k) {
                sb.append(Integer.toString(tmp) + " ");
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for(int i = 0; i < cnt; i++) {
            answer[i] = Integer.parseInt(sb.toString().split(" ")[i]);
        }
        return answer;
    }
}