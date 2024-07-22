class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] count = new int[number + 1];
        
        // Calculate the number of divisors for each number from 1 to `number`
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        
        // Sum the appropriate values based on the number of divisors and the limit
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        
        return answer;
    }
}
