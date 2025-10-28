
import java.util.Scanner;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(parts[i]);
        }
        int a = 1;
        int pos = 0;
        for (int i = 1; i < N; i++) {
            if (array[pos] > array[i]) {
                a++;
                pos = i;
            }
        }
        System.out.println(a);
    }
}

