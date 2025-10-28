
import java.util.*;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine().trim();
        String T = scanner.nextLine().trim();
        
        List<Integer> iList = new ArrayList<>();
        List<Integer> jList = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            if ((i * M) % N != 0) continue;
            int j = (i * M) / N;
            iList.add(i);
            jList.add(j);
        }
        
        boolean flag = true;
        for (int k = 0; k < iList.size(); k++) {
            int iVal = iList.get(k);
            int jVal = jList.get(k);
            if (S.charAt(iVal) != T.charAt(jVal)) {
                flag = false;
                break;
            }
        }
        
        if (flag) {
            int gcd = gcd(N, M);
            System.out.println((N * M) / gcd);
        } else {
            System.out.println(-1);
        }
    }
    
    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}

