
import java.util.Scanner;

public class s142939923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int[] x = new int[3];
        x[0] = a + b;
        x[1] = a - b;
        x[2] = a * b;

        int max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }

        System.out.println(max);
        scanner.close();
    }
}

