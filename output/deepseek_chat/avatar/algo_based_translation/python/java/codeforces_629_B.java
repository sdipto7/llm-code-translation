
import java.util.Scanner;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];
        
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String x = parts[0];
            int a = Integer.parseInt(parts[1]);
            int b = Integer.parseInt(parts[2]) + 1;
            
            if (x.equals("M")) {
                m[a] += 2;
                m[b] -= 2;
            } else {
                f[a] += 2;
                f[b] -= 2;
            }
        }
        
        int aSum = 0;
        int bSum = 0;
        int c = 0;
        for (int i = 0; i < N; i++) {
            aSum += m[i];
            bSum += f[i];
            if (Math.min(aSum, bSum) > c) {
                c = Math.min(aSum, bSum);
            }
        }
        
        System.out.println(c);
    }
}

