
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class codeforces_459_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String given = scanner.nextLine();
        scanner.close();
        
        String result = processCoordinates(given);
        System.out.println(result);
    }

    public static String processCoordinates(String given) {
        List<Integer> l1 = new ArrayList<>();
        for (String s : given.split(" ")) {
            l1.add(Integer.parseInt(s));
        }

        int x1 = l1.get(0);
        int y1 = l1.get(1);
        int x2 = l1.get(2);
        int y2 = l1.get(3);

        int denominator = x2 - x1;
        int numerator = y2 - y1;
        Double quotient = null;

        if (denominator != 0) {
            quotient = (double) numerator / denominator;
        }

        if (numerator == 0) {
            int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            int x4 = x1;
            int x3 = x2;
            int y3 = y2 + d;
            int y4 = y1 + d;
            return String.format("%d %d %d %d", x3, y3, x4, y4);
        } else if (denominator == 0) {
            int y4 = y2;
            int y3 = y1;
            int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            int x4 = x1 + d;
            int x3 = x2 + d;
            return String.format("%d %d %d %d", x3, y3, x4, y4);
        } else if (quotient != null && quotient == 1) {
            int x4 = x2;
            int x3 = x1;
            int y4 = y1;
            int y3 = y2;
            return String.format("%d %d %d %d", x3, y3, x4, y4);
        } else if (quotient != null && quotient == -1) {
            int x4 = x1;
            int x3 = x2;
            int y4 = y2;
            int y3 = y1;
            return String.format("%d %d %d %d", x3, y3, x4, y4);
        } else {
            return "-1";
        }
    }
}

