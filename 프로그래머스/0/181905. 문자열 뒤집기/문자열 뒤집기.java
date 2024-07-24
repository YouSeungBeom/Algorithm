class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder middle = new StringBuilder(my_string.substring(s, e + 1));
        middle.reverse();
        return my_string.substring(0, s) + middle + my_string.substring(e + 1, my_string.length());
    }
}