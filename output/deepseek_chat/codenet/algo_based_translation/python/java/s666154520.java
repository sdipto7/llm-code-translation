
import java.util.Scanner;

public class s666154520 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while (i < 100000) {
            if (i * i > n) {
                int result = (i - 1) * (i - 1);
                System.out.println(result);
                return;
            }
            i++;
        }
    }
}

