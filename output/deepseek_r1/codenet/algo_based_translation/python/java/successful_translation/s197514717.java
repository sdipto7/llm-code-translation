
import java.util.Scanner;

public class s197514717 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputParts = scanner.nextLine().split("\\s+");
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            ABC[i] = Integer.parseInt(inputParts[i]);
        }
        int A = ABC[0];
        int B = ABC[1];
        int C = ABC[2];
        int computed1 = 10 * A + B + C;
        int computed2 = 10 * B + C + A;
        int computed3 = 10 * C + A + B;
        int maxResult = Math.max(computed1, Math.max(computed2, computed3));
        System.out.println(maxResult);
    }
}

