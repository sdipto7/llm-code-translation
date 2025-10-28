
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        int[] sequence = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            sequence[i] = Integer.parseInt(input[i]);
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, java.util.List<Integer>> storage = new HashMap<>();
        java.util.List<Integer> FXs = new java.util.ArrayList<>();
        for (int value : sequence) {
            int y = f(value);
            if (!storage.containsKey(y)) {
                storage.put(y, new java.util.ArrayList<>());
                storage.get(y).add(value);
                FXs.add(y);
            } else {
                storage.get(y).add(value);
            }
        }
        int sum = 0;
        for (int y : FXs) {
            int size = storage.get(y).size();
            sum += size * size - size;
        }
        return sum / 2;
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

