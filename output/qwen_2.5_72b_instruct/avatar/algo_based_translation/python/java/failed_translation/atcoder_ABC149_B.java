
import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] cookies = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            cookies[i] = Integer.parseInt(parts[i]);
        }
        int leftOver = cookies[0] - cookies[2];
        int takahashi = Math.max(0, leftOver);
        String result;
        if (takahashi > 0) {
            result = takahashi + " " + cookies[1];
        } else {
            int value = Math.max(0, cookies[1] - Math.abs(leftOver));
            result = takahashi + " " + value;
        }
        System.out.println(result);
    }
}

