import java.util.Scanner;

public class codeforces_67_B {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int n = u.nextInt();
        int k = u.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = u.nextInt();
        }
        int m = 0;
        for (int j = 0; j < n; j++) {
            for (int p = 0; p < n; p++) {
                if (M[p] == 0) {
                    System.out.print(p + 1 + " ");
                    break;
                }
            }
            for (int l = 0; l <= p - k && l < n; l++) {
                M[l] -= 1;
            }
            M[p] -= 1;
        }
        u.close();
    }
}
