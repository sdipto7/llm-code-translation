import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class s895229833 {
    public static int findLongestNonIncreasingSubsequenceLength(int N, List<Integer> heights) {
        int countBest = 0;
        int countTmp = 0;

        for (int i = 0; i < N - 1; i++) {
            if (heights.get(i) >= heights.get(i + 1)) {
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

        return countBest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> heights = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            heights.add(scanner.nextInt());
        }

        int result = findLongestNonIncreasingSubsequenceLength(N, heights);
        System.out.println(result);
    }
}
