
import java.util.Scanner;
import java.util.ArrayList;

public class s537584449 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        func(a);
    }
    
    public static void func(int a) {
        ArrayList<Integer> digits = new ArrayList<>();
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

