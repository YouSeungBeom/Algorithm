class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for (int i = 0; i <= discount.length - 10; i++) {   // 회원가입 날짜
            boolean result = true;                          // 조건을 모두 충족하는지 확인하는 변수

            for (int j = 0; j < want.length; j++) {         // 원하는 물품 개수만큼 반복
                int count = 0;

                for (int k = i; k < i + 10; k++) {          // 회원가입 날짜부터 10일간 반복
                    if (want[j].equals(discount[k])) {      // 원하는 물품과 할인 제품이 일치한다면 count 증가
                        count++;
                    }
                }

                if (number[j] != count) {                   // 원하는 개수와 count가 일치하지 않으면 불가능(반복종료)
                    result = false;
                    break;
                }
            }

            if (result) {
                answer++;
            }
        }

        return answer;
    }
}