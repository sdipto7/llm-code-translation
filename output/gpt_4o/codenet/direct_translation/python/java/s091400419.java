
import java.util.Scanner;

public class s091400419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] lst = {a + b, a - b, a * b};
        int max = lst[0];
        for (int i = 1; i < lst.length; i++) {
            if (lst[i] > max) {
                max = lst[i];
            }
        }
        System.out.println(max);
    }
}

