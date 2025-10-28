
import java.util.Scanner;

public class s147181072 {
    public static void main(String[] args) {
        String userInput = readInput();
        String swappedCase = swapCase(userInput);
        printOutput(swappedCase);
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String swapCase(String inputStr) {
        return inputStr.chars()
                .map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
                .collect(StringBuilder::new,
                        (sb, c) -> sb.append((char) c),
                        StringBuilder::append)
                .toString();
    }

    public static void printOutput(String outputStr) {
        System.out.println(outputStr);
    }
}

