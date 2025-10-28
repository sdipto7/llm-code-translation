
import java.util.Scanner;

public class s537584449 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        func(a);
    }

    public static void func(int a) {
        int[] digits = new int[(int) Math.log10(a) + 1];
        int temp = a;
        int i = 0;
        while (temp != 0) {
            digits[i++] = temp % 10;
            temp /= 10;
        }
        int result = 0;
        for (int j = 0; j < i; j++) {
            result += digits[j];
        }
        if (result == 1) {
            System.out.println(10);
        } else {
            System.out.println(result);
        }
    }
}

