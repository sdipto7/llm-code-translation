
import java.util.Scanner;

public class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);
        for (int i = 2; i <= 12; i++) {
            System.out.println((int) (Math.pow(r, i - 1) * (x + (double) D / (1 - r)) - (double) D / (1 - r)));
        }
    }
}

