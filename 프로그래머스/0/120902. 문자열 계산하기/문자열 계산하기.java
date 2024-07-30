class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = 0;
        boolean flag = true;
        
        for (String s : str) {
            if (isNum(s)) {
                if (flag) {
                    answer += Integer.parseInt(s);
                } 
                else {
                    answer -= Integer.parseInt(s);
                }
            } else {
                if (s.equals("+")) {
                    flag = true;
                } 
                else {
                    flag = false;
                }
            }
        }
        return answer;
    }
    
    public static boolean isNum(String s) {
        return s != null && s.matches("-?\\d+");
    }
}