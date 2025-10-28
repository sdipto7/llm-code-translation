
import java.util.Scanner;

public class s895229833 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] hInput = scanner.nextLine().split(" ");
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(hInput[i]);
        }
        int countBest = 0;
        int countTmp = 0;
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

