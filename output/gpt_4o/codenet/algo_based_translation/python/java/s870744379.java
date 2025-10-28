
import java.util.Scanner;

public class s870744379 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = determineLabel(n);
        System.out.println(result);
    }

    public static String determineLabel(int n) {
        if (n >= 1000) {
            return "ABD";
        } else {
            return "ABC";
        }
    }
}

