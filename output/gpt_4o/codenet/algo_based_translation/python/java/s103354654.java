
import java.util.Scanner;

public class s103354654 {

    public static String checkCirclePosition(int W, int H, int x, int y, int r) {
        if (x >= r && (W - r) >= x) {
            if (y >= r && (H - r) >= y) {
                return "Yes";
            } else {
                return "No";
            }
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.close();

        String result = checkCirclePosition(W, H, x, y, r);
        System.out.println(result);
    }
}

