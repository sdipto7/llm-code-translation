
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_108_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] strArray = scanner.nextLine().split(" ");
        int[] a = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            a[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}

