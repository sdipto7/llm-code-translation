
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        boolean found = false;
        for (int i : l) {
            if (Arrays.binarySearch(l, i + 1) >= 0 && Arrays.binarySearch(l, i + 2) >= 0) {
                System.out.println("YES");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("NO");
        }
    }
}

