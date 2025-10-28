
import java.util.*;

public class atcoder_ABC104_C {

    public static int findMinimumProblems(int D, int G, List<int[]> PC) {
        int ans = (int) Math.pow(10, 9);

        for (int i = 0; i < (1 << D); i++) {
            int score = 0;
            int problem = 0;

            for (int j = 0; j < D; j++) {
                if ((i >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1];
                    problem += PC.get(j)[0];
                }
            }

            if (score > G) {
                continue;
            }

            int left = G - score;

            for (int j = 0; j < D; j++) {
                if ((i >> j & 1) == 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1]) {
                    continue;
                } else {
                    int tmp = (left + (100 * (j + 1)) - 1) / (100 * (j + 1));
                    ans = Math.min(ans, problem + Math.min(tmp, PC.get(j)[0]));
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int G = scanner.nextInt();

        List<int[]> PC = new ArrayList<>(D);
        for (int i = 0; i < D; i++) {
            int p = scanner.nextInt();
            int c = scanner.nextInt();
            PC.add(new int[]{p, c});
        }

        System.out.println(findMinimumProblems(D, G, PC));
    }
}

