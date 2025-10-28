
import java.util.Scanner;

public class s708549466 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int x = Integer.parseInt(inputs[1]);
        String[] nums = scanner.nextLine().split(" ");
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(nums[i]);
        }
        int cnt = 0;
        for (int i = 1; i < N; i++) {
            int tmp = a[i - 1] + a[i];
            if (tmp > x) {
                if (tmp - x > a[i]) {
                    a[i - 1] = tmp - a[i] - x;
                    a[i] = 0;
                } else {
                    a[i] = a[i] - (tmp - x);
                }
                cnt += tmp - x;
            }
        }
        System.out.println(cnt);
    }
}

