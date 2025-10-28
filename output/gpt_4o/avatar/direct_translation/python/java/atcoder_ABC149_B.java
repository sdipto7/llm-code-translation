
import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] cookies = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            cookies[i] = Integer.parseInt(input[i]);
        }
        int leftOver = cookies[0] - cookies[2];
        int takahashi = Math.max(0, leftOver);
        System.out.print(takahashi + " " + (takahashi > 0 ? cookies[1] : Math.max(0, cookies[1] - Math.abs(leftOver))));
    }
}

