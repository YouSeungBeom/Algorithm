class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        int answer = 0;
        switch(str[1]) {
            case "+" :
                answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
                break;
            case "-" :
                answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
                break;
            case "*" :
                answer = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
                break;
        }
        return answer;
    }
}