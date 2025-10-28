
import java.util.Scanner;

public class s694958625 {
    public static void main(String[] args) {
        int x = readIntegerInput();
        int a = readIntegerInput();
        int b = readIntegerInput();
        int result = calculateModulo(x, a, b);
        outputResult(result);
    }

    private static int readIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int calculateModulo(int x, int a, int b) {
        return (x - a) % b;
    }

    private static void outputResult(int result) {
        System.out.println(result);
    }
}

