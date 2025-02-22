import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int filter_column = getColumnIndex(ext);
        int sort_column = getColumnIndex(sort_by);
        
        List<int[]> answer = new ArrayList<>();
        
        for(int[] row : data) {
            if(row[filter_column] < val_ext) {
                answer.add(row);
            }
        }
        
        answer.sort(Comparator.comparingInt(a -> a[sort_column]));
        
        return answer.toArray(new int[0][]);
    }
    
    private int getColumnIndex (String key) {
        switch (key) {
            case "date" : return 1;
            case "maximum" : return 2;
            case "remain" : return 3;
            default : return 0;
        }
    }
}