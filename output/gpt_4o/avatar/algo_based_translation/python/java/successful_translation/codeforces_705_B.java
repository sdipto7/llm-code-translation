
import java.util.Scanner;

public class codeforces_705_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        int[] w = new int[n];
        for (int j = 0; j < n; j++) {
            w[j] = Integer.parseInt(input[j]);
        }
        int c = 2;

        for (int i : w) {
            if (i == 1) {
                System.out.println(c);
            } else if (i % 2 == 0) {
                c = 3 - c;
                System.out.println(c);
            } else {
                System.out.println(c);
            }
        }
        scanner.close();
    }
}

