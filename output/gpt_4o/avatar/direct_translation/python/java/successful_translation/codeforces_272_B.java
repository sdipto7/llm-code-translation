
import java.util.*;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println(nPairsWithCommonFX(Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray()));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> FXs = new ArrayList<>();

        for (int value : sequence) {
            int y = f(value);
            if (!storage.containsKey(y)) {
                storage.put(y, new ArrayList<>(Collections.singletonList(value)));
                FXs.add(y);
            } else {
                storage.get(y).add(value);
            }
        }

        int sum = 0;
        for (int y : FXs) {
            sum += storage.get(y).size() * storage.get(y).size();
        }
        int total = 0;
        for (int y : FXs) {
            total += storage.get(y).size();
        }
        return (sum - total) / 2;
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

