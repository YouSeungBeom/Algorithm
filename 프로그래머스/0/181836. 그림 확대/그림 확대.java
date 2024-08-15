class Solution {
    public String[] solution(String[] picture, int k) {
        StringBuilder sb = new StringBuilder();
        String[] answer = new String[picture.length * k];
        int idx = 0;
        
        for(int i = 0; i < picture.length; i++) {
            for(int j = 0; j < picture[i].length(); j++) {
                for(int a = 0; a < k; a++) {
                    sb.append(picture[i].charAt(j));
                }
            }
            for(int a = 0; a < k; a++) {
                answer[idx++] = sb.toString();
            }
            sb.setLength(0);
        }
        return answer;
    }
}