
import java.util.*;

public class s131946120 {
    public static int readIntegerInput(Scanner scanner) {
        return scanner.nextInt();
    }

    public static String readStringInput(Scanner scanner) {
        return scanner.next();
    }

    public static void printOutput(int output) {
        System.out.println(output);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = readIntegerInput(scanner);
        scanner.nextLine(); // Consume newline left-over
        List<String> inputStrings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputStrings.add(scanner.nextLine());
        }
        Set<String> uniqueStrings = new HashSet<>(inputStrings);
        int uniqueCount = uniqueStrings.size();
        printOutput(uniqueCount);
        scanner.close();
    }
}

