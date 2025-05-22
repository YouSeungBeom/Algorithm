import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] baskets = new int[N + 1];

        for(int i = 0; i <= N; i++) {
            baskets[i] = i;
        }

        String line;

        for (int cnt = 0; cnt < M; cnt++) {
            line = br.readLine();
            int i = Integer.parseInt(line.split(" ")[0]);
            int j = Integer.parseInt(line.split(" ")[1]);

            while (i < j) {
                int temp = baskets[i];
                baskets[i] = baskets[j];
                baskets[j] = temp;
                i++;
                j--;
            }
        }

        for(int i = 1; i <= N; i++) {
            bw.write(baskets[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}