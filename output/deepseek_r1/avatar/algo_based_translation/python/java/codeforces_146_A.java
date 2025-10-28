
import java.util.Scanner;

public class codeforces_146_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String numberStr = scanner.nextLine();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        int h1 = 0, h2 = 0, x = 0;
        for (int i = 0; i < n; i++) {
            if (number[i] != 4 && number[i] != 7) {
                System.out.println("NO");
                x = 1;
                break;
            }
            if (i < n / 2) {
                h1 += number[i];
            } else {
                h2 += number[i];
            }
        }
        if (x == 0) {
            System.out.println(h1 == h2 ? "YES" : "NO");
        }
        scanner.close();
    }
}

