
import java.util.Scanner;

public class s694958625 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = calculateModulo(x, a, b);
        System.out.println(result);
    }

    public static int calculateModulo(int x, int a, int b) {
        return (x - a) % b;
    }
}

