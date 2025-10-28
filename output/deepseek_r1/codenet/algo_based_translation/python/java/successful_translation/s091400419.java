
import java.util.Scanner;

public class s091400419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] lst = {a + b, a - b, a * b};
        int maxValue = Math.max(Math.max(lst[0], lst[1]), lst[2]);
        System.out.println(maxValue);
    }
}

