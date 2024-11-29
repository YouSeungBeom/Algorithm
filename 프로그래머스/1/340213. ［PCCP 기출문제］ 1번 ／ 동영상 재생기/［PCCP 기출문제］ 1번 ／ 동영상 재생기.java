class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int total_time = to_sec(video_len);
        int time = to_sec(pos);
        int op_start_time = to_sec(op_start);
        int op_end_time = to_sec(op_end);
        for(String s : commands) {
            switch(s) {
                case "prev" :
                    time = op_skip(time, op_start_time, op_end_time);
                    time -= 10;
                    if(time < 0)
                        time = 0;
                    break;
                case "next" :
                    time = op_skip(time, op_start_time, op_end_time);
                    time += 10;
                    if(time > total_time)
                        time = total_time;
                    break;
            }
            time = op_skip(time, op_start_time, op_end_time);
        }
        return result(time);
    }
    
    int op_skip(int t, int start, int end) {
        if(t >= start && t <= end) {
            return end;
        }
        return t;
    }
    
    int to_sec(String str) {
        String[] s = str.split(":");
        return Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
    }
    
    String result(int t) {
        return (t / 60 >= 10 ? Integer.toString(t / 60) : "0" + Integer.toString(t / 60)) + ":" + (t % 60 >= 10 ? Integer.toString(t % 60) : "0" + Integer.toString(t % 60));
    }
}