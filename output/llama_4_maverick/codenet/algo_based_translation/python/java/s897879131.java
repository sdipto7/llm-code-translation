
import java.util.Scanner;

public class s897879131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int R = Integer.parseInt(input[0]);
        int G = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);
        int N = Integer.parseInt(input[3]);
        System.out.println(countColorCombinations(R, G, B, N));
    }

    public static int countColorCombinations(int R, int G, int B, int N) {
        int score = 0;
        for (int i = 0; i <= N / R; i++) {
            for (int j = 0; j <= (N - i * R) / G; j++) {
                if (N - i * R - j * G >= 0 && (N - i * R - j * G) % B == 0) {
                    score++;
                }
            }
        }
        return score;
    }
}

