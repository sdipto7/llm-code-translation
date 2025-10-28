
import java.util.Scanner;

public class codeforces_203_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int x = Integer.parseInt(inputs[0]);
        int t = Integer.parseInt(inputs[1]);
        int a = Integer.parseInt(inputs[2]);
        int b = Integer.parseInt(inputs[3]);
        int da = Integer.parseInt(inputs[4]);
        int db = Integer.parseInt(inputs[5]);

        if (x == 0) {
            System.out.println("YES");
            return;
        }

        int a_time = Math.min(a / da, t - 1);
        int b_time = Math.min(b / db, t - 1);

        boolean resultFound = false;
        for (int i = 0; i <= a_time; i++) {
            for (int j = 0; j <= b_time; j++) {
                if ((a - da * i) == x || (b - db * j) == x || (a - da * i) + (b - db * j) == x) {
                    System.out.println("YES");
                    resultFound = true;
                    break;
                }
            }
            if (resultFound) {
                break;
            }
        }

        if (!resultFound) {
            System.out.println("NO");
        }
    }
}

