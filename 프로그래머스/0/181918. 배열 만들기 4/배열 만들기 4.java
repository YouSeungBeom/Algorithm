import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                i++;
            } 
            else {
                if (list.get(list.size() - 1) < arr[i]) {
                    list.add(arr[i]);
                    i++;
                } 
                else {
                    list.remove(list.size() - 1);
                }
            }
        }
        int[] stk = new int[list.size()];
        for(int a = 0; a < list.size(); a++) {
            stk[a] = list.get(a);
        }
        return stk;
    }
}