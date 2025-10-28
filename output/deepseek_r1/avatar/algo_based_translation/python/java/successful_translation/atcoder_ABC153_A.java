
import java.util.Scanner;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = calculateSho(h, a);
        System.out.println(sho);
    }

    public static int calculateSho(int h, int a) {
        int sho = h / a;
        int am = h % a;
        if (am != 0) {
            sho++;
        }
        return sho;
    }
}

