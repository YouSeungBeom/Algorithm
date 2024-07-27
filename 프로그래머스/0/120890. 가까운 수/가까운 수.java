import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int[] arr = Arrays.copyOf(array, array.length);
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i] - n);
        }
        Arrays.sort(arr);
        boolean a = false;
        for(int i : array) {
            if(i == n - arr[0]) {
                a = true;
            }
        }
        return a ? n - arr[0] : n + arr[0];
    }
}