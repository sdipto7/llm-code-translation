
import java.util.Scanner;

public class s831456551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int result = A * B;
        System.out.println(result);
        scanner.close();
    }
}

