
import java.util.*;

public class s777789287 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        Integer[] a = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a, Collections.reverseOrder());
        double sum = 0;
        for (int num : a) {
            sum += num;
        }
        double s = sum / (4.0 * m);
        if (a[m - 1] >= s) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

