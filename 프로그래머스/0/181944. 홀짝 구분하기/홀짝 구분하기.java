import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = n % 2 == 1 ? " is odd" : " is even";
        System.out.print(n + answer);
    }
}