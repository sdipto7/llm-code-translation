
import java.util.*;

public class codeforces_299_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a);
        boolean any = false;
        for (int num : a) {
            if (num % a[0] != 0) {
                any = true;
                break;
            }
        }
        System.out.println(any ? -1 : a[0]);
    }
}

