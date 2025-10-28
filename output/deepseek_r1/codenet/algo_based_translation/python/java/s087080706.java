
import java.util.Scanner;

public class s087080706 {
    private static int bisectRight(int[] a, int x) {
        int low = 0;
        int high = a.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (x < a[mid]) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.nextLine();
        String[] aInput = scanner.nextLine().split(" ");
        int[] a = new int[aInput.length];
        for (int i = 0; i < aInput.length; i++) {
            a[i] = Integer.parseInt(aInput[i]);
        }
        int insertionPoint = bisectRight(a, x);
        System.out.println(Math.min(insertionPoint, a.length - insertionPoint));
    }
}

