
import java.util.Scanner;

public class s592421258 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputReader I = new InputReader(scanner);
        String s = I.readInput().repeat(2);
        boolean contains = s.contains(I.readInput());
        System.out.println(contains ? "Yes" : "No");
    }
}

class InputReader {
    private final Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readInput() {
        return scanner.nextLine().trim();
    }
}

