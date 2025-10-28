
import java.util.*;

public class s787811177 {

    public static int computeScoreDifference(int n, List<int[]> rounds) {
        // Sort the list in descending order based on the sum of each sub-array
        rounds.sort((a, b) -> Integer.compare(b[0] + b[1], a[0] + a[1]));

        int taka = 0;
        int aoki = 0;

        // Iterate over the sorted list
        for (int i = 0; i < rounds.size(); i++) {
            if (i % 2 == 0) {
                taka += rounds.get(i)[0];
            } else {
                aoki += rounds.get(i)[1];
            }
        }

        // Return the difference between taka and aoki scores
        return taka - aoki;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rounds
        int n = scanner.nextInt();
        List<int[]> rounds = new ArrayList<>();

        // Read each round's score and store in the list
        for (int i = 0; i < n; i++) {
            int[] round = new int[2];
            round[0] = scanner.nextInt();
            round[1] = scanner.nextInt();
            rounds.add(round);
        }

        // Compute and print the score difference
        int result = computeScoreDifference(n, rounds);
        System.out.println(result);

        scanner.close();
    }
}

