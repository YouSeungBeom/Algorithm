class Solution {
    public String solution(String s) {
        String[] str = s.split(" ", -1);
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < str.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < str[i].length(); j++) {
                if (j % 2 == 0) {
                    sb.append(Character.toUpperCase(str[i].charAt(j)));
                } else {
                    sb.append(Character.toLowerCase(str[i].charAt(j)));
                }
            }
            answer.append(sb);
            if (i < str.length - 1) {
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}