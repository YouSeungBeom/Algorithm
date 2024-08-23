import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Set<Integer> set = new TreeSet<>();     // 차량번호 오름차순 저장 (중복 X)
        int n = records.length;
        int[][] arr = new int[n][3];
        
        // arr 배열에 분할저장
        for(int i = 0; i < n; i++) {
            String[] r = records[i].split(" ");
            
            // 시간을 분으로 변환해서 저장
            arr[i][0] = Integer.parseInt(r[0].split(":")[0]) * 60 + Integer.parseInt(r[0].split(":")[1]);
            arr[i][1] = Integer.parseInt(r[1]);
            set.add(arr[i][1]);
            arr[i][2] = r[2].equals("IN") ? 1 : 0;      // IN OUT 구분
        }
        
        int count = set.size();                         // 차량 개수
        int[] answer = new int[count];
        List<Integer> car_nums = new ArrayList<>(set);      // 인덱스를 이용해 set의 요소를 불러오기 위함.
        
        // 누적 주차 시간 계산
        for(int i = 0; i < count; i++) {
            int time = 0;                               // 누적 주차시간
            boolean IN = false;                         // 주차장에 차의 유무 판단
            
            for(int j = 0; j < n; j++) {
                if(car_nums.get(i) == arr[j][1]) {          // 차 번호가 같을 경우 (오름차순)
                    if(arr[j][2] == 1) {                // 입차한 경우
                        time -= arr[j][0];
                        IN = true;
                    }
                    else {                              // 출차한 경우
                        time += arr[j][0];
                        IN = false;
                    }
                    answer[i] = time;
                }
            }
            if(IN) {                                    // 입차는 했지만, 출차 기록이 없을 경우
                answer[i] += 1439;
            }
        }
        // 누적 시간을 토대로 요금 계산
        for(int i = 0; i < count; i++) {
            answer[i] -= fees[0];                       // 기본 시간 빼기
            if(answer[i] <= 0) {                        // 기본 시간 이하인 경우
                answer[i] = fees[1];
            }
            else {                                      // 기본 시간 초과한 경우
                if(answer[i] % fees[2] == 0) {
                    answer[i] = fees[1] + (answer[i] / fees[2]) * fees[3];
                }
                else {
                    answer[i] = fees[1] + (answer[i] / fees[2] + 1) * fees[3];
                }
            }
        }
        return answer;
    }
}