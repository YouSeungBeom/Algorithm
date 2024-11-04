class Solution {
    public int solution(int[] num_list) {
        int add = 0, mul = 1;
        for(int i : num_list) {
            add += i;
            mul *= i;
        }
        return mul < add*add ? 1 : 0;
    }
}