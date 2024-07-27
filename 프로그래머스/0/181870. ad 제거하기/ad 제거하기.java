class Solution {
    public String[] solution(String[] strArr) {
        StringBuilder answer = new StringBuilder();
        for(String s : strArr) {
            if(!s.contains("ad")) {
                answer.append(s + " ");
            }
        }
        return answer.toString().split(" ");
    }
}