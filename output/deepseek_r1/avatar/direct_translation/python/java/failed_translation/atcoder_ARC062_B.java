
import java.util.Scanner;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        int num_g = 0, num_p = 0, score = 0;
        for (char x : s) {
            if (x == 'g') {
                if (num_g - num_p > 0) {
                    score++;
                    num_p++;
                } else {
                    num_g++;
                }
            } else if (x == 'p') {
                if (num_g - num_p > 0) {
                    num_p++;
                } else {
                    score--;
                    num_g++;
                }
            }
        }
        System.out.println(score);
    }
}

