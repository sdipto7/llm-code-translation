
import java.util.Scanner;

public class s539244923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        int result = calculateResult(n, k);
        System.out.println(result);
    }

    public static int calculateResult(int n, int k) {
        if (k % n == 0) {
            return n + k;
        } else {
            return k - n;
        }
    }
}

