
import java.util.Scanner;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] parts = sc.nextLine().split(" ");
        int[] a = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            a[i] = Integer.parseInt(parts[i]);
        }
        int total = 0;
        for (int num : a) {
            total ^= num;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : a) {
            sb.append((num ^ total) + " ");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        System.out.println(sb.toString());
    }
}

