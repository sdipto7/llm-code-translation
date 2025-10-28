
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class atcoder_ABC150_C {

    public static void main(String[] args) {
        calculatePermutationDistance();
    }

    public static void calculatePermutationDistance() {
        Scanner scanner = new Scanner(System.in);

        // Input the integer n
        int n = Integer.parseInt(scanner.nextLine());

        // Generate all permutations of the list [1, 2, ..., n]
        List<int[]> orig = new ArrayList<>();
        permute(orig, new int[n], 0, n);

        // Input the permutation p
        int[] p = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        // Input the permutation q
        int[] q = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        // Find the index of permutation p in the list orig
        int pn = findIndex(orig, p);

        // Find the index of permutation q in the list orig
        int qn = findIndex(orig, q);

        // Calculate the absolute difference and print the result
        System.out.println(Math.abs(pn - qn));

        scanner.close();
    }

    private static void permute(List<int[]> orig, int[] current, int index, int n) {
        if (index == n) {
            orig.add(current.clone());
            return;
        }
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (current[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                current[index] = i;
                permute(orig, current, index + 1, n);
            }
        }
    }

    private static int findIndex(List<int[]> orig, int[] perm) {
        for (int i = 0; i < orig.size(); i++) {
            if (Arrays.equals(orig.get(i), perm)) {
                return i;
            }
        }
        return -1; // This should not occur for valid input
    }
}

