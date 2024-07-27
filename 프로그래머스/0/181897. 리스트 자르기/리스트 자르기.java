import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0], b = slicer[1], c = slicer[2];
        switch(n) {
            case 1 : {
                int[] answer = Arrays.copyOfRange(num_list, 0, b + 1);
                return answer;
            }
            case 2 : {
                int[] answer = Arrays.copyOfRange(num_list, a, num_list.length);
                return answer;
            }
            case 3 : {
                int[] answer = Arrays.copyOfRange(num_list, a, b + 1);
                return answer;
            }
            case 4 : {
                int[] answer = new int[(b - a) / c + 1];
                for (int i = 0, idx = a; idx <= b; i++, idx += c) {
                    answer[i] = num_list[idx];
                }
                return answer;
            }
        }
        return new int[0];
    }
}