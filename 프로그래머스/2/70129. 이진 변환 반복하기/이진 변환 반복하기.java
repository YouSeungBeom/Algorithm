class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        answer[0] = 1;                                  // 처음은 0회차가 아닌 1회차
        
        while(!(s.equals("1"))) {
            int len = s.length();
            if(s.contains("0")) {
                s = s.replace("0", "");
                answer[1] += len - s.length();          // 처음 문자열에서 줄어든 길이만큼 0 제거
            } else {
                s = Integer.toBinaryString(s.length()); // 길이를 2진수 문자열로 변환
                answer[0]++;
            }
        }
        return answer;
    }
}