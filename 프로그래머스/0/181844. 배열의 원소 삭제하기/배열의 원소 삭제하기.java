class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] nums = new int[arr.length];
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    count++;
                    nums[i] = arr[i];
                }
            }
        }
        int[] answer = new int[arr.length - count];
        count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(nums[i] == 0) {
                answer[count++] = arr[i];
            }
        }
        return answer;
    }
}