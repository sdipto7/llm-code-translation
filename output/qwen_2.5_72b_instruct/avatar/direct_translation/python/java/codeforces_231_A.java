import java.util.Scanner;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += scanner.nextInt();
            }
            if (sum > 1) {
                c = c + 1;
            }
        }
        System.out.println(c);
    }
}
