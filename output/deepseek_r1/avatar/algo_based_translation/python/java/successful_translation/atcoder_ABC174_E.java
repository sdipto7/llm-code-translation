
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC174_E {
    public static boolean check(List<Integer> lis, int k, int mid) {
        int currentK = k;
        for (int num : lis) {
            if (num % mid == 0) {
                currentK++;
            }
            currentK -= num / mid;
        }
        return currentK >= 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String[] parts = sc.nextLine().split(" ");
        List<Integer> lis = new ArrayList<>();
        for (String part : parts) {
            lis.add(Integer.parseInt(part));
        }

        int a = 1;
        int b = Integer.MIN_VALUE;
        for (int num : lis) {
            if (num > b) {
                b = num;
            }
        }
        int ans = b;

        while (a <= b) {
            int mid = a + (b - a) / 2;
            if (check(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}

