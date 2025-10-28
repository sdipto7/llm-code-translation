
import java.util.Scanner;

public class s031917494 {
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int calculateDifference(int inputValue, int targetValue) {
        return Math.abs(inputValue - targetValue);
    }

    public static String generateOutputString(int diff) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < diff; i++) {
            sb.append(" Eve");
        }
        return "Christmas" + sb.toString();
    }

    public static void main(String[] args) {
        int userInput = getUserInput();
        int diff = calculateDifference(userInput, 25);
        String outputString = generateOutputString(diff);
        System.out.println(outputString);
    }
}

