class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int idx = 0; idx < queries.length; idx++) {
            for(int i = queries[idx][0]; i <= queries[idx][1]; i++) {
                if(i % queries[idx][2] == 0) {
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}