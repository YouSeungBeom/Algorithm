class Solution {
    public int solution(int n) {
        int slicesPerPizza = 6;
        
        int a = slicesPerPizza;
        int b = n;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        
        int lcm = (slicesPerPizza * n) / gcd;
        
        int answer = lcm / slicesPerPizza;
        return answer;
    }
}