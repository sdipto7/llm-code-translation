
import java.util.Scanner;

public class s897879131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int G = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        System.out.println(countCombinations(R, G, B, N));
    }

    private static int countCombinations(int R, int G, int B, int N) {
        int score = 0;
        int maxI = N / R;
        for (int i = 0; i <= maxI; i++) {
            int remainingAfterI = N - i * R;
            int maxJ = remainingAfterI / G;
            for (int j = 0; j <= maxJ; j++) {
                int remaining = remainingAfterI - j * G;
                if (remaining >= 0 && remaining % B == 0) {
                    score++;
                }
            }
        }
        return score;
    }
}

