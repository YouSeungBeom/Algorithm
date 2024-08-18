class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int R = 0, T = 0, C = 0, F = 0, J = 0, M = 0, A = 0, N = 0;
        
        for(int i = 0; i < survey.length; i++) {
            switch(survey[i].split("")[0]) {
                case "R" : 
                    if(choices[i] >= 4) {
                        T += choices[i] - 4;
                    }
                    else {
                        R += 4 - choices[i];
                    }
                    break;
                case "T" :
                    if(choices[i] >= 4) {
                        R += choices[i] - 4;
                    }
                    else {
                        T += 4 - choices[i];
                    }
                    break;
                case "C" : 
                    if(choices[i] >= 4) {
                        F += choices[i] - 4;
                    }
                    else {
                        C += 4 - choices[i];
                    }
                    break;
                case "F" :
                    if(choices[i] >= 4) {
                        C += choices[i] - 4;
                    }
                    else {
                        F += 4 - choices[i];
                    }
                    break;
                case "J" : 
                    if(choices[i] >= 4) {
                        M += choices[i] - 4;
                    }
                    else {
                        J += 4 - choices[i];
                    }
                    break;
                case "M" :
                    if(choices[i] >= 4) {
                        J += choices[i] - 4;
                    }
                    else {
                        M += 4 - choices[i];
                    }
                    break;
                case "A" : 
                    if(choices[i] >= 4) {
                        N += choices[i] - 4;
                    }
                    else {
                        A += 4 - choices[i];
                    }
                    break;
                case "N" :
                    if(choices[i] >= 4) {
                        A += choices[i] - 4;
                    }
                    else {
                        N += 4 - choices[i];
                    }
                    break;
            }
        }
        answer += R >= T ? "R" : "T";
        answer += C >= F ? "C" : "F";
        answer += J >= M ? "J" : "M";
        answer += A >= N ? "A" : "N";
        return answer;
    }
}