
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lambda function equivalent in Java
        int[] na() {
            return Arrays.stream(scanner.nextLine().split(" "))
                         .mapToInt(Integer::parseInt)
                         .toArray();
        }

        int[] firstInput = na();
        int n = firstInput[0];
        int x = firstInput[1];

        int[] a = na();
        Arrays.sort(a);

        int ans = 0;

        if (a[0] > x) {
            System.out.println(0);
            return;
        }

        for (int i : a) {
            if (i > x) {
                x = 0;
                break;
            }
            x -= i;
            ans++;
        }

        if (x != 0) {
            ans--;
        }

        System.out.println(ans);
    }
}

