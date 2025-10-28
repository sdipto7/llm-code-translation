
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        Arrays.sort(lst);
        reverse(lst);
        int od = 0;
        for (int i : lst) {
            if ((i & 1) == 1) {
                od++;
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i : lst) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                if (ok || od > 1) {
                    sum += i;
                    od--;
                    ok = !ok;
                }
            }
        }
        System.out.println(sum);
    }

    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}

