
import java.util.Scanner;

public class s316832655 {

    public static int calculateTriangleArea(String inputs) {
        String[] parts = inputs.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        // int c = Integer.parseInt(parts[2]); // Not used in calculation
        return (int)((a * b) / 2.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int area = calculateTriangleArea(input);
        System.out.println(area);
    }
}

