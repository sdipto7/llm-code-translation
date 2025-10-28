
import java.util.Scanner;

public class s797394058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = 1;
        int[] N_list = new int[N];
        for (int i = 0; i < N; i++) {
            N_list[i] = i + 1;
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

