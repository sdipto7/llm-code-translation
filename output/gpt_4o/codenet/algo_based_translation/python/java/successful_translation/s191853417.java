
import java.util.Scanner;

public class s191853417 {

    public static int calculateRemainingScore(String inputString) {
        String[] numbers = inputString.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);
        int d = Integer.parseInt(numbers[3]);
        int e = Integer.parseInt(numbers[4]);
        return 15 - (a + b + c + d + e);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int result = calculateRemainingScore(inputString);
        System.out.println(result);
        scanner.close();
    }
}

