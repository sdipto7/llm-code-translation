
import java.util.Scanner;

public class s704354119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] l = scanner.nextLine().split(" ");
        int max = (int) -1e9;
        int min = (int) 1e9;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(l[i]);
            sum += currentNum;
            if (currentNum > max) {
                max = currentNum;
            }
            if (currentNum < min) {
                min = currentNum;
            }
        }
        System.out.println(min + " " + max + " " + sum);
    }
}

