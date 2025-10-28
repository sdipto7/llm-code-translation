
import java.util.Scanner;

public class s952264435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        String[] inputValues = scanner.nextLine().split(" ");
        int A_sum = 0;
        for (String s : inputValues) {
            A_sum += Integer.parseInt(s);
        }
        int result = N - A_sum;
        System.out.println(result >= 0 ? result : "-1");
    }
}

