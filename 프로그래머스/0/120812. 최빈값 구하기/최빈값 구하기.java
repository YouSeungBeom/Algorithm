import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);

        int count = 1;
        int current = 1;
        int mode = array[0];
        boolean multipleModes = false;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                current++;
            } 
            else {
                current = 1;
            }

            if (current > count) {
                count = current;
                mode = array[i];
                multipleModes = false;
            } 
            else if (current == count) {
                multipleModes = true;
            }
        }

        return multipleModes ? -1 : mode;
    }
}