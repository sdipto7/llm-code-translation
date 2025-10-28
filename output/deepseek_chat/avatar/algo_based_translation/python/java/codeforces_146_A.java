
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_146_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String inputString = scanner.nextLine();
        int[] number = new int[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            number[i] = Character.getNumericValue(inputString.charAt(i));
        }
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (number[i] != 4 && number[i] != 7) {
                System.out.println("NO");
                x++;
                break;
            }
            if (i < n / 2) {
                h1 += number[i];
            } else {
                h2 += number[i];
            }
        }
        if (x == 0) {
            if (h1 == h2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

