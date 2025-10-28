
import java.util.Scanner;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] n = new int[N];
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            n[i] = Integer.parseInt(input[i]);
        }
        int a = 1;
        int pos = 0;
        for (int i = 1; i < N; i++) {
            if (n[pos] > n[i]) {
                a++;
                pos = i;
            }
        }
        System.out.println(a);
    }
}

