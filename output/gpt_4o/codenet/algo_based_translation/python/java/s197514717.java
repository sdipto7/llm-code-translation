
import java.util.Scanner;

public class s197514717 {
    public static void main(String[] args) {
        calculateMaximumValue();
    }

    public static void calculateMaximumValue() {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        int[] ABC = new int[3];
        
        for (int i = 0; i < 3; i++) {
            ABC[i] = Integer.parseInt(values[i]);
        }
        
        int A = ABC[0];
        int B = ABC[1];
        int C = ABC[2];
        
        int value1 = 10 * A + B + C;
        int value2 = 10 * B + C + A;
        int value3 = 10 * C + A + B;
        
        int maxValue = Math.max(value1, Math.max(value2, value3));
        
        System.out.println(maxValue);
        
        scanner.close();
    }
}

