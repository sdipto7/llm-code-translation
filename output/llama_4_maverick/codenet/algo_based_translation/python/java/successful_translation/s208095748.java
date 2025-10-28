
import java.util.Scanner;

public class s208095748 {
    public static void main(String[] args) {
        System.out.println(calculateResult());
    }

    public static int calculateResult() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        scanner.close();

        if (B < C) {
            return 0;
        } else if (A * C < B) {
            return C;
        } else {
            return B / A;
        }
    }
}

