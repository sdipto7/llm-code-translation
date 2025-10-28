
import java.util.*;
import java.util.stream.*;
import java.util.Collections;

public class s146553386 {

    public static int findMaxSum(int n, List<List<Integer>> a) {
        List<Integer> a0 = a.get(0);
        List<Integer> a1 = a.get(1);
        Collections.reverse(a1);

        int[] res_0 = new int[n];
        int[] res_1 = new int[n];

        res_0[0] = a0.get(0);
        res_1[0] = a1.get(0);

        for (int i = 1; i < n; i++) {
            res_0[i] = res_0[i - 1] + a0.get(i);
            res_1[i] = res_1[i - 1] + a1.get(i);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int check = res_0[i] + res_1[n - 1 - i];
            ans = Math.max(ans, check);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<List<Integer>> a = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            List<Integer> row = Arrays.stream(scanner.nextLine().split(" "))
                                      .map(Integer::parseInt)
                                      .collect(Collectors.toList());
            a.add(row);
        }

        int result = findMaxSum(n, a);
        System.out.println(result);
    }
}

