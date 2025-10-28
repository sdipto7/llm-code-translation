
import java.util.Scanner;

public class s151217193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int G = scanner.nextInt();
        int result = G * 2 - R;
        System.out.println(result);
        scanner.close();
    }
}

