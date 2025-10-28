
import java.util.Scanner;

public class s419623944 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int R = Integer.parseInt(inputs[1]);
        System.out.println(calculateResult(N, R));
    }

    public static int calculateResult(int N, int R) {
        if (N >= 10) {
            return R;
        } else {
            return R + 100 * (10 - N);
        }
    }
}

