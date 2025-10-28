
import java.util.Scanner;

public class s759499751 {
    public static void countPairs(int n, int k, char[] a) {
        int[] c = new int[n];
        for (int i = 1; i < n; i++) {
            if (a[i] == 'C' && a[i - 1] == 'A') {
                c[i] = c[i - 1] + 1;
            } else {
                c[i] = c[i - 1];
            }
        }
        for (int i = 0; i < k; i++) {
            Scanner scanner = new Scanner(System.in);
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.println(c[r - 1] - c[l - 1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine(); 
        String str = scanner.nextLine();
        char[] a = str.toCharArray();
        countPairs(n, k, a);
    }
}

