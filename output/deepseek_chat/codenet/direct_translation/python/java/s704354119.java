
import java.util.Scanner;

public class s704354119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] l = scanner.nextLine().trim().split(" ");
        int max = -Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(l[i]);
            sum += num;
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.println(min + " " + max + " " + sum);
    }
}

