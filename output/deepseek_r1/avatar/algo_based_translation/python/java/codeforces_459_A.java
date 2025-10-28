
import java.util.Scanner;

public class codeforces_459_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] coordinates = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(coordinates[0]);
        int y1 = Integer.parseInt(coordinates[1]);
        int x2 = Integer.parseInt(coordinates[2]);
        int y2 = Integer.parseInt(coordinates[3]);

        int denominator = x2 - x1;
        int numerator = y2 - y1;

        if (numerator == 0) {
            int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println(x2 + " " + (y2 + d) + " " + x1 + " " + (y1 + d));
        } else if (denominator == 0) {
            int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println((x2 + d) + " " + y2 + " " + (x1 + d) + " " + y1);
        } else {
            double quotient = (double) numerator / denominator;
            if (quotient == 1.0) {
                System.out.println(x1 + " " + y2 + " " + x2 + " " + y1);
            } else if (quotient == -1.0) {
                System.out.println(x2 + " " + y1 + " " + x1 + " " + y2);
            } else {
                System.out.println(-1);
            }
        }
    }
}

