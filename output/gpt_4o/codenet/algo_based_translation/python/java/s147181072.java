
import java.util.Scanner;

public class s147181072 {
    public static void main(String[] args) {
        processInput();
    }

    public static void processInput() {
        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();
        System.out.println(swapCase(user_input));
        scanner.close();
    }

    public static String swapCase(String input) {
        StringBuilder swapped = new StringBuilder(input.length());
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                swapped.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                swapped.append(Character.toUpperCase(c));
            } else {
                swapped.append(c);
            }
        }
        return swapped.toString();
    }
}

