
import java.util.Scanner;

public class s062747389 {

    public static int calculateSumOrExpression(String inputStr) {
        String[] parts = inputStr.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        if (a == b) {
            return a + b;
        } else {
            return Math.max(a, b) * 2 - 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int result = calculateSumOrExpression(inputStr);
        System.out.println(result);
        scanner.close();
    }
}

