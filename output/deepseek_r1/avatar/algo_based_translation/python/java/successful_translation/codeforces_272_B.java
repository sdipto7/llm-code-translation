
import java.util.*;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] parts = scanner.nextLine().split("\\s+");
        List<Integer> sequence = new ArrayList<>();
        for (String part : parts) {
            sequence.add(Integer.parseInt(part));
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    private static int nPairsWithCommonFX(List<Integer> sequence) {
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
        int sum1 = 0;
        int sum2 = 0;
        for (int y : FXs) {
            int size = storage.get(y).size();
            sum1 += size * size;
            sum2 += size;
        }
        return (sum1 - sum2) / 2;
    }

    private static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 == 1) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}

