
import java.util.Scanner;

public class s103354654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().trim().split("\\s+");
        int W = Integer.parseInt(inputs[0]);
        int H = Integer.parseInt(inputs[1]);
        int x = Integer.parseInt(inputs[2]);
        int y = Integer.parseInt(inputs[3]);
        int r = Integer.parseInt(inputs[4]);
        System.out.println(checkCirclePosition(W, H, x, y, r));
    }

    public static String checkCirclePosition(int W, int H, int x, int y, int r) {
        if (x >= r && x <= W - r) {
            if (y >= r && y <= H - r) {
                return "Yes";
            } else {
                return "No";
            }
        } else {
            return "No";
        }
    }
}

