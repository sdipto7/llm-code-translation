
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        List<Integer> nList = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String x : input) {
            nList.add(Integer.parseInt(x));
        }

        int[] n = nList.stream().mapToInt(i -> i).toArray();

        int a = 1;
        int pos = 0;

        for (int i = 1; i < N; i++) {
            if (n[pos] > n[i]) {
                a++;
                pos = i;
            }
        }

        System.out.println(a);

        scanner.close();
    }
}

