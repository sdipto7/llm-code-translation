
import java.util.Scanner;

public class s537584449 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        func(a);
    }

    public static void func(int a) {
        int temp = a;
        int sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(sum == 1 ? "10" : sum);
    }
}

