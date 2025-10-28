
import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            abc[i] = Integer.parseInt(input[i]);
        }
        int count5 = 0;
        for (int num : abc) {
            if (num == 5) count5++;
        }
        if (count5 == 2) {
            int sum = 0;
            for (int num : abc) sum += num;
            System.out.println(sum == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}

