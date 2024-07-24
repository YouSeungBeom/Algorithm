class Solution {
    public String solution(String my_string, int s, int e) {
        String front = my_string.substring(0, s);
        StringBuilder middle = new StringBuilder(my_string.substring(s, e + 1));
        String back = my_string.substring(e + 1, my_string.length());
        middle.reverse();
        return front + middle + back;
    }
}