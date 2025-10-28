
import java.util.Arrays;
import java.util.Scanner;

public class s683277023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int[] li = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(li);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += li[i];
        }
        System.out.println(sum);
    }
}

