
import java.util.Scanner;

public class s681170949 {
    public static String readInput(Scanner scanner) {
        return scanner.nextLine();
    }

    public static String processInput(String N) {
        String result = "ABC" + N;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = readInput(scanner);
        String output = processInput(N);
        System.out.println(output);
        scanner.close();
    }
}

