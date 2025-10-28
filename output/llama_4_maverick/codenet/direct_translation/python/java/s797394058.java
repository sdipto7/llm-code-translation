
import java.util.Scanner;

public class s797394058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] N_list = new int[N];
        for (int i = 0; i < N; i++) {
            N_list[i] = i + 1;
        }
        int count = (int) Math.pow(N, 3);
        System.out.println(count);
    }
}

