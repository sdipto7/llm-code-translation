
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class codeforces_456_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] m = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            m[i][0] = Integer.parseInt(input[0]);
            m[i][1] = Integer.parseInt(input[1]);
        }
        Arrays.sort(m, Comparator.comparingInt((int[] arr) -> arr[0]).reversed());
        int[] a = m[0];
        for (int i = 1; i < n; i++) {
            if (m[i][1] > a[1]) {
                System.out.println("Happy Alex");
                return;
            }
            a = m[i];
        }
        System.out.println("Poor Alex");
    }
}

