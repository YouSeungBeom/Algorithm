class Solution {
    public int solution(int a, int b) {
        int num1 = a;
        int num2 = b;
        
        while(num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        
        int num3 = b / num1;
        
        while(num3 % 2 == 0 || num3 % 5 == 0) {
            if(num3 % 2 == 0) {
                num3 /= 2;
            }
            if(num3 % 5 == 0) {
                num3 /= 5;
            }
        }
        
        return  num3 == 1 ? 1 : 2;
    }
}