
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] lst = new int[n];
        String[] inputs = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            lst[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(lst);
        for (int i = 0; i < n / 2; i++) {
            int temp = lst[i];
            lst[i] = lst[n - 1 - i];
            lst[n - 1 - i] = temp;
        }
        int od = 0;
        for (int num : lst) {
            if (num % 2 != 0) {
                od++;
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int current : lst) {
            if (current % 2 == 0) {
                sum += current;
            } else {
                if (ok || od > 1) {
                    sum += current;
                    od--;
                    ok = !ok;
                }
            }
        }
        System.out.println(sum);
    }
}

