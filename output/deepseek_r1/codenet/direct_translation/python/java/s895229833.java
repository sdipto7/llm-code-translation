
import java.util.Scanner;

public class s895229833 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] H = new int[N];
        String[] parts = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(parts[i]);
        }
        int countBest = 0, countTmp = 0;
        for (int i = 0; i < N - 1; i++) {
            if (H[i] >= H[i + 1]) {
                countTmp++;
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
        System.out.println(countBest);
    }
}

