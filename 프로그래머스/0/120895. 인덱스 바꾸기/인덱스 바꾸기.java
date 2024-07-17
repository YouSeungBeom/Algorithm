class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        String[] s = my_string.split("");
        String str = s[num1];
        s[num1] = s[num2];
        s[num2] = str;
        for(String a : s)
            answer.append(a);
        return answer.toString();
    }
}