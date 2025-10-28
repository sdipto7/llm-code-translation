
import java.util.Scanner;

public class codeforces_67_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String[] mValues = scanner.nextLine().split(" ");
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = Integer.parseInt(mValues[i]);
        }
        int unusedM = 0;
        for (int j = 0; j < n; j++) {
            int p;
            for (p = 0; p < n; p++) {
                if (m[p] == 0) {
                    System.out.print((p + 1) + " ");
                    break;
                }
            }
            for (int l = 0; l < p + 1 - k; l++) {
                m[l]--;
            }
            m[p]--;
        }
    }
}

