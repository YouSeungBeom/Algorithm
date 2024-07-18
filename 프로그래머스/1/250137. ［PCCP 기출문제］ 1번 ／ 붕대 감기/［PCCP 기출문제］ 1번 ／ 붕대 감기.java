class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        
        int hp = health;
        int time = 0;
        int idx = 0;
        int end = attacks[attacks.length - 1][0];
        
        for (int i = 1; i <= end; i++) {
            if (idx < attacks.length && i == attacks[idx][0]) {
                hp -= attacks[idx][1];
                if (hp <= 0) {
                    return -1;
                }
                time = i;
                idx++;
            } else {
                hp += x;
                if ((i - time) % t == 0) {
                    hp += y;
                }
                if (hp > health) {
                    hp = health;
                }
            }
        }
        return hp;
    }
}