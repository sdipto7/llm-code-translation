
import java.util.Scanner;

public class s858647829 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        System.out.println(check_possible(a, b));
    }

    private static String check_possible(int a, int b) {
        if (a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) {
            return "Possible";
        } else {
            return "Impossible";
        }
    }
}

