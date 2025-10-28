
import java.util.Scanner;
import java.util.Arrays;

public class s225615697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] a = Arrays.stream(scanner.nextLine().split(" "))
                       .mapToInt(Integer::parseInt)
                       .toArray();
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += a[i];
            } else {
                sum -= a[i];
            }
        }
        int m1 = sum / 2;
        
        String result = String.valueOf(m1);
        
        int[] m = new int[n];
        m[0] = m1;
        for (int i = 1; i < n; i++) {
            m[i] = a[i - 1] - m[i - 1];
        }
        
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                output.append(" ");
            }
            output.append(m[i] * 2);
        }
        System.out.println(output.toString());
    }
}

