class Solution {
    public String[] solution(String[] quiz) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");
            int X = Integer.parseInt(s[0]);
            int Y = Integer.parseInt(s[2]);
            int Z = Integer.parseInt(s[4]);
            
            if(s[1].equals("+")) {
                if(X + Y == Z) {
                    sb.append("O");
                }
                else {
                    sb.append("X");
                }
            }
            else {
                if(X - Y == Z) {
                    sb.append("O");
                }
                else {
                    sb.append("X");
                }
            }
        }
        return sb.toString().split("");
    }
}