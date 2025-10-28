
import java.util.Scanner;

public class s960572618 {
    public static void checkEquality() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        userInput = userInput.trim();
        String[] inputs = userInput.split("\\s+");
        if (inputs.length != 3) {
            System.out.println("Invalid input. Expected three values.");
            return;
        }
        String a = inputs[0];
        String b = inputs[1];
        String c = inputs[2];
        if (a.equals(b) && b.equals(c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        checkEquality();
    }
}

