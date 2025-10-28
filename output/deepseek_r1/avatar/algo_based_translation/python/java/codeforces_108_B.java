
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_108_B {
    public static String s() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        int[] a = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            a[i] = Integer.parseInt(parts[i]);
        }
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1] && a[i] < 2 * a[i - 1]) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(s());
    }
}

