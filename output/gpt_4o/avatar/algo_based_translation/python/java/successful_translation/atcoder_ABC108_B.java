
import java.util.Scanner;

public class atcoder_ABC108_B {

    public static String calculateCoordinates(String inputStr) {
        String[] p = inputStr.split(" ");
        int x1 = Integer.parseInt(p[0]);
        int y1 = Integer.parseInt(p[1]);
        int x2 = Integer.parseInt(p[2]);
        int y2 = Integer.parseInt(p[3]);

        int DIF1 = x2 - x1;
        int DIF2 = y2 - y1;

        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;

        return x3 + " " + y3 + " " + x4 + " " + y4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = calculateCoordinates(input);
        System.out.println(result);
    }
}

