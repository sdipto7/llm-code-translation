
import java.util.Scanner;

public class s704354119 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String[] l = scanner.nextLine().split(" ");
        
        int[] results = calculateMinMaxSum(n, l);
        System.out.println(results[0] + " " + results[1] + " " + results[2]);
    }

    public static int[] calculateMinMaxSum(int n, String[] l) {
        int max = (int) -1e9;
        int min = (int) 1e9;
        int sum = 0;

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
        
        return new int[] { min, max, sum };
    }
}

