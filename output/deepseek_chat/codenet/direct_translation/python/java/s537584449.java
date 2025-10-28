import java.util.Scanner;

public class s537584449 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        func(a);
    }

    public static void func(int a) {
        int[] digits = new int[10];
        int temp = a;
        int index = 0;
        while (temp != 0) {
            digits[index++] = temp % 10;
            temp = temp / 10;
        }
        int result = 0;
        for (int i = 0; i < index; i++) {
            result += digits[i];
        }
        if (result == 1) {
            System.out.println("10");
        } else {
            System.out.println(result);
        }
    }
}
