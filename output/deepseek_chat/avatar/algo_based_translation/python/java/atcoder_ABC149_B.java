import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] cookies = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int leftOver = cookies[0] - cookies[2];
        int takahashi = Math.max(0, leftOver);
        if (takahashi > 0) {
            System.out.println(takahashi + " " + cookies[1]);
        } else {
            int remaining = Math.max(0, cookies[1] - Math.abs(leftOver));
            System.out.println(takahashi + " " + remaining);
        }
    }
}
