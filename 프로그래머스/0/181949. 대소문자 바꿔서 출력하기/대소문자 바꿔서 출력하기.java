import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length(); i++) {
            sb.append(Change(a.charAt(i)));
        }
        System.out.print(sb.toString());
    }
    
    private static char Change(char c) {
        if(97 <= c && c <= 122) {
            c = (char) (c - 32);
        }
        else if(65 <= c && c <= 90) {
            c = (char) (c + 32);
        }
        return c;
    }
}