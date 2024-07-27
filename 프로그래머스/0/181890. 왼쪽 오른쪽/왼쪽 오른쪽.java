class Solution {
    public String[] solution(String[] str_list) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                for(int j = 0; j < i; j++) {
                    sb.append(str_list[j]);
                }
                break;
            }
            else if(str_list[i].equals("r")) {
                for(int j = i + 1; j < str_list.length; j++) {
                    sb.append(str_list[j]);
                }
                break;
            }
        }
        if(sb.length() == 0) {
            String[] answer = {};
            return answer;
        }
        String[] answer = sb.toString().split("");
        return answer;
    }
}