import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[100001];
        for(int i = 0; i < strArr.length; i++) {
            arr[strArr[i].length()]++;
        }
        Arrays.sort(arr);
        
        return arr[100000];
    }
}