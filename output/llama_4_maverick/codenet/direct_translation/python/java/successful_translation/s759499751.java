
import java.util.Scanner;

public class s759499751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nk = sc.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        char[] a = sc.nextLine().toCharArray();
        int[] c = new int[n];
        for (int i = 1; i < n; i++) {
            if (a[i] == 'C' && a[i - 1] == 'A') {
                c[i] = c[i - 1] + 1;
            } else {
                c[i] = c[i - 1];
            }
        }
        for (int w = 0; w < k; w++) {
            String[] lr = sc.nextLine().split(" ");
            int l = Integer.parseInt(lr[0]);
            int r = Integer.parseInt(lr[1]);
            System.out.println(c[r - 1] - c[l - 1]);
        }
    }
}

