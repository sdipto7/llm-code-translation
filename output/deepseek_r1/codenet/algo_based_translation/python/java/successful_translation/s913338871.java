
import java.util.Scanner;
import java.util.Arrays;

public class s913338871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(a);
        int sum = 0;
        for (int i = N; i < a.length; i += 2) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}

