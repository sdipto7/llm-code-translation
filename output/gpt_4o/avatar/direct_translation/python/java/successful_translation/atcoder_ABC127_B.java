
import java.util.Scanner;

public class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int D = input.nextInt();
        int x = input.nextInt();

        for (int i = 2; i < 12; i++) {
            System.out.println((int) (Math.pow(r, i - 1) * (x + D / (1.0 - r)) - D / (1.0 - r)));
        }
    }
}

