




import java.util.Arrays;
import java.util.Scanner;

public class s087080706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i = Arrays.binarySearch(a, x);
        if (i < 0) {
            i = -i - 1;
        }
        System.out.println(Math.min(i, a.length - i));
    }
}

