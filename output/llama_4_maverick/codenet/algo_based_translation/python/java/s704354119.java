
import java.util.Scanner;

public class s704354119 {
    public static void main(String[] args) {
        process_input();
    }

    public static void process_input() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] l = scanner.nextLine().split(" ");
        long max = (long) -1e9;
        long min = (long) 1e9;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(l[i]);
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min + " " + max + " " + sum);
        scanner.close();
    }
}

