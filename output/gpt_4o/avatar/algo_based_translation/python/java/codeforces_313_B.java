
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_313_B {
    public static void main(String[] args) {
        processStringAndQueries();
    }

    public static void processStringAndQueries() {
        Scanner scanner = new Scanner(System.in);

        String soz;
        soz = scanner.next();

        int[] a = new int[soz.length() + 1];

        for (int i = 1; i < soz.length(); i++) {
            a[i] = a[i - 1];
            if (soz.charAt(i - 1) == soz.charAt(i)) {
                a[i] += 1;
            }
        }

        int n;
        n = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int m, l;
            m = scanner.nextInt();
            l = scanner.nextInt();

            int result;
            result = a[l - 1] - a[m - 1];
            arr.add(result);
        }

        for (int res : arr) {
            System.out.println(res);
        }

        scanner.close();
    }
}

