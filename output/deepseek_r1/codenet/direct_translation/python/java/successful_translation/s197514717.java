
import java.util.Scanner;

public class s197514717 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int C = Integer.parseInt(inputs[2]);
        int max1 = 10 * A + B + C;
        int max2 = 10 * B + C + A;
        int max3 = 10 * C + A + B;
        System.out.println(Math.max(max1, Math.max(max2, max3)));
    }
}

