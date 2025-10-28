
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s537584449 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        func(a);
    }

    public static void func(int a) {
        List<Integer> digits = new ArrayList<>();
        int temp = a;
        while (temp != 0) {
            digits.add(temp % 10);
            temp = temp / 10;
        }
        int result = 0;
        for (int digit : digits) {
            result += digit;
        }
        if (result == 1) {
            System.out.println("10");
        } else {
            System.out.println(result);
        }
    }
}

