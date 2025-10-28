import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s146553386 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> a = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(scanner.nextInt());
            }
            a.add(row);
        }
        List<Integer> secondListReversed = new ArrayList<>(a.get(1));
        java.util.Collections.reverse(secondListReversed);

        int[] res_0 = new int[n];
        res_0[0] = a.get(0).get(0);
        for (int i = 1; i < n; i++) {
            res_0[i] = res_0[i - 1] + a.get(0).get(i);
        }

        int[] res_1 = new int[n];
        res_1[0] = secondListReversed.get(0);
        for (int i = 1; i < n; i++) {
            res_1[i] = res_1[i - 1] + secondListReversed.get(i);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int check = res_0[i] + res_1[n - 1 - i];
            if (check > ans) {
                ans = check;
            }
        }

        System.out.println(ans);
    }
}
