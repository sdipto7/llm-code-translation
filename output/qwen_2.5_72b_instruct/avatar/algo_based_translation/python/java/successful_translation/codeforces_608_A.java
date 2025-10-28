import java.util.Scanner;

public class codeforces_608_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s = input.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int f = input.nextInt();
            int t = input.nextInt();
            int x = t - (s - f);
            if (x > c) {
                c = x;
            }
        }
        System.out.println(s + c);
    }
}
