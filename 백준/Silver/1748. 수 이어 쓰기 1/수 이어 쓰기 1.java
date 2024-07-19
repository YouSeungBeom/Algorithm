import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        // 각 자리수 별로 길이를 더하기
        // 최대 반복회수는 0의 개수
        
        int length = 0; // 이어붙인 수의 길이
        int digits = 1; // 각 수의 자리수
        int start = 1;	// 각 자리수의 맨 처음 수
        
        while (start <= n) {
            int end = start * 10 - 1; // 각 자리수의 마지막 수
            if (end >= n) { // 마지막 수가 n을 넘어갈 경우
                end = n;	// 마지막 수를 n으로 설정
            }
            length += (end - start + 1) * digits; 
            	// (end - start + 1) 각 자리수에 있는 수의 개수
            start *= 10; // 시작 자리수 올리기
            digits++; // 자리수 길이 증가
        }
        
        bw.write(Integer.toString(length));
        bw.flush();
        bw.close();
        br.close();
    }
}