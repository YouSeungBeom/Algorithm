class Solution {
    public String solution(int age) {
        char[] P_age = Integer.toString(age).toCharArray();
        for(int i = 0; i < P_age.length; i++) {
            P_age[i] = (char) (P_age[i] - '0' + 'a');
        }
        return new String(P_age);
    }
}