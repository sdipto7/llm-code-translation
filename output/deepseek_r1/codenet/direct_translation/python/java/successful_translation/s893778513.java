
import java.util.Scanner;

public class s893778513 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (String part : parts) {
            int num = Integer.parseInt(part);
            sum += num;
            if (num > max) max = num;
        }
        System.out.println(max < sum - max ? "Yes" : "No");
    }
}

