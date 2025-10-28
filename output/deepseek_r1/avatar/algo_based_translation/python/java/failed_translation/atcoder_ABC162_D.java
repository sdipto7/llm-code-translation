
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class atcoder_ABC162_D {
    private static final Set<String> PERMUTATIONS = new HashSet<>();
    static {
        PERMUTATIONS.add("RGB");
        PERMUTATIONS.add("RBG");
        PERMUTATIONS.add("BGR");
        PERMUTATIONS.add("BRG");
        PERMUTATIONS.add("GBR");
        PERMUTATIONS.add("GRB");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        calculate(N, S);
        scanner.close();
    }

    private static void calculate(int n, String s) {
        char[] arr = s.toCharArray();
        int rCount = 0, gCount = 0, bCount = 0;

        for (char c : arr) {
            if (c == 'R') {
                rCount++;
            } else if (c == 'G') {
                gCount++;
            } else if (c == 'B') {
                bCount++;
            }
        }

        int invalidCount = 0;
        int maxStep = (n + 1) / 2;

        for (int step = 1; step <= maxStep; step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String triplet = "" + arr[i] + arr[i + step] + arr[i + 2 * step];
                if (PERMUTATIONS.contains(triplet)) {
                    invalidCount++;
                }
            }
        }

        System.out.println(rCount * gCount * bCount - invalidCount);
    }
}

