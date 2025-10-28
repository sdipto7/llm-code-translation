
import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = calculateSquarePoints(input);
        System.out.println(result);
    }

    public static String calculateSquarePoints(String inputStr) {
        String[] p = inputStr.split(" ");
        int x1 = Integer.parseInt(p[0]);
        int y1 = Integer.parseInt(p[1]);
        int x2 = Integer.parseInt(p[2]);
        int y2 = Integer.parseInt(p[3]);
        
        int dif1 = x2 - x1;
        int dif2 = y2 - y1;
        
        int x3 = x2 - dif2;
        int y3 = y2 + dif1;
        int x4 = x1 - dif2;
        int y4 = y1 + dif1;
        
        return x3 + " " + y3 + " " + x4 + " " + y4;
    }
}

