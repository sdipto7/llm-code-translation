
import java.util.Scanner;

public class s031917494 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        System.out.println(generateChristmasEveMessage(day));
        scanner.close();
    }

    public static String generateChristmasEveMessage(int day) {
        int difference = Math.abs(day - 25);
        StringBuilder message = new StringBuilder("Christmas");
        for (int i = 0; i < difference; i++) {
            message.append(" Eve");
        }
        return message.toString();
    }
}

