
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_583_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        while (counter < n) {
            counterTurns += 1;
            for (int i = 0; i < n; i++) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter += 1;
                    a[i] = -1;
                }
            }
            for (int i = 0; i < n / 2; i++) {
                int temp = a[i];
                a[i] = a[n - i - 1];
                a[n - i - 1] = temp;
            }
        }
        System.out.println(counterTurns);
    }
}

