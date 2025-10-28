
import java.util.*;

public class codeforces_272_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Read and discard the first line
        String[] line = scanner.nextLine().split(" ");
        List<Integer> sequence = new ArrayList<>();
        for (String s : line) {
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
                FXs.add(y);
            }
            storage.get(y).add(value);
        }
        
        int totalPairs = 0;
        int singlePairs = 0;
        
        for (int y : FXs) {
            int len = storage.get(y).size();
            totalPairs += len * len;
            singlePairs += len;
        }
        
        return (totalPairs - singlePairs) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}

