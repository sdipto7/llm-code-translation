
import java.util.*;
import java.io.*;

public class atcoder_ABC089_C {
    static int INF = Integer.MAX_VALUE;
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextLine();
        }
        String[] march = { "M", "A", "R", "C", "H" };
        int[] march_lis = new int[5];
        for (String s : S) {
            char firstChar = s.toUpperCase().charAt(0);
            for (int i = 0; i < march.length; i++) {
                if (firstChar == march[i].charAt(0)) {
                    march_lis[i]++;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += (long) march_lis[i] * march_lis[j] * march_lis[k];
                }
            }
        }
        System.out.println(ans);
    }
}

