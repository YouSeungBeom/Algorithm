import java.util.Arrays;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int count = 0;
        int x = 0;
        switch (ext) {
            case "date" : x = 1; break;                
            case "maximum" : x = 2; break;                
            case "remain" : x = 3; break;
        }
        
        for(int i = 0; i < data.length; i++) {
            if(data[i][x] >= val_ext) {
                data[i][x] = -1;
                continue;
            }
            count++;
        }
        
        int[][] answer = new int[count][4];
        
        int idx = 0;
        for(int i = 0; i < data.length; i++) {
            if(data[i][x] == -1) continue;
            for(int j = 0; j < 4; j++) {
                answer[idx][j] = data[i][j];
            }
            idx++;
        }
        
        switch (sort_by) {
            case "code" : 
                Arrays.sort(answer, (a, b) -> {
                    if(a[0] != b[0]) return Integer.compare(a[0], b[0]);
                    return Integer.compare(a[1], b[1]);
                });
                break;
                
            case "date" : 
                Arrays.sort(answer, (a, b) -> {
                    if(a[1] != b[1]) return Integer.compare(a[1], b[1]);
                    return Integer.compare(a[0], b[0]);
                });
                break;  
                
            case "maximum" :
                Arrays.sort(answer, (a, b) -> {
                    if(a[2] != b[2]) return Integer.compare(a[2], b[2]);
                    return Integer.compare(a[0], b[0]);
                });
                break;
                
            case "remain" : 
                Arrays.sort(answer, (a, b) -> {
                    if(a[3] != b[3]) return Integer.compare(a[3], b[3]);
                    return Integer.compare(a[0], b[0]);
                });
                break;
        }
        
        return answer;
    }
}