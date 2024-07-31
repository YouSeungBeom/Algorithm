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
        return a > 1 && b > 0 ? a + "x + " + b :
               a == 1 && b > 0 ? "x + " + b :
               a == 0 ? b + "" : 
               a == 1 ? "x" : a + "x";
    }
}