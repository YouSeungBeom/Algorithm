class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int total_time = Integer.parseInt(video_len.split(":")[0]) * 60 + Integer.parseInt(video_len.split(":")[1]);
        int time = Integer.parseInt(pos.split(":")[0]) * 60 + Integer.parseInt(pos.split(":")[1]);
        int op_start_time = Integer.parseInt(op_start.split(":")[0]) * 60 + Integer.parseInt(op_start.split(":")[1]);
        int op_end_time = Integer.parseInt(op_end.split(":")[0]) * 60 + Integer.parseInt(op_end.split(":")[1]);
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
        return (time / 60 >= 10 ? Integer.toString(time / 60) : "0" + Integer.toString(time / 60)) + ":" + (time % 60 >= 10 ? Integer.toString(time % 60) : "0" + Integer.toString(time % 60));
    }
    
    static int op_skip(int t, int start, int end) {
        if(t >= start && t <= end) {
            return end;
        }
        return t;
    }
}