
import java.util.Scanner;

public class s895229833 {
    public static int longestNonIncreasingSubsequenceLength(int N, int[] H) {
        int countBest = 0;
        int countTmp = 0;

        for (int i = 0; i < N - 1; i++) {
            if (H[i] >= H[i + 1]) {
                countTmp += 1;
            } else {
                if (countTmp > countBest) {
                    countBest = countTmp;
                }
                countTmp = 0;
            }
        }

        if (countTmp > countBest) {
            countBest = countTmp;
        }

        return countBest + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] H = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = scanner.nextInt();
        }

        System.out.println(longestNonIncreasingSubsequenceLength(N, H));
        scanner.close();
    }
}

