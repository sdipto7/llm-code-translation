
import java.util.*;

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
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> FXs = new ArrayList<>();
        
        for (int value : sequence) {
            int y = f(value);
            if (!storage.containsKey(y)) {
                List<Integer> list = new ArrayList<>();
                list.add(value);
                storage.put(y, list);
                FXs.add(y);
            } else {
                storage.get(y).add(value);
            }
        }
        
        int totalPairs = 0;
        int totalElements = 0;
        for (int y : FXs) {
            int size = storage.get(y).size();
            totalPairs += size * size;
            totalElements += size;
        }
        
        return (totalPairs - totalElements) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y++;
            }
            n = n / 2;
        }
        return y;
    }
}

