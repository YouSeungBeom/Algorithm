import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> friendIndex = new HashMap<>();
        int[][] give_take = new int[n][n];
        int[] giving = new int[n];
        int[] received = new int[n];
        
        for (int i = 0; i < n; i++) {
            friendIndex.put(friends[i], i);
        }
        
        for (String gift : gifts) {
            String[] str = gift.split(" ");
            int giverIndex = friendIndex.get(str[0]);
            int receiverIndex = friendIndex.get(str[1]);
            give_take[giverIndex][receiverIndex]++;
            giving[giverIndex]++;
            received[receiverIndex]++;
        }
        
        int[] giftIndex = new int[n];
        for (int i = 0; i < n; i++) {
            giftIndex[i] = giving[i] - received[i];
        }
        
        int[] nextGifts = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (give_take[i][j] > 0 || give_take[j][i] > 0) {
                    if (give_take[i][j] > give_take[j][i]) {
                        nextGifts[i]++;
                    } else if (give_take[i][j] < give_take[j][i]) {
                        nextGifts[j]++;
                    } else {
                        if (giftIndex[i] > giftIndex[j]) {
                            nextGifts[i]++;
                        } else if (giftIndex[i] < giftIndex[j]) {
                            nextGifts[j]++;
                        }
                    }
                } else if (give_take[i][j] == give_take[j][i]) {
                    if (giftIndex[i] > giftIndex[j]) {
                        nextGifts[i]++;
                    } else if (giftIndex[i] < giftIndex[j]) {
                        nextGifts[j]++;
                    }
                }
            }
        }
        
        int maxGifts = 0;
        for (int giftsCount : nextGifts) {
            if (giftsCount > maxGifts) {
                maxGifts = giftsCount;
            }
        }
        
        return maxGifts;
    }
}