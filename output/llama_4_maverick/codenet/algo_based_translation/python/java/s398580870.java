
import java.util.Scanner;

public class s398580870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        System.out.println(calculateResult(n, k));
    }

    public static int calculateResult(int n, int k) {
        if (k % 2 == 1) {
            return (int) Math.pow(n / k, 3);
        } else {
            return (int) Math.pow(n / k, 3) + (int) Math.pow((n + k / 2) / k, 3);
        }
    }
}

