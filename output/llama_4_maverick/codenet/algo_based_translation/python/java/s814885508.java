
import java.util.Scanner;

public class s814885508 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int X = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);
        int D = Integer.parseInt(inputs[2]);

        int r = X / D;
        if (Math.abs(r) > K) {
            System.out.println(Math.abs(X) - K * D);
            System.exit(0);
        }
        int a = X - r * D;
        if ((K - r) % 2 == 0) {
            System.out.println(Math.abs(a));
        } else {
            System.out.println(Math.abs(D - a));
        }
    }
}

