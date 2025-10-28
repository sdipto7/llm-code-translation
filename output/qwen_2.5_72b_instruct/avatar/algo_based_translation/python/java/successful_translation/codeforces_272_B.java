import java.util.*;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        List<Integer> sequence = new ArrayList<>();
        for (String s : input) {
            sequence.add(Integer.parseInt(s));
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(List<Integer> sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> FXs = new ArrayList<>();
        for (int value : sequence) {
            int y = f(value);
            if (!storage.containsKey(y)) {
                storage.put(y, new ArrayList<>());
                storage.get(y).add(value);
                FXs.add(y);
            } else {
                storage.get(y).add(value);
            }
        }
        int result = 0;
        for (int y : FXs) {
            int size = storage.get(y).size();
            result += size * size - size;
        }
        return result / 2;
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
