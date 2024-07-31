class Solution {
    public String solution(String polynomial) {
        String[] str = polynomial.split(" \\+ ");
        int a = 0;
        int b = 0;
        for(int i = 0; i < str.length; i++) {
            if(str[i].contains("x")) {
                if(str[i].length() > 1) {
                    a += Integer.parseInt(str[i].replace("x", ""));
                }
                else {
                    a++;
                }
            }
            else {
                b += Integer.parseInt(str[i]);
            }
        }
        if (a == 1) {
            return b > 0 ? "x + " + b : "x";
        }
        else if (a == 0) {
            return b + "";
        }
        else if (a > 1) {
            return b > 0 ? a + "x + " + b : a + "x";
        }
        return a + "x";
    }
}