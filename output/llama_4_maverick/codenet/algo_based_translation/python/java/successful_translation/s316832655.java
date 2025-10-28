
import java.util.Scanner;

public class s316832655 {
    public static void main(String[] args) {
        calculateArea();
    }

    public static void calculateArea() {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);
        c = Integer.parseInt(input[2]);
        double area = (double) (a * b) / 2;
        int result = (int) area;
        System.out.println(result);
        scanner.close();
    }
}

