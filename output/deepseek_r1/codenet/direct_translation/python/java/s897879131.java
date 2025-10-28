
import java.util.Scanner;

public class s897879131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int score = 0;
        for (int i = 0; i <= N / R; i++) {
            int remaining = N - i * R;
            for (int j = 0; j <= remaining / G; j++) {
                int rem = remaining - j * G;
                if (rem >= 0 && rem % B == 0) {
                    score++;
                }
            }
        }
        System.out.println(score);
    }
}

