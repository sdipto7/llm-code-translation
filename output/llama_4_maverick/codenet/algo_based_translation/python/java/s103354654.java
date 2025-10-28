
import java.util.Scanner;

public class s103354654 {
    public static String isCircleInsideRectangle(int width, int height, int centerX, int centerY, int radius) {
        if (centerX >= radius && (width - radius) >= centerX) {
            if (centerY >= radius && (height - radius) >= centerY) {
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
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int centerX = scanner.nextInt();
        int centerY = scanner.nextInt();
        int radius = scanner.nextInt();
        System.out.println(isCircleInsideRectangle(width, height, centerX, centerY, radius));
    }
}

