
import java.util.Scanner;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[] cumsum = new int[n];
        for (int i = 1; i < n; i++) {
            cumsum[i] = cumsum[i - 1];
            if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') {
                cumsum[i]++;
            }
        }
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(cumsum[r - 1] - cumsum[l - 1]);
        }
    }
}

