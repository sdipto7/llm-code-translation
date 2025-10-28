
import java.util.ArrayList;
import java.util.Scanner;

public class s269975433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        ArrayList<int[]> Q_group = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            int[] temp = new int[4];
            temp[0] = sc.nextInt();
            temp[1] = sc.nextInt();
            temp[2] = sc.nextInt();
            temp[3] = sc.nextInt();
            Q_group.add(temp);
        }
        int maxScore = 0;
        for (int[] p : generateCombinations(N, M)) {
            int tempScore = 0;
            for (int[] q : Q_group) {
                if (p[q[1] - 1] - p[q[0] - 1] == q[2]) {
                    tempScore += q[3];
                }
            }
            maxScore = Math.max(maxScore, tempScore);
        }
        System.out.println(maxScore);
    }

    private static ArrayList<int[]> generateCombinations(int N, int M) {
        ArrayList<int[]> result = new ArrayList<>();
        generateCombinationsHelper(N, M, 1, new int[N], 0, result);
        return result;
    }

    private static void generateCombinationsHelper(int N, int M, int start, int[] current, int index, ArrayList<int[]> result) {
        if (index == N) {
            result.add(current.clone());
            return;
        }
        for (int i = start; i <= M; i++) {
            current[index] = i;
            generateCombinationsHelper(N, M, i, current, index + 1, result);
        }
    }
}

