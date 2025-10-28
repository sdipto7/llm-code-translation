
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s225521100 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        List<Integer> groupSizes = new ArrayList<>();
        List<List<Integer>> groups = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            int d = scanner.nextInt();
            groupSizes.add(d);
            List<Integer> group = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                group.add(scanner.nextInt());
            }
            groups.add(group);
        }

        int result = calculateUnmarkedPositions(N, K, groupSizes, groups);
        System.out.println(result);
    }

    public static int calculateUnmarkedPositions(int N, int K, List<Integer> groupSizes, List<List<Integer>> groups) {
        int[] A = new int[N];

        for (int i = 0; i < K; i++) {
            int d = groupSizes.get(i);
            List<Integer> AA = groups.get(i);
            for (int j = 0; j < d; j++) {
                A[AA.get(j) - 1] = 1;
            }
        }

        int n = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                n++;
            }
        }
        return n;
    }
}

