
import java.util.ArrayList;
import java.util.Scanner;

public class atcoder_ABC107_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            numbers.add(scanner.nextInt());
        }

        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        int zeroCount = 0;

        for (int num : numbers) {
            if (num == 0) {
                zeroCount++;
            } else if (num > 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        K -= zeroCount;
        if (K <= 0) {
            System.out.println(0);
            return;
        }

        int result = calculateMinDistance(K, positives, negatives);
        System.out.println(result);
    }

    private static int calculateMinDistance(int k, ArrayList<Integer> pos, ArrayList<Integer> neg) {
        int minDistance = Integer.MAX_VALUE;
        int positiveCount = pos.size();
        int negativeCount = neg.size();

        for (int j = 0; j <= k; j++) {
            int positiveSelection = j;
            int negativeSelection = k - j;

            if (positiveSelection > positiveCount || negativeSelection > negativeCount) {
                continue;
            }

            int positiveMax = (positiveSelection > 0) ? pos.get(positiveSelection - 1) : 0;
            int negativeMax = (negativeSelection > 0) ? neg.get(neg.size() - negativeSelection) : 0;

            int option1 = 2 * positiveMax + Math.abs(negativeMax);
            int option2 = positiveMax + 2 * Math.abs(negativeMax);
            minDistance = Math.min(minDistance, Math.min(option1, option2));
        }

        return minDistance;
    }
}

