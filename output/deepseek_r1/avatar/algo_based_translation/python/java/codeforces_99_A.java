
import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String[] parts = inputStr.split("\\.");
        String integerPart = parts[0];
        String fractionalPart = parts[1];
        int firstFractionalDigit = Integer.parseInt(fractionalPart.substring(0, 1));

        if (integerPart.charAt(integerPart.length() - 1) == '9') {
            System.out.println("GOTO Vasilisa.");
        } else if (firstFractionalDigit < 5) {
            System.out.println(integerPart);
        } else {
            int incrementedValue = Integer.parseInt(integerPart) + 1;
            System.out.println(incrementedValue);
        }
    }
}

