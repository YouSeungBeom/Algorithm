class Solution {
    public String solution(int a, int b) {
        String[] answer = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int day = b;
        
        for(int i = 1; i < a; i++) {
            if(i <= 7) {
                if(i % 2 == 1) {
                    day += 31;
                    System.out.println(day);
                    continue;
                }
                else {
                    if(i == 2) {
                        day += 29;
                        System.out.println(day);
                        continue;
                    }
                    else {
                        day += 30;
                        System.out.println(day);
                        continue;
                    }
                }
            }
            else if(i >= 8) {
                if(i % 2 == 1) {
                    day += 30;
                    System.out.println(day);
                    continue;
                }
                else {
                    day += 31;
                    System.out.println(day);
                    continue;
                }
            }
        }
        
        return answer[(day-1) % 7];
    }
}