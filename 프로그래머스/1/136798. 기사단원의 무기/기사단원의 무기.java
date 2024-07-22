class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] attack = new int[number];
        
        for(int i = 1; i <= number; i++) {
            int count = 0;
            int sqrt = (int) Math.sqrt(i);
            
            for (int j = 1; j <= sqrt; j++) {
                if (i % j == 0) {
                    if (j == i / j) {
                        count += 1;
                    } else {
                        count += 2;
                    }
                }
            }
            
            if(limit < count) {
                attack[i-1] = power;
            }
            else {
                attack[i-1] = count;
            }
        }
        for(int i : attack) {
            answer += i;
        }
        return answer;
    }
}