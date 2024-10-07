class Solution {
    public int[] solution(String[] wallpaper) {
        String[][] area = new String[wallpaper.length][wallpaper[0].length()];
        
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[0].length(); j++) {
                area[i][j] = Character.toString(wallpaper[i].charAt(j));
            }
        }
        int S_x = Integer.MAX_VALUE, S_y = Integer.MAX_VALUE, E_x = 0, E_y = 0;
        
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[0].length(); j++) {
                if(area[i][j].equals("#")) {
                    if(S_x > i)
                        S_x = i;
                    if(S_y > j)
                        S_y = j;
                    if(E_x < i)
                        E_x = i;
                    if(E_y < j)
                        E_y = j;
                }
            }
        }
        int[] answer = {S_x, S_y, E_x + 1, E_y + 1};
        return answer;
    }
}