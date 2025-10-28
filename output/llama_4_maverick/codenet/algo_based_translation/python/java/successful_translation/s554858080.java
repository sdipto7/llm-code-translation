
import java.util.Scanner;

public class s554858080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(checkDivisibilityByFour(scanner));
        scanner.close();
    }

    public static String checkDivisibilityByFour(Scanner scanner) {
        String[] inputList = scanner.nextLine().split("\\s+");
        String num = String.join("", inputList);
        int numInt = Integer.parseInt(num);
        return (numInt % 4 == 0) ? "YES" : "NO";
    }
}

