
import java.util.Scanner;

public class codeforces_581_A {

    public static void main(String[] args) {
        Tuple result = calculateMinMaxDifference();
        System.out.println(result.minValue + " " + result.difference);
    }

    public static Tuple calculateMinMaxDifference() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int minValue = Math.min(a, b);
        int maxValue = Math.max(a, b);
        int difference = (maxValue - minValue) / 2;
        scanner.close();
        return new Tuple(minValue, difference);
    }

    static class Tuple {
        int minValue;
        int difference;

        Tuple(int minValue, int difference) {
            this.minValue = minValue;
            this.difference = difference;
        }
    }
}

