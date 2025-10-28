import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_146_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        List<Integer> number = new ArrayList<>();
        for (char c : input.toCharArray()) {
            number.add(c - '0');
        }
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (number.get(i) != 4 && number.get(i) != 7) {
                System.out.println("NO");
                x += 1;
                break;
            }
            if (i < n / 2) {
                h1 += number.get(i);
            } else {
                h2 += number.get(i);
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
