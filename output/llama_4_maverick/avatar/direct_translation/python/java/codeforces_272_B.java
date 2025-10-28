
import java.util.*;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] sequence = scanner.nextLine().split(" ");
        System.out.println(nPairsWithCommonFX(Arrays.stream(sequence).mapToInt(Integer::parseInt).toArray()));
    }

    public static long nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> FXs = new ArrayList<>();
        for (int value : sequence) {
            int y = f(value);
            storage.computeIfAbsent(y, k -> new ArrayList<>()).add(value);
            if (!FXs.contains(y)) {
                FXs.add(y);
            }
        }
        long sum = 0;
        long count = 0;
        for (int y : FXs) {
            long len = storage.get(y).size();
            sum += len * len;
            count += len;
        }
        return (sum - count) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y += 1;
            }
            n /= 2;
        }
        return y;
    }
}

