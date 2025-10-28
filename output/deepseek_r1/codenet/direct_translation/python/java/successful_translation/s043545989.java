
import java.util.*;

public class s043545989 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(freq.keySet());
        int size = keys.size();
        if (size == 3) {
            int xor = keys.get(0) ^ keys.get(1) ^ keys.get(2);
            boolean sameCounts = freq.get(keys.get(0)).equals(freq.get(keys.get(1))) && freq.get(keys.get(0)).equals(freq.get(keys.get(2)));
            if (xor == 0 && sameCounts) {
                System.out.println("Yes");
                return;
            }
        } else if (size == 2) {
            if (freq.containsKey(0)) {
                int countZero = freq.get(0);
                int otherKey = keys.get(0) == 0 ? keys.get(1) : keys.get(0);
                int countOther = freq.get(otherKey);
                if (countZero * 2 == countOther || countOther * 2 == countZero) {
                    System.out.println("Yes");
                    return;
                }
            }
        } else if (size == 1) {
            if (keys.get(0) == 0) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}

