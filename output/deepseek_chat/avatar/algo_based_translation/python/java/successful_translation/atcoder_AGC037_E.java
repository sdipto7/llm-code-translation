
import java.util.Scanner;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();
        boolean aaaa = false;
        
        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }
        
        if (aaaa) {
            char minChar = S.charAt(0);
            for (int i = 1; i < S.length(); i++) {
                if (S.charAt(i) < minChar) {
                    minChar = S.charAt(i);
                }
            }
            System.out.println(String.valueOf(minChar).repeat(N));
            return;
        }
        
        S = getLastDict(S, N);
        
        if (K == 1) {
            System.out.println(S);
        } else {
            int count = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == S.charAt(0)) {
                    count++;
                } else {
                    break;
                }
            }
            
            if (count * Math.pow(2, K - 1) >= N) {
                System.out.println(String.valueOf(S.charAt(0)).repeat(N));
            } else {
                int repeatCount = count * ((int)Math.pow(2, K - 1) - 1);
                S = String.valueOf(S.charAt(0)).repeat(repeatCount) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }
    
    private static String getLastDict(String sStr, int N) {
        String U = sStr + new StringBuilder(sStr).reverse().toString();
        char c = sStr.charAt(0);
        for (int i = 1; i < sStr.length(); i++) {
            if (sStr.charAt(i) < c) {
                c = sStr.charAt(i);
            }
        }
        
        int p = U.indexOf(c);
        int minindex = p;
        p++;
        
        while (p <= N) {
            if (U.charAt(p) == c) {
                if (checkNormalDict(U, minindex, p, N)) {
                    minindex = p;
                }
            }
            p++;
        }
        
        return U.substring(minindex, minindex + N);
    }
    
    private static boolean checkNormalDict(String u, int pointer1, int pointer2, int N) {
        for (int i = 0; i < N; i++) {
            if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                return true;
            } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                return false;
            }
        }
        return false;
    }
}

