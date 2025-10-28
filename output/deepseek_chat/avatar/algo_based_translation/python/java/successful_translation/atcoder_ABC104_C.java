
import java.util.Scanner;
import java.util.ArrayList;

public class atcoder_ABC104_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int G = scanner.nextInt();
        
        ArrayList<int[]> PC = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            int p = scanner.nextInt();
            int c = scanner.nextInt();
            PC.add(new int[]{p, c});
        }
        
        int ans = (int)1e9;
        
        for (int i = 0; i < (1 << D); i++) {
            int score = 0;
            int problem = 0;
            
            for (int j = 0; j < D; j++) {
                if (((i >> j) & 1) == 1) {
                    score += 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1];
                    problem += PC.get(j)[0];
                }
            }
            
            if (score > G) {
                continue;
            }
            
            int left = G - score;
            
            for (int j = 0; j < D; j++) {
                if (((i >> j) & 1) == 1) {
                    continue;
                }
                
                int fullScore = 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1];
                if (left > fullScore) {
                    continue;
                }
                
                int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                ans = Math.min(ans, problem + Math.min(tmp, PC.get(j)[0]));
            }
        }
        
        System.out.println(ans);
    }
}

