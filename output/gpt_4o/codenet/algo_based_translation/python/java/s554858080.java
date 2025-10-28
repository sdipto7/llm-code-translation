
import java.util.Scanner;

public class s554858080 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        System.out.println(isDivisibleBy4(inputData));
        scanner.close();
    }

    public static String isDivisibleBy4(String inputData) {
        String[] inputList = inputData.split(" ");
        StringBuilder numBuilder = new StringBuilder();

        for (String part : inputList) {
            numBuilder.append(part);
        }

        String num = numBuilder.toString();

        if (Integer.parseInt(num) % 4 == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

