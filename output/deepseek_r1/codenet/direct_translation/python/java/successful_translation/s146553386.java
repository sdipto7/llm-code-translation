
import java.util.Scanner;

public class s146553386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a0 = new int[n];
        String[] parts = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            a0[i] = Integer.parseInt(parts[i]);
        }
        int[] a1 = new int[n];
        parts = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            a1[i] = Integer.parseInt(parts[n - 1 - i]);
        }
        int[] res0 = new int[n];
        res0[0] = a0[0];
        for (int i = 1; i < n; i++) {
            res0[i] = res0[i - 1] + a0[i];
        }
        int[] res1 = new int[n];
        res1[0] = a1[0];
        for (int i = 1; i < n; i++) {
            res1[i] = res1[i - 1] + a1[i];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int check = res0[i] + res1[n - 1 - i];
            ans = Math.max(ans, check);
        }
        System.out.println(ans);
    }
}

