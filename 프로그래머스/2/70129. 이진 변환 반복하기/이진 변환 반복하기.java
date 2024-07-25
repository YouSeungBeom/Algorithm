class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        answer[0] = 1;                                  // 처음은 0회차가 아닌 1회차
        while(!(s.equals("1"))) {
            if(s.contains("0")) {
                s = s.replaceFirst("0", "");            // 0을 하나씩 제거해서 제거한 0의 개수 카운트
                answer[1]++;
            } else {
                s = Integer.toBinaryString(s.length()); // 길이를 2진수 문자열로 변환
                answer[0]++;
            }
        }
        return answer;
    }
}