
import java.util.*;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for (int x : arr) {
            if (x % k != 0 || !set.contains(x / k)) {
                set.add(x);
            }
            max = Math.max(max, set.size());
        }
        System.out.println(max);
    }
}

