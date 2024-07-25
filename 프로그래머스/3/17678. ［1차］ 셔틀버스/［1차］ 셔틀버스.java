import java.util.*;

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        // timetable 배열을 분 단위의 정수 배열로 변환
        int[] crewtime = new int[timetable.length];
        for(int i = 0; i < timetable.length; i++) {
            int hour = Integer.parseInt(timetable[i].split(":")[0]);
            int minute = Integer.parseInt(timetable[i].split(":")[1]);
            crewtime[i] = hour * 60 + minute;
        }
        Arrays.sort(crewtime);
        
        int departure_time = 9 * 60;
        
        // 각 셔틀의 출발 시간을 저장할 배열
        int[] shuttle_time = new int[n];
        for(int i = 0; i < n; i++) {
            shuttle_time[i] = departure_time;
            departure_time += t;
        }
        
        int boarding_time = 0;
        int idx = 0;
        
        // 각 셔틀에 대해 탑승할 크루를 처리
        for(int i = 0; i < n; i++) {
            int seat = m;
            // 현재 셔틀 출발 시간까지 도착한 크루를 탑승시킴
            while(idx < crewtime.length && crewtime[idx] <= shuttle_time[i] && seat > 0) {
                idx++;
                seat--;
            }
            // 마지막 셔틀 처리 후 Con이 탑승 가능한 시간 계산
            if(i == n - 1) {
                if(seat > 0) {
                    // 마지막 셔틀에 좌석이 남아있다면 출발 시간으로 설정
                    boarding_time = shuttle_time[i];
                } else {
                    // 마지막 셔틀이 꽉 차서 탑승 가능한 가장 늦은 시간 계산
                    boarding_time = crewtime[idx - 1] - 1;
                }
            }
        }
        int hour = boarding_time / 60;
        int minute = boarding_time % 60;
        return String.format("%02d:%02d", hour, minute);
    }
}