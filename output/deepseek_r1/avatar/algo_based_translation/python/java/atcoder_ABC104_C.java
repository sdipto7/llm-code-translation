
import java.util.Scanner;

public class atcoder_ABC104_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int G = scanner.nextInt();
        int[][] PC = new int[D][2];
        for (int i = 0; i < D; i++) {
            PC[i][0] = scanner.nextInt();
            PC[i][1] = scanner.nextInt();
        }
        scanner.close();

        int ans = 1_000_000_000;

        for (int mask = 0; mask < (1 << D); mask++) {
            int totalScore = 0;
            int problemCount = 0;
            
            for (int j = 0; j < D; j++) {
                if ((mask & (1 << j)) != 0) {
                    totalScore += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problemCount += PC[j][0];
                }
            }
            
            if (totalScore > G) continue;
            
            int remaining = G - totalScore;
            if (remaining <= 0) {
                ans = Math.min(ans, problemCount);
            } else {
                for (int j = 0; j < D; j++) {
                    if ((mask & (1 << j)) != 0) continue;
                    
                    int fullScore = 100 * (j + 1) * PC[j][0] + PC[j][1];
                    if (remaining > fullScore) continue;
                    
                    int required = (remaining + 100 * (j + 1) - 1) / (100 * (j + 1));
                    ans = Math.min(ans, problemCount + Math.min(required, PC[j][0]));
                }
            }
        }
        
        System.out.println(ans);
    }
}

