
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class s591424993 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int g = scanner.nextInt();
        int[][] pc = new int[d][2];
        
        for (int i = 0; i < d; i++) {
            pc[i][0] = scanner.nextInt();
            pc[i][1] = scanner.nextInt();
        }
        
        int ans = Integer.MAX_VALUE;
        
        for (int bit = 0; bit < (1 << d); bit++) {
            int count = 0;
            int sum = 0;
            Set<Integer> nokori = new HashSet<>();
            for (int i = 1; i <= d; i++) {
                nokori.add(i);
            }

            for (int i = 0; i < d; i++) {
                if ((bit & (1 << i)) != 0) {
                    sum += pc[i][0] * (i + 1) * 100 + pc[i][1];
                    count += pc[i][0];
                    nokori.remove(i + 1);
                }
            }
            
            if (sum < g) {
                int use = 0;
                for (int num : nokori) {
                    use = Math.max(use, num);
                }
                int n = Math.min(pc[use - 1][0], (int)Math.ceil((g - sum) / (double)(use * 100)));
                count += n;
                sum += n * use * 100;
            }
            
            if (sum >= g) {
                ans = Math.min(ans, count);
            }
        }
        
        System.out.println(ans);
    }
}

