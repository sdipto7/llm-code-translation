
import java.util.Scanner;

public class s441028271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int k = Integer.parseInt(input[3]);
        System.out.println(calculateDifference(a, b, c, k));
    }

    public static int calculateDifference(int a, int b, int c, int k) {
        if (k % 2 == 0) {
            return a - b;
        } else {
            return b - a;
        }
    }
}

