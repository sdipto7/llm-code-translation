
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Arrays.sort(lst);
        for (int i = 0; i < n / 2; i++) {
            int temp = lst[i];
            lst[i] = lst[n - 1 - i];
            lst[n - 1 - i] = temp;
        }
        int od = 0;
        for (int i : lst) {
            if ((i & 1) == 1) {
                od++;
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else {
                if (ok || od > 1) {
                    sum += lst[i];
                    od--;
                    ok = !ok;
                }
            }
        }
        System.out.println(sum);
    }
}

