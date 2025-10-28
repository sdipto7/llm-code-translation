
import java.util.Scanner;
public class atcoder_ABC089_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextLine();
        }
        char[] march = {'M', 'A', 'R', 'C', 'H'};
        int[] march_lis = new int[5];
        for (String s : S) {
            char c = Character.toUpperCase(s.charAt(0));
            for (int i = 0; i < march.length; i++) {
                if (c == march[i]) {
                    march_lis[i]++;
                    break;
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

