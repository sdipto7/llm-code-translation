
import java.util.Scanner;

public class s316832655 {
    public static int calculateTriangleArea(int a, int b) {
        return (a * b) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[1]);
        int c = Integer.parseInt(values[2]);
        int result = calculateTriangleArea(a, b);
        System.out.println(result);
        scanner.close();
    }
}

