
import java.util.Scanner;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }
        int minVal = a[0];
        for (int num : a) {
            if (num < minVal) {
                minVal = num;
            }
        }
        int result = (int) Math.ceil((double) n / minVal) + 4;
        System.out.println(result);
    }
}

