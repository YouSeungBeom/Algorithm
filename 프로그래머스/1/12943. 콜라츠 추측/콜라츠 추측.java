class Solution {
    public int solution(int num) {
        if(num == 1)
            return 0;
        
        int count = 0;
        
        for(int i = 0; i < 500; i++) {
            if(num == 1) {
                return count;
            }
            if(num % 2 == 0) {
                num /= 2;
                count++;
            }
            else if(num % 2 == 1) {
                num = num * 3 + 1;
                count++;
            }
        }
        return -1;
    }
}