
import java.util.Scanner;
import java.lang.Math;

public class codeforces_459_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String given = scanner.nextLine();
        String[] l1 = given.split(" ");
        int[] l1Int = new int[l1.length];
        for (int i = 0; i < l1.length; i++) {
            l1Int[i] = Integer.parseInt(l1[i]);
        }
        int x1 = l1Int[0];
        int y1 = l1Int[1];
        int x2 = l1Int[2];
        int y2 = l1Int[3];
        int denominator = x2 - x1;
        int numerator = y2 - y1;
        double quotient = 0;
        if (denominator != 0) {
            quotient = (double) numerator / denominator;
        }
        if (numerator == 0) {
            int d = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            int x4 = x1;
            int x3 = x2;
            int y3 = y2 + d;
            int y4 = y1 + d;
            System.out.printf("%d %d %d %d%n", x3, y3, x4, y4);
        } else if (denominator == 0) {
            int y4 = y2;
            int y3 = y1;
            int d = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            int x4 = x1 + d;
            int x3 = x2 + d;
            System.out.printf("%d %d %d %d%n", x3, y3, x4, y4);
        } else if (quotient == 1) {
            int x4 = x2;
            int x3 = x1;
            int y4 = y1;
            int y3 = y2;
            System.out.printf("%d %d %d %d%n", x3, y3, x4, y4);
        } else if (quotient == -1) {
            int x4 = x1;
            int x3 = x2;
            int y4 = y2;
            int y3 = y1;
            System.out.printf("%d %d %d %d%n", x3, y3, x4, y4);
        } else {
            System.out.println("-1");
        }
        scanner.close();
    }
}

