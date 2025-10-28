
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
            if (!storage.containsKey(y)) {
                storage.put(y, new ArrayList<>(Arrays.asList(value)));
                FXs.add(y);
            } else {
                storage.get(y).add(value);
            }
        }
        long sum1 = 0, sum2 = 0;
        for (int y : FXs) {
            int len = storage.get(y).size();
            sum1 += (long) len * len;
            sum2 += len;
        }
        return (sum1 - sum2) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if ((n & 1) == 1) {
                y++;
            }
            n >>= 1;
        }
        return y;
    }
}

