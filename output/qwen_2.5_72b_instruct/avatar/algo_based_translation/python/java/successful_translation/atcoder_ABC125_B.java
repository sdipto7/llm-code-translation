
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> V = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int ans = 0;
        int X = 0;
        int Y = 0;

        for (int i = 0; i < N; i++) {
            V.add(scanner.nextInt());
        }
        for (int i = 0; i < N; i++) {
            C.add(scanner.nextInt());
        }

        list.add(0);

        for (int i = 0; i < N; i++) {
            if (V.get(i) - C.get(i) > 0) {
                X = V.get(i);
                Y = C.get(i);
                list.add(X - Y);
            }
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        System.out.println(sum);
        scanner.close();
    }
}

