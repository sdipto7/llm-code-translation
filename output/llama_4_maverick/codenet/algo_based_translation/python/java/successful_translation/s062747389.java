
import java.util.Scanner;

public class s062747389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int result = (a == b) ? (a + b) : (Math.max(a, b) * 2 - 1);
        System.out.println(result);
        scanner.close();
    }
}

