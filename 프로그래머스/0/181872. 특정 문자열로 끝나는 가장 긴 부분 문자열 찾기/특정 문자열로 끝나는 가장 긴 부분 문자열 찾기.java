class Solution {
    public String solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder();
        for(int i = myString.length() - pat.length(); i >= 0; i--) {
            if(myString.substring(i, i + pat.length()).equals(pat)) {
                answer.append(myString.substring(0, i + pat.length()));
                break;
            }
        }
        return answer.toString();
    }
}