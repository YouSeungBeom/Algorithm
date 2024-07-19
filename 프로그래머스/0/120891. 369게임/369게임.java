class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] nums = Integer.toString(order).split("");
        for(int i = 0; i < nums.length; i++) {
            if(Integer.parseInt(nums[i]) == 3 || Integer.parseInt(nums[i]) == 6 || Integer.parseInt(nums[i]) == 9)
                                answer++;
        }
        return answer;
    }
}