class Solution {
    public int[] solution(int[] arr) {
        int first = 0;
        int last = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                first = i;
                break;
            }
        }
        for(int i = first + 1; i < arr.length; i++) {
            if(arr[i] == 2) {
                last = i;
            }
        }
        if(first == 0 && last == 0) {
            int[] answer = {-1};
            return answer;
        } else if(last == 0) {
            int[] answer = {2};
            return answer;
        }
        int[] answer = new int[last - first + 1];
        int idx = 0;
        for(int i = first; i <= last; i++) {
            answer[idx] = arr[i];
            if(i != last)
                idx++;
        }
        return answer;
    }
}