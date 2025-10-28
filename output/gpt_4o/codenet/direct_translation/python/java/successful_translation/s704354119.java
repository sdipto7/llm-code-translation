
import java.util.Scanner;

public class s704354119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] l = scanner.nextLine().split(" ");
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(l[i]);
            sum += current;
            if (max < current) {
                max = current;
            }
            if (min > current) {
                min = current;
            }
        }
        System.out.println(min + " " + max + " " + sum);
    }
}

