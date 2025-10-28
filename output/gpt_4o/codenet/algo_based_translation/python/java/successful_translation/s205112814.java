
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s205112814 {

    public static int processGateConditions(int n, int m, List<int[]> gateConditions) {
        int maxUnderTh = Integer.MIN_VALUE;
        int minUpperTh = Integer.MAX_VALUE;

        for (int[] condition : gateConditions) {
            if (condition[0] > maxUnderTh) {
                maxUnderTh = condition[0];
            }
            if (condition[1] < minUpperTh) {
                minUpperTh = condition[1];
            }
        }

        if (minUpperTh - maxUnderTh >= 0) {
            return minUpperTh - maxUnderTh + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<int[]> gateConditions = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int lower = scanner.nextInt();
            int upper = scanner.nextInt();
            gateConditions.add(new int[]{lower, upper});
        }

        int result = processGateConditions(n, m, gateConditions);
        System.out.println(result);
    }
}

