class Solution {
    public int[] solution(String[] park, String[] routes) {
        char[][] area = new char[park.length][park[0].length()];
        int w_idx = 0;
        int h_idx = 0;
        // park를 area 2차원 배열에 기록. (좌표를 쉽게 추출하기 위함)
        for(int i = 0; i < park.length; i++) {
            for(int j = 0; j < park[i].length(); j++) {
                area[i][j] = park[i].charAt(j);
                if(park[i].charAt(j) == 'S') {
                    w_idx = j;
                    h_idx = i;
                }
            }
        }
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                System.out.print(area[i][j] + " ");
            }
            System.out.println();
        }
        // area의 가로 세로 길이 저장
        int W = park[0].length();
        int H = park.length;
        System.out.println("[" + h_idx + ", " + w_idx + "]");
        // 명령에 따른 움직임
        for(int i = 0; i < routes.length; i++) {
            boolean passable = true;
            String op = routes[i].split(" ")[0];
            int n = Integer.parseInt(routes[i].split(" ")[1]);
            System.out.println(op + " " + n);
            switch(op) {
                case "E" :
                    if(w_idx + n < W) {
                        for(int j = w_idx; j <= w_idx + n; j++) {
                            if(area[h_idx][j] == 'X') {
                                passable = false;
                                break;
                            }
                        }
                        if(passable) {
                            w_idx += n;
                        }
                    }
                    System.out.println("[" + h_idx + ", " + w_idx + "]");
                    break;
                case "W" :
                    if(w_idx - n >= 0) {
                        for(int j = w_idx; j >= w_idx - n; j--) {
                            if(area[h_idx][j] == 'X') {
                                passable = false;
                                break;
                            }
                        }
                        if(passable) {
                            w_idx -= n;
                        }
                    }
                    System.out.println("[" + h_idx + ", " + w_idx + "]");
                    break;
                case "S" :
                    if(h_idx + n < H) {
                        for(int j = h_idx; j <= h_idx + n; j++) {
                            if(area[j][w_idx] == 'X') {
                                passable = false;
                                break;
                            }
                        }
                        if(passable) {
                            h_idx += n;
                        }
                    }
                    System.out.println("[" + h_idx + ", " + w_idx + "]");
                    break;
                case "N" :
                    if(h_idx - n >= 0) {
                        for(int j = h_idx; j >= h_idx - n; j--) {
                            if(area[j][w_idx] == 'X') {
                                passable = false;
                                break;
                            }
                        }
                        if(passable) {
                            h_idx -= n;
                        }
                    }
                    System.out.println("[" + h_idx + ", " + w_idx + "]");
                    break;
            }
        }
        // answer에 대입
        int[] answer = {h_idx, w_idx};
        return answer;
    }
}