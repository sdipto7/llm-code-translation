
import java.util.Scanner;

public class s179314665 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int result = calculateProduct(inputStr);
        System.out.println(result);
        scanner.close();
    }

    public static int calculateProduct(String inputStr) {
        String[] numbers = inputStr.split(" ");
        int A = Integer.parseInt(numbers[0]);
        int B = Integer.parseInt(numbers[1]);

        if (A < 10 && B < 10) {
            return A * B;
        } else {
            return -1;
        }
    }
}

