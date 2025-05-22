import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int[] alphabat = new int[26];
        Arrays.fill(alphabat, -1);

        for(int i = 0; i < S.length(); i++) {
            if(alphabat[S.charAt(i) - 97] != -1) continue;
            alphabat[S.charAt(i) - 97] = i;
        }

        for(int i : alphabat) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}