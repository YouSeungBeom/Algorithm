import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int[][] paper = new int[100][100];
		
		int n = stdin.nextInt();
		
		for(int i = 0; i < n; i++) {
			int x = stdin.nextInt();
			int y = stdin.nextInt();
			
			for(int j = x; j < x+10; j++) {
				for(int k = y; k < y+10; k++) {
					paper[j][k] = 1;
				}
			}
		}
		
		int area = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(paper[i][j] == 1) {
					area++;
				}
			}
		}
		System.out.print(area);
		stdin.close();
	}
}
